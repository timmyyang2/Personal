package sorting;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class UserInputDialog extends Dialog implements ActionListener {
	
	private TextArea textArea = new TextArea();
	private Button applyButton = new Button("Apply");
	private Button clearButton = new Button("Clear");
	private Button closeButton = new Button("Close");
	
	private String userInput = "";
	private SortingUI sortingUI;
	
	public UserInputDialog(SortingUI sortingUI) {
		super(new Frame(), "User Data Input");
		this.sortingUI = sortingUI;
		init();
	}
	
	private void init() {
		addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we) {
            	setVisible(false);
             }
		});
		
		setBackground(Animation.bgColor);
		setLayout(new BorderLayout());
	
		JLabel title = new JLabel("      Input space delimited numbers between 1 and 200");
		JLabel title2 = new JLabel("       (Type enter as needed)");
		JPanel titlePanel = new JPanel();
		titlePanel.setLayout(new BorderLayout());
		titlePanel.add(title, BorderLayout.CENTER);
		titlePanel.add(title2, BorderLayout.SOUTH);
				
		title.setFont(SortingUI.generalTextFont);
		title2.setFont(SortingUI.generalTextFont);
		titlePanel.setBackground(Animation.bgColor);
		add(titlePanel, BorderLayout.NORTH);  
		
		JPanel textAreaPanel = new JPanel();
		textAreaPanel.setBackground(Animation.bgColor);
		textArea.setFont(SortingUI.generalTextFont);
		textArea.setSize(400, 180);
		textAreaPanel.setLayout(new BorderLayout());
		textAreaPanel.add(new JLabel("   "), BorderLayout.WEST);
		textAreaPanel.add(textArea, BorderLayout.CENTER);
		textAreaPanel.add(new JLabel("   "), BorderLayout.EAST);
		add(textAreaPanel, BorderLayout.CENTER);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBackground(Animation.bgColor);
		applyButton.setFont(SortingUI.generalTextFont);
		clearButton.setFont(SortingUI.generalTextFont);
		closeButton.setFont(SortingUI.generalTextFont);
		buttonPanel.add(applyButton);
		buttonPanel.add(clearButton);
		buttonPanel.add(closeButton);
		applyButton.addActionListener(this);
		clearButton.addActionListener(this);
		closeButton.addActionListener(this);
		add(buttonPanel, BorderLayout.SOUTH);
		
		setSize(450, 250);
		
		SortingUI.centerUIComponent(this);
		setVisible(false);
	}
	
	public void actionPerformed(ActionEvent paramActionEvent) {
		if (paramActionEvent.getSource() == applyButton) {
			boolean done = true;
			String input = textArea.getText();
			String[] tokens = input.split("[ \\n\\r]");
			
			ArrayList<Integer> numbers = new ArrayList<Integer>();
			for(int i=0; i< tokens.length; i++) {
				try {
					if(tokens[i].trim().equals("")) continue;
					int value = Integer.parseInt(tokens[i]);
					if(value <= 200) {
						numbers.add(value);
					}else {
						JOptionPane.showMessageDialog(null, "Enter numbers between 0 and 200 for better display.", "User Input", JOptionPane.ERROR_MESSAGE);
						done = false;
						break;
					}
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Invalid Number(s)", "User Input", JOptionPane.ERROR_MESSAGE);
					done = false;
					break;
			    }
			}
			if(done) {
				sortingUI.resetAnimation(numbers);
				sortingUI.setCurrentItemCount(numbers.size());
				setVisible(false);
			}
		} else if (paramActionEvent.getSource() == clearButton) {
			textArea.setText(" ");
			textArea.setText("");
			textArea.requestFocus();
		} else if (paramActionEvent.getSource() == closeButton) {
			userInput = textArea.getText();
			setVisible(false);
		} 
	}
	
}

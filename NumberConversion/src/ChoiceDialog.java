import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;

public class ChoiceDialog {  
    public static JDialog dialog;  
    
    private int choice = 0;
    
    public int getChoice() {
    	return choice;
    }
   
    public ChoiceDialog() {  
        JFrame frame= new JFrame();  
        dialog = new JDialog(frame , "Number Conversion", true);  
        dialog.setLayout( new BorderLayout());  
        
        //North Panel
        JLabel choiceLabel = new JLabel("Choose what you want to convert:");
        choiceLabel.setFont(new Font("Serif", Font.BOLD, 30));
        choiceLabel.setForeground(Color.BLUE);
        JPanel labelPanel = new JPanel();
        labelPanel.add(choiceLabel, BorderLayout.CENTER);
        
        //Center Panel
        Font font = new Font("Serif", Font.PLAIN, 20);
        JRadioButton option1 = new JRadioButton("Decimal to binary");
        JRadioButton option2 = new JRadioButton("Binary to decimal");
        JRadioButton option3 = new JRadioButton("Decimal to hex");
        JRadioButton option4 = new JRadioButton("Hex to decimal");
        JRadioButton option5 = new JRadioButton("Binary to hex");
        JRadioButton option6 = new JRadioButton("Hex to binary");
        option1.setFont(font);
        option2.setFont(font);
        option3.setFont(font);
        option4.setFont(font);
        option5.setFont(font);
        option6.setFont(font);
        
        ButtonGroup group = new ButtonGroup();
        group.add(option1);
        group.add(option2);
        group.add(option3);
        group.add(option4);
        group.add(option5);
        group.add(option6);
        
        option1.addActionListener ( new ActionListener()  
        {  
            public void actionPerformed( ActionEvent e )  
            {  
            	choice = 1;
            }  
        });  
        
        option2.addActionListener ( new ActionListener()  
        {  
            public void actionPerformed( ActionEvent e )  
            {  
            	choice = 2;
            }  
        });  
        
        option3.addActionListener ( new ActionListener()  
        {  
            public void actionPerformed( ActionEvent e )  
            {  
            	choice = 3;
            }  
        });  
        
        option4.addActionListener ( new ActionListener()  
        {  
            public void actionPerformed( ActionEvent e )  
            {  
            	choice = 4;
            }  
        });  
        
        option5.addActionListener ( new ActionListener()  
        {  
            public void actionPerformed( ActionEvent e )  
            {  
            	choice = 5;
            }  
        });  
        
        option6.addActionListener ( new ActionListener()  
        {  
            public void actionPerformed( ActionEvent e )  
            {  
            	choice = 6;
            }  
        });  
        
        JPanel optionPanel = new JPanel();
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new GridLayout(0, 2));
        contentPane.add(option1);
        contentPane.add(option2);
        contentPane.add(option3);
        contentPane.add(option4);
        contentPane.add(option5);
        contentPane.add(option6);
        optionPanel.add(contentPane);
                     
        //South Panel
        JButton next_button = new JButton ("Next");
        next_button.setFont(font);
        JButton close_button = new JButton ("Close");  
        close_button.setFont(font);
        JPanel southPanel = new JPanel();
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(next_button);
        buttonPanel.add(close_button);
        southPanel.add(buttonPanel, BorderLayout.NORTH);
        
        next_button.addActionListener ( new ActionListener()  
        {  
            public void actionPerformed( ActionEvent e )  
            {  
            	if(choice == 0) {
            		JOptionPane.showMessageDialog(dialog, "Please make a conversion choice!", "Warning", JOptionPane.WARNING_MESSAGE);
            	}else {
            		ChoiceDialog.dialog.setVisible(false);  
            		new ConvertDialog(ChoiceDialog.this);  
            	}
            }  
        });  
        
        close_button.addActionListener ( new ActionListener()  
        {  
            public void actionPerformed( ActionEvent e )  
            {  
            	ChoiceDialog.dialog.setVisible(false);  
            	System.exit(0);
            }  
        });  
        
        //Add panels to the dialog
        dialog.add(labelPanel, BorderLayout.NORTH);
        dialog.add(optionPanel, BorderLayout.CENTER);
        dialog.add(southPanel, BorderLayout.SOUTH);   
        
        //Set the location and size of the dialog
        dialog.setLocation(700, 300);
        //dialog.setLocationRelativeTo(null); // Center of the screen
        dialog.setSize(new Dimension(500,300));
        dialog.setResizable(false);
        dialog.setVisible(true);  
    }  
    
    public static void main(String args[]){  
        new ChoiceDialog();  
    }  
}  
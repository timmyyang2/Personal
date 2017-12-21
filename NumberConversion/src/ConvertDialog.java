import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;

public class ConvertDialog {  
    public static JDialog dialog2;  
        
    public ConvertDialog(ChoiceDialog choiceDialog) {  
        JFrame frame= new JFrame(); 
        dialog2 = new JDialog(frame , "Number Conversion", true);  
        dialog2.setLayout( new BorderLayout());  
       
        int choice = choiceDialog.getChoice();
        String prompt = "";
        if(choice == 1) {
        	prompt = "Convert from decimal to binary:";
        }else if(choice == 2) {
        	prompt = "Convert from binary to decimal:";
        }else if(choice == 3) {
        	prompt = "Convert from decimal to hex:";
        }else if(choice == 4) {
        	prompt = "Convert from hex to decimal:";
        }else if(choice == 5) {
        	prompt = "Convert from binary to hex: ";
        }else if(choice == 6) {
        	prompt = "Convert from hex to binary:";
        }
        
        //North Panel
        JLabel promptLabel = new JLabel(prompt);
        promptLabel.setFont(new Font("Serif", Font.BOLD, 30));
        promptLabel.setForeground(Color.BLUE);
        JPanel labelPanel = new JPanel();
        labelPanel.add(promptLabel, BorderLayout.CENTER);
        
        //Center Panel
        Font labelFont =new Font("Serif", Font.BOLD, 30);
        JPanel userInputPanel = new JPanel();
        
        JTextField userInputField = new JTextField(25);
        Font bigFont = userInputField.getFont().deriveFont(Font.PLAIN, 20f);
        userInputField.setFont(bigFont);     
        JPanel userInputFieldPanel = new JPanel();
        userInputFieldPanel.add(labelPanel, BorderLayout.NORTH);
        userInputFieldPanel.add(userInputField, BorderLayout.NORTH);
        
        JLabel answerLabel = new JLabel("");
        answerLabel.setFont(labelFont);
        JPanel answerPanel = new JPanel();
        answerPanel.add(answerLabel, BorderLayout.CENTER);
        
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new GridLayout(0, 1));
        contentPane.add(userInputFieldPanel);
        contentPane.add(answerPanel);
        userInputPanel.add(contentPane);
        
        //South Panel
        Font buttonFont =new Font("Serif", Font.PLAIN, 20);
        JButton back_button = new JButton("Back");
        back_button.setFont(buttonFont);
        JButton convert_button = new JButton ("Convert");
        convert_button.setFont(buttonFont);
        convert_button.setForeground(Color.RED);
        JButton close_button = new JButton ("Close");  
        close_button.setFont(buttonFont);
        JPanel southPanel = new JPanel();
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(back_button);
        buttonPanel.add(convert_button);
        buttonPanel.add(close_button);
        southPanel.add(buttonPanel, BorderLayout.NORTH);
      
        back_button.addActionListener ( new ActionListener()  
        {  
            public void actionPerformed( ActionEvent e )  
            {  
            	ConvertDialog.dialog2.setVisible(false);
            	ChoiceDialog.dialog.setVisible(true);  
            }  
        });  
        
        userInputField.addActionListener ( new ActionListener()  
        {  
            public void actionPerformed( ActionEvent e )  
            {  
            	convertAction(userInputField, choice, answerLabel);
            }  
        });  
        
        convert_button.addActionListener ( new ActionListener()  
        {  
            public void actionPerformed( ActionEvent e )  
            {  
            	convertAction(userInputField, choice, answerLabel);
            }  
        });  
        
        close_button.addActionListener ( new ActionListener()  
        {  
            public void actionPerformed( ActionEvent e )  
            {  
            	ConvertDialog.dialog2.setVisible(false);  
            	System.exit(0);
            }  
        });  
        
        //Add panels to the dialog
        dialog2.add(labelPanel, BorderLayout.NORTH);
        dialog2.add(userInputPanel, BorderLayout.CENTER);
        dialog2.add(southPanel, BorderLayout.SOUTH);   
        
        //Set the location and size of the dialog
        dialog2.setLocation(700, 300);
        //dialog.setLocationRelativeTo(null); // Center of the screen
        dialog2.setSize(new Dimension(500,300));
        dialog2.setResizable(false);
        dialog2.setVisible(true);  
    }  
    
    private void convertAction(JTextField userInputField, int choice, JLabel answerLabel) {
    	String userInput = userInputField.getText();
    	String answer = Converter.convert(choice, userInput); 
    	if(!answer.startsWith("Invalid")) {
    		answer = answer.toUpperCase();
    	}
    	answerLabel.setText(answer);
    }
}  
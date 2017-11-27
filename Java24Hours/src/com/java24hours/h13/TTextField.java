package com.java24hours.h13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TTextField extends JFrame{

	JLabel pageLabel = new JLabel("Web page address: ", JLabel.RIGHT);
	
	JLabel actionLabel = new JLabel("Waiting: ", JLabel.CENTER);
	
	JTextField pageAddress = new JTextField(20);
	JButton myButton = new JButton("ENTER");
	
	FlowLayout flo = new FlowLayout();
	
	public TTextField(){
		init();
	}
	
	private void init(){
		setLookAndFeel();
		setSize(800, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(flo);
		add(pageLabel);
		add(pageAddress);
		add(actionLabel);
		
		pageAddress.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				actionLabel.setText(pageAddress.getText());
			}
		});
	
		setVisible(true);
	}
	
	private void setLookAndFeel() {
		// TODO Auto-generated method stub
		try{
//			UIManager.setLookAndFeel(
//					"com.sun.java.swing.plag.nimbus.NimbusLookAndFeel"
//					);
			
			 UIManager.setLookAndFeel(
			            UIManager.getSystemLookAndFeelClassName());
		}catch (Exception exc) {
		}
	}
	public static void main(String[] args){
		TTextField field = new TTextField();
	}
}

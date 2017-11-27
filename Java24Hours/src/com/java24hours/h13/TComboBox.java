package com.java24hours.h13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TComboBox extends JFrame{
	JComboBox profession = new JComboBox();
	JLabel actionLabel = new JLabel("I'm selecting: ", JLabel.CENTER);
	FlowLayout flo = new FlowLayout();
	
	public TComboBox(){
		super("Shopping List");
		profession.addItem("Butcher");
		profession.addItem("Baker");
		profession.addItem("Candlestick maker");
		profession.addItem("Fletcher");
		profession.addItem("Fighter");
		profession.addItem("Technical writer");
		
		profession.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String roy = "I'm selecting: " + (String)profession.getSelectedItem();
				actionLabel.setText(roy);
				System.out.println(roy);
			}
		});
		
		setLayout(flo);
		add(profession);
		add(actionLabel);
		setSize(500, 200);
		setVisible(true);
	}
	public static void main(String[] args){
		TComboBox box = new TComboBox();
	}
}

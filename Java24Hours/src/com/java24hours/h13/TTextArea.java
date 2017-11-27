package com.java24hours.h13;

import javax.swing.*;
import java.awt.*;

public class TTextArea extends JFrame{
	JTextArea comments = new JTextArea(8, 40);
	FlowLayout flo = new FlowLayout();

	public TTextArea(){
		setLookAndFeel();
		setSize(500, 200);
		setLayout(flo);
		add(comments);
		comments = new JTextArea("I should have been a pair\n"
			+ "of ragged claws.", 10, 25);
		comments.setLineWrap(true);
		setVisible(true);
	}
	private void setLookAndFeel(){
		try{
//			UIManager.setLookAndFeel(
//					"com.sun.java.swing.plag.nimbus.NimbusLookAndFeel"
//					);
			
			 UIManager.setLookAndFeel(
			            UIManager.getCrossPlatformLookAndFeelClassName());
		}catch (Exception exc) {
			
		}
	}
	public static void main(String[] args){
		TTextArea text = new TTextArea();
	}
	
}

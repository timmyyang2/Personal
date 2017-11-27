package com.java24hours.h13;

import java.awt.*;
import javax.swing.*;

public class FreeSpaceFrame extends JFrame {
	public FreeSpaceFrame(){
		super("Disk Free Space");
		setLookAndFeel();
		setSize(500, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlowLayout flo = new FlowLayout();
		setLayout(flo);
		FreeSpacePanel freePanel = new FreeSpacePanel();
		add(freePanel);
		setVisible(true);
	}
	
	private void setLookAndFeel(){
		try{
			UIManager.setLookAndFeel(
					"com.sun.java.swing.plag.nimbus.NimbusLookAndFeel"
					);
		}catch (Exception exc) {
			
		}
	}
	public static void main(String[] args){
		FreeSpaceFrame frame = new FreeSpaceFrame();
	}
}

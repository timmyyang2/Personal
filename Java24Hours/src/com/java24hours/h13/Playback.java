package com.java24hours.h13;

import javax.swing.*;
import java.awt.*;

public class Playback extends JFrame{
	public Playback(){
		super("Playback");
		setLookAndFeel();
		setSize(225, 80);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlowLayout flo = new FlowLayout();
		setLayout(flo);
		JButton play = new JButton("Play");
		JButton stop = new JButton("Stop");
		JButton pause = new JButton("Pause");
		add(play);
		add(stop);
		add(pause);
		setVisible(true);
		
	}

	private void setLookAndFeel() {
		// TODO Auto-generated method stub
		try{
			UIManager.setLookAndFeel(
					"com.sun.java.swing.plag.nimbus.NimbusLookAndFeel"
					);
		}catch (Exception exc) {
		}
	}
	public static void main(String[] args){
		Playback frame = new Playback();
	}
}

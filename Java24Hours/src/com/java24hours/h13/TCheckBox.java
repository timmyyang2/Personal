package com.java24hours.h13;

import javax.swing.*;
import java.awt.*;

public class TCheckBox extends JFrame {
	JCheckBox jumboSize = new JCheckBox("Jumbo Size");
	FlowLayout flo = new FlowLayout();
	
	public TCheckBox(){
		setLayout(flo);
		add(jumboSize);
		JCheckBox jumboSize = new JCheckBox("Jumbo Size", true);
		
		JCheckBox frogLegs = new JCheckBox("Frog Leg Grande", true);
		JCheckBox fishTacos = new JCheckBox("Fish Taco Platter", false);
		JCheckBox emuNuggets = new JCheckBox("Emu Nuggets", false);
		FlowLayout flo = new FlowLayout();
		ButtonGroup meals = new ButtonGroup();
		meals.add(frogLegs);
		meals.add(fishTacos);
		meals.add(emuNuggets);
		setLayout(flo);
		add(jumboSize);
		add(frogLegs);
		add(fishTacos);
		add(emuNuggets);
		setSize(500, 200);
		setVisible(true);
	}
	
	public static void main(String[] args){
		TCheckBox check = new TCheckBox();
	}
}

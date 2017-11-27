package com.java24hours.h9;

import java.util.*;

public class NameSorter {
	
	String names[] = {"Glimmer", "Marvel", "Rue", "Clove", 
			"Thresh", "Foxface", "Cato", "Peeta", "Katniss"};
	
	public NameSorter(){
	
	}
	
	public void tArrayList(){
		ArrayList<String> myList = new ArrayList<String>();
		for (int i = 0; i < names.length; i++){
			myList.add(names[i]);
		}
		
		System.out.println("This is from an array list:");
		myList.add(3, "roys phone");
		for (int i = 0; i < myList.size(); i++){
			System.out.println(myList.get(i));
		}
	}
	
	public void tSorter(){
		System.out.println("The original order:");
		for (int i = 0; i < names.length; i++){
			System.out.println(i + ": " + names[i]);
		}
		System.out.println();
		Arrays.sort(names);
		System.out.println("The new order:");
		for (int i = 0; i < names.length; i++){
			System.out.println(i + ": " + names[i]);
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		NameSorter mySorter = new NameSorter();
		mySorter.tSorter();
		mySorter.tArrayList();
	}
}

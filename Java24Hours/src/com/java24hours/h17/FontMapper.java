package com.java24hours.h17;

import java.awt.*;
import java.util.*;
public class FontMapper {
	public FontMapper(){
		Font courier = new Font("Courier New", Font.PLAIN, 6);
		Font times = new Font("Times New Roman", Font.BOLD, 12);
		Font verdana = new Font("Verdana", Font.ITALIC, 25);
		HashMap<String, Font> fonts = new HashMap<String, Font>();
		fonts.put("smallprint", courier);
		fonts.put("body", times);
		fonts.put("headline", verdana);
//		for (Map.Entry<String, Font> entry : fonts.entrySet()){
//			String key = entry.getKey();
//			Font value = entry.getValue();
//			System.out.println(key + ": " + value.getSize() + "-pt "
//					+ value.getFontName());
//		}
		
		Font myFont = fonts.get("headline");
		System.out.println("The font name with key headline is: " + myFont.getFontName());
		System.out.println(myFont.getStyle());
		System.out.println(myFont.getSize2D());
		
	}
	public static void main(String[] args){
		new FontMapper();
	}
}

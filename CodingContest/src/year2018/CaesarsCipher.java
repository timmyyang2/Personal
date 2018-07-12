package year2018;

import java.util.Scanner;

public class CaesarsCipher {
	
	public static void cipher(){
		System.out.print("Enter encrypted message?");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String result = "";
		for(int i=0; i<input.length(); i++){
			if(input.charAt(i)=='a'){
				result = result + 'x';
			}
			if(input.charAt(i)=='b'){
				result = result + 'y';
			}
			if(input.charAt(i)=='c'){
				result = result + 'z';
			}else{
			result = result + (char)(input.charAt(i)-3);
			}
		}
		System.out.println(result);
	}

	public static void main(String[] args){
		cipher();
	}
}

package year2018;

import java.util.Scanner;

public class CheckPythagoras {
	
	public static boolean check(){
		int[] points = getInput();
		
		if(points[0]==points[2] && points[1]==points[3] || points[0]==points[4] &&
				points[1]==points[5] || points[2]==points[4] && points[3]==points[5]){
			return false;
		}
		
		
		int a = (points[0]-points[2])*(points[0]-points[2])+(points[1]-points[3])*(points[1]-points[3]);
		int b = (points[2]-points[4])*(points[2]-points[4])+(points[3]-points[5])*(points[3]-points[5]);
		int c = (points[0]-points[4])*(points[0]-points[4])+(points[1]-points[5])*(points[1]-points[5]);
	
		if(a==b+c || b==a+c || c==a+b){
			return true;
		}
		
		return false;
	}
	
	public static int[] getInput(){
		Scanner scanner = new Scanner(System.in);
		String userInput = scanner.nextLine();
		String[] arr = userInput.split(" ");
		int[] points = new int[6];
		for(int i=0; i<arr.length; i++){
			points[i] = Integer.parseInt(arr[i]);
		}
		return points;
	}
		
	public static void main(String[] args){
		String userInput;
		do{
			try{
				System.out.print("Enter 6 numbers: ");
				System.out.println(check());
			}catch(Exception e){
				System.out.println("Invalid input.");
			}
			Scanner scanner = new Scanner(System.in);
			System.out.print("more (y/n)? ");
			userInput = scanner.nextLine();
		}while(userInput.equals("y"));
	}

}

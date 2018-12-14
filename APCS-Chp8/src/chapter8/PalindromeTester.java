package chapter8;

import java.util.Scanner;
public class PalindromeTester { //PROJECT 8.1

	//method to check if input string is palindrome
    public static boolean palindrome(String s) {
        if(s.length() == 0 || s.length() == 1) { //checks if input string length is 0 or 1
            return true;
        }
        
        //checks if first and last elements are equal
        if(s.charAt(0) == s.charAt(s.length()-1)) {
        	//if not recursively call the method again
            return palindrome(s.substring(1, s.length()-1));
        }
        return false;
    }

    //main method to test
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Check if word is palindrome: ");
        String pal = sc.nextLine();
        if(palindrome(pal)) {
            System.out.println(pal + " is a palindrome.");
        }else {
            System.out.println(pal + " is not a palindrome.");
        }
    }
}
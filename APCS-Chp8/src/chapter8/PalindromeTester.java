package chapter8;

import java.util.Scanner;
public class PalindromeTester { //PROJECT 8.1

    public static boolean palindrome(String s) {
        if(s.length() == 0 || s.length() == 1) {
            return true;
        }
        
        if(s.charAt(0) == s.charAt(s.length()-1)) {
            return palindrome(s.substring(1, s.length()-1));
        }
        return false;
    }

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
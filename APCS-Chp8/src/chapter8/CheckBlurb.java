package chapter8;

import java.util.Scanner;

public class CheckBlurb {

	//boolean method to check conditions of whatzit characters
    private boolean whatzit(String str) {
      if(str.length() >= 3)
         if(str.charAt(0) ==  'q')
            if(str.charAt(1) == 'z' || str.charAt(1) == 'd')
               return whoozit(str.substring(2));
      return false;
    }

  //boolean method to check conditions of whoozit characters
    private boolean whoozit(String str) {
       int index = 0;
       if(str.length() < 1)
          return false;
       if(str.charAt(index++) == 'x') {
           while(index < str.length() && str.charAt(index) == 'y')
               index++;
            if(index >= str.length())
               return true;
            if(str.charAt(index) == 'q')
               return whatzit(str.substring(index));
            else
               return false;
         }else
            return false;
      }
     
    //returns boolean if input is valid Blurb
      public boolean isBlurb(String str) {
            return whoozit(str);
      }
      
      //main method to test program
      public static void main(String args[]) {
    	CheckBlurb check = new CheckBlurb();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Blurb:");
        String blurb = sc.nextLine();
        if(check.isBlurb(blurb))
          System.out.println(blurb + " is a Blurb.");
        else
           System.out.println(blurb + " is not a Blurb.");
      }

  }

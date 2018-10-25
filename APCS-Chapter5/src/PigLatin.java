import java.util.Scanner; //Scanner package

public class PigLatin { //PROJECT 5.1

   public static void main (String[] args) { //main method
      String sentence, result, another = "y"; //defines multiple String variables
      Scanner scan = new Scanner (System.in); //Scanner

      while (another.equalsIgnoreCase("y")) { //while another is equal to y 
         System.out.println (); //space
         System.out.println ("Enter a sentence (no punctuation):"); //asks user for sentence
         sentence = scan.nextLine(); //user input
         System.out.println (); //space
         result = PigLatinTranslator.translate (sentence); //assigns result to the translation
         System.out.println ("That sentence in Pig Latin is:"); //prints the sentence in pig latin
         System.out.println (result); //prints the result
         System.out.println (); //space
         System.out.print ("Translate another sentence (y/n)? "); //asks to translate another sentence
         another = scan.nextLine(); //user input
      }
   }
}

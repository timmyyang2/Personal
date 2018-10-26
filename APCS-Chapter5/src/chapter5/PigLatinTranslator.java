package chapter5;
import java.util.Scanner; //Scanner package

public class PigLatinTranslator { //PROJECT 5.1

   public static String translate (String sentence) { //static method translate with sentence parameter
      String result = ""; //sets result as empty string
      sentence = sentence.toLowerCase(); //puts the sentence to lower case
      Scanner scan = new Scanner (sentence); //Scanner
      while (scan.hasNext()) { //while the input has next value
         result += translateWord (scan.next()); //translates word
         result += " "; //adds a space to result
      }
      return result; //returns result
   }

   private static String translateWord (String word) { //static method translateWord with word parameter
      String result = ""; //sets result as empty string
      if (beginsWithVowel(word)) { //if word begins with vowel
         result = word + "yay"; //adds yay to word
      }else if (beginsWithBlend(word)) { //with word begins blend
            result = word.substring(2) + word.substring(0,2) + "ay"; //assigns new value to result
      }else { //else
            result = word.substring(1) + word.charAt(0) + "ay"; //assigns new value to result
      }
      return result; //returns result
   }

   private static boolean beginsWithVowel (String word) { //beginsWithVowel method with word parameter
      String vowels = "aeiou"; //vowels string as "aeiou"
      char letter = word.charAt(0); //assigns letter to first char of word
      return (vowels.indexOf(letter) != -1); //returns the indexOf letter does not equal -1
   }

   private static boolean beginsWithBlend (String str) { //beginsWithBlend with str paramteter
      return ( str.startsWith ("bl") || str.startsWith ("pl") ||
               str.startsWith ("br") || str.startsWith ("pr") ||
               str.startsWith ("ch") || str.startsWith ("sh") ||
               str.startsWith ("cl") || str.startsWith ("sl") ||
               str.startsWith ("cr") || str.startsWith ("sp") ||
               str.startsWith ("dr") || str.startsWith ("sr") ||
               str.startsWith ("fl") || str.startsWith ("st") ||
               str.startsWith ("fr") || str.startsWith ("th") ||
               str.startsWith ("gl") || str.startsWith ("tr") ||
               str.startsWith ("gr") || str.startsWith ("wh") ||
               str.startsWith ("kl") || str.startsWith ("wr") ||
               str.startsWith ("ph") ); //returns if str starts with any of the beginnings
   }
}
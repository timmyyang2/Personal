package chapter7;

public class Textbook extends Book { //Textbook class inherits Book class
   protected boolean questions; //boolean questions variables

   //Textbook class constructor
   public Textbook(String title, String publisher, String author, boolean questions) {
      super(title, publisher, author);
      this.questions = questions;
   }
   
   //setter method to set if there are questions
   public void setQuestions(boolean questions) {
      this.questions = questions;
   }

   //getter method to get boolean questions
   public boolean getQuestions() {
      return questions;
   }

   //toString method to print out if there are questions
   public String toString() {
      String result = super.toString();
      System.out.print("There are ");
      if(!questions) {
    	  System.out.print(" no");
      }
     System.out.println("questions in the textbook.");
      return result;
   }
}
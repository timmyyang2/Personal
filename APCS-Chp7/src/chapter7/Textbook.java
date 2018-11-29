package chapter7;

public class Textbook extends Book {
   protected boolean questions;

   public Textbook(String title, String publisher, String author, boolean questions) {
      super(title, publisher, author);
      this.questions = questions;
   }
   
   public void setQuestions(boolean questions) {
      this.questions = questions;
   }

   public boolean getQuestions() {
      return questions;
   }

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
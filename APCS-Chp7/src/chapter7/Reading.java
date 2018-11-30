package chapter7;

//PORJECT 7.3
public class Reading {
	//protected variables related to reading
   protected String title;
   protected String publisher;
   
   //Reading class constructor
   public Reading(String title, String publisher) {
      this.title = title;
      this.publisher = publisher;
   }

   //setter method to set String title
   public void setTitle(String title) {
      this.title = title;
   }

   //setter method to set String publisher
   public void setPublisher(String publisher) {
      this.publisher = publisher;
   }

   //getter method to get String title
   public String getTitle() {
      return title;
   }

   //getter method to get Publisher title
   public String getPublisher() {
      return publisher;
   }

   //toString method to print out reading info
   public String toString() {
      return ("Title: " + title + "\tPublisher: " + publisher);
   }
}
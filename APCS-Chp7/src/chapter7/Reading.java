package chapter7;

//PORJECT 7.3
public class Reading {
   protected String title;
   protected String publisher;
   
   public Reading(String title, String publisher) {
      this.title = title;
      this.publisher = publisher;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public void setPublisher(String publisher) {
      this.publisher = publisher;
   }

   public String getTitle() {
      return title;
   }

   public String getPublisher() {
      return publisher;
   }

   public String toString() {
      return ("Title: " + title + "\tPublisher: " + publisher);
   }
}
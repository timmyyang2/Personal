package chapter7;

//PROJECT 7.3
public class Book extends Reading {
   protected String author;

   public Book(String thisTitle, String publisher, String author) {
      super(thisTitle, publisher);
      this.author = author;
   }
   
   public void setAuthor(String author) {
      this.author = author;
   }

   public String getAuthor() {
      return author;
   }

   public String toString() {
	   System.out.println("Author: " + author);
      return super.toString();
   }
}

package chapter7;

//PROJECT 7.3
public class Book extends Reading { //Book class inherits Reading class
   protected String author; //String variable author

   //Book class constructor
   public Book(String thisTitle, String publisher, String author) {
      super(thisTitle, publisher);
      this.author = author;
   }
   
   //setter method to set String author
   public void setAuthor(String author) {
      this.author = author;
   }

   //getter method to get String author
   public String getAuthor() {
      return author;
   }

   //toString to print out author info
   public String toString() {
	   System.out.println("Author: " + author);
      return super.toString();
   }
}

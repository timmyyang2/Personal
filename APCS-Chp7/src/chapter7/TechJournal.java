package chapter7;

//PROJECT 7.3
public class TechJournal extends Reading { //TechJounral inherits Reading class
   protected String subject; //String variable subject

   //TechJournal class constructor
   public TechJournal(String title, String publisher, String subject) {
      super(title, publisher);
      this.subject = subject;
   }

   //setter method to set String subject
   public void setSubject(String subject) {
       this.subject = subject;
   }

   //getter method to get String subject 
   public String getSubject() {
      return subject;
   }

   //toString method to print out subject
   public String toString() {
      String sub = super.toString();
      System.out.println("Subject: " + subject);
      return sub;
   }
}

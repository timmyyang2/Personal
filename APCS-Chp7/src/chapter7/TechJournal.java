package chapter7;

//PROJECT 7.3
public class TechJournal extends Reading{
   protected String subject;

   public TechJournal(String title, String publisher, String subject) {
      super(title, publisher);
       this.subject = subject;
   }

   public void setSubject(String subject) {
       this.subject = subject;
   }

   public String getSubject() {
      return subject;
   }

   public String toString() {
      String sub = super.toString();
      System.out.println("Subject: " + subject);
      return sub;
   }
}

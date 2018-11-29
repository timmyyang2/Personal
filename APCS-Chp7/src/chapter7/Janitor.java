package chapter7;

//PROJECT 7.2
public class Janitor extends HospitalEmployee {
   protected boolean clean;

   public Janitor(String name, int num, boolean clean) {
      super(name, num);
      this.clean = clean;
   }

   public void setClean(boolean clean) {
      this.clean = clean;
   }
   
   public boolean getClean() {
      return clean;
   }

   public void janitor() {
      System.out.print(name + " is");
      if(!clean) {
         System.out.print(" not");
      }
      System.out.println(" cleaning the floor.");
   }
}

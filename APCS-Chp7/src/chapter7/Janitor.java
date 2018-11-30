package chapter7;

//PROJECT 7.2
public class Janitor extends HospitalEmployee { //Janitor class inherits HospitalEmployee class
   protected boolean clean; //boolean variable clean

   //Janitor class constructor
   public Janitor(String name, int num, boolean clean) {
      super(name, num);
      this.clean = clean;
   }

   //setter method to set boolean clean
   public void setClean(boolean clean) {
      this.clean = clean;
   }
   
   //getter method to get boolean clean
   public boolean getClean() {
      return clean;
   }

   //method to print out janitor info
   public void janitor() {
      System.out.print(name + " is");
      if(!clean) {
         System.out.print(" not");
      }
      System.out.println(" cleaning the floor.");
   }
}

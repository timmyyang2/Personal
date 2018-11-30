package chapter7;

//PROJECT 7.2
public class Surgeon extends Doctor { //Surgeon class inherits Doctor class
   protected boolean success; //boolean variable success

   //Surgeon class constructor
   public Surgeon(String name, int num, String service, boolean success) {
      super(name, num, service);
      this.success = success;
   }
   
   //setter method to set boolean variable success
   public void setSuccess(boolean success) {
      this.success = success;
   }

   //getter method to get boolean variable success
   public boolean getSuccess() {
      return success;
   }

   //surgeon method to print out surgeon info
   public void surgeon() {
      System.out.print(name + " has operated on a patient and it is");
      if(!success) {
         System.out.print(" not");
      }
      System.out.println(" successful.");
   }
}

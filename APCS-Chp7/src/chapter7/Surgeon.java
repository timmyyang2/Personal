package chapter7;

//PROJECT 7.2
public class Surgeon extends Doctor {
   protected boolean success;

   public Surgeon(String name, int num, String service, boolean success) {
      super(name, num, service);
      this.success = success;
   }
   
   public void setSuccess(boolean success) {
      this.success = success;
   }

   public boolean getSuccess() {
      return success;
   }

   public void surgeon() {
      System.out.print(name + " has operated on a patient and it is");
      if(!success) {
         System.out.print(" not");
      }
      System.out.println(" successful.");
   }
}

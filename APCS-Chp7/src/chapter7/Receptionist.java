package chapter7;

//PROJECT 7.2
public class Receptionist extends HospitalEmployee { //Receptionist inherits HospitalEmployee class
   protected boolean talk; //boolean variable talk

   //Receptionist class constructor
   public Receptionist(String name, int num, boolean talk) {
      super(name, num);
      this.talk = talk;
   }

   //setter method to set boolean talk
   public void setTalk(boolean talk) {
      this.talk = talk;
   }

   //getter method to get boolean talk
   public boolean getTalk() {
      return talk;
   }

   //method to print out receptionist info
   public void receptionist() {
      System.out.print(name + " is at the front desk");
      if(!talk) {
         System.out.print(" not");
      }
      System.out.println(" talking to people.");
   }
}
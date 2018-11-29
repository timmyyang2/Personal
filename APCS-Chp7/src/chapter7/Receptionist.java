package chapter7;

//PROJECT 7.2
public class Receptionist extends HospitalEmployee {
   protected boolean talk;

   public Receptionist(String name, int num, boolean talk) {
      super(name, num);
      this.talk = talk;
   }

   public void setTalk(boolean talk) {
      this.talk = talk;
   }

   public boolean getTalk() {
      return talk;
   }

   public void receptionist() {
      System.out.print(name + " is at the front desk");
      if(!talk) {
         System.out.print(" not");
      }
      System.out.println(" talking to people.");
   }
}
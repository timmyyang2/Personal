package chapter7;

//PROJECT 7.2
public class HospitalEmployee {
   protected String name;
   protected int number;

   public HospitalEmployee(String name, int num) {
      this.name = name;
      this.number = num;
   }
   
   public void setName(String name) {
      this.name = name;
   }
   
   public void setNumber(int num) {
      this.number = num;
   }

   public String getName() {
      return name;
   }

   public int getNumber() {
      return number;
   }

   public String toString() {
      return "Name: " + name + "\tNumber: " + number;
   }
   
   public void service() {
      System.out.println(name + " is a hospital employee.");
   }
}

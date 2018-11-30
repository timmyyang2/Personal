package chapter7;

//PROJECT 7.2
public class HospitalEmployee {
	//variables that relate with hospital employee
   protected String name;
   protected int number;

   //HospitalEmployee class constructor
   public HospitalEmployee(String name, int num) {
      this.name = name;
      this.number = num;
   }
   
   //setter method to set String name
   public void setName(String name) {
      this.name = name;
   }
   
   //setter method to set int number
   public void setNumber(int num) {
      this.number = num;
   }

   //getter method to get String name
   public String getName() {
      return name;
   }

   //getter method to get int number
   public int getNumber() {
      return number;
   }

   //toString method to print out name and number
   public String toString() {
      return "Name: " + name + "\tNumber: " + number;
   }
   
   //service method to print out hospital employee info
   public void service() {
      System.out.println(name + " is a hospital employee.");
   }
}

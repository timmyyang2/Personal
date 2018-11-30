package chapter7;

//PROJECT 7.2
public class Nurse extends HospitalEmployee { //Nurse class inherits HospitalEmployee class
   protected int patients; //int variable patients
   
   //Nurse class constructor
   public Nurse(String name, int num, int patients) {
      super(name, num);
      this.patients = patients;
   }

   //setter method to set int patients
   public void setPatients(int patients) {
      this.patients = patients;
   }

   //getter method to get int patients
   public int getPatients() {
      return patients;
   }

   //method to print out nurse info
   public void nurse() {
      System.out.println(name + " is nurse and has " + patients + " patients.");
   }
}

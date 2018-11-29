package chapter7;

//PROJECT 7.2
public class Nurse extends HospitalEmployee {
   protected int patients;
   
   public Nurse(String name, int num, int patients) {
      super(name, num);
      this.patients = patients;
   }

   public void setPatients(int patients) {
      this.patients = patients;
   }

   public int getPatients() {
      return patients;
   }

   public void nurse() {
      System.out.println(name + " is nurse and has " + patients + " patients.");
   }
}

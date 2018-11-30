package chapter7;

//PROJECT 7.2
public class Administrator extends HospitalEmployee { //Administrator class inherits HospitalEmployee
   protected String dept; //String variable dept
   
   //Administrator class constructor
   public Administrator(String name, int num, String dept) {
      super(name, num);
      this.dept = dept;
   }
   
   //setter method to set String dept
   public void setDept(String dept) {
      this.dept = dept;
   }
   
   //getter method to get String dept
   public String getDept() {
      return dept;
   }
   
   //method to print out administrator info
   public void administrator() {
      System.out.println(name + " works at " + dept + " department.");
   }
}

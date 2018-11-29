package chapter7;

//PROJECT 7.2
public class Administrator extends HospitalEmployee {
   protected String dept;
   
   public Administrator(String name, int num, String dept) {
      super(name, num);
      this.dept = dept;
   }
   
   public void setDept(String dept) {
      this.dept = dept;
   }
   
   public String getDept() {
      return dept;
   }

   public void administrator() {
      System.out.println(name + " works at " + dept + " department.");
   }
}

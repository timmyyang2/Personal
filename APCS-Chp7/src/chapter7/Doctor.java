package chapter7;

//PROJECT 7.2
public class Doctor extends HospitalEmployee { //Doctor class inherits HospitalEmpmloyee
   protected String service; //String variable service
   
   //Doctor class constructor
   public Doctor(String name, int num, String service) {
      super(name, num);
      this.service = service;
   }
   
   //setter method to set String service
   public void setService(String service) {
      this.service = service;
   }
   
   //getter method to get String service
   public String getService() {
      return service;
   }

   //method to print out doctor info
   public void doctor() {
      System.out.println(name + " is " + service + " doctor.");
   }
}

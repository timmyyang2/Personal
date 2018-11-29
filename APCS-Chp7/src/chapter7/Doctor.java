package chapter7;

//PROJECT 7.2
public class Doctor extends HospitalEmployee {
   protected String service;
   
   public Doctor(String name, int num, String service) {
      super(name, num);
      this.service = service;
   }
   
   public void setService(String service) {
      this.service = service;
   }
   
   public String getService() {
      return service;
   }

   public void doctor() {
      System.out.println(name + " is " + service + " doctor.");
   }
}

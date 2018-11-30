package chapter7;

//PROJECT 7.2
public class HospitalDriver { //driver method for different hospital employees
	
	public static void main(String [] args) {
		//new different employee objects with inputs
      HospitalEmployee sid = new HospitalEmployee("Sid", 1);
      Doctor sahil = new Doctor("Sahil", 2, "eye");
      Nurse dev = new Nurse("Dev", 4, 100);
      Administrator amol = new Administrator("Amol", 5, "Business");
      Surgeon kunaal = new Surgeon("Kunaal", 6, "Brain", true);
      Receptionist abe = new Receptionist("Abe", 7, true);
      Janitor jag = new Janitor("Jag", 8, false);

      //prints out all objects
      System.out.println(sid);
      System.out.println(sahil);
      System.out.println(dev);
      System.out.println(amol);
      System.out.println(kunaal);
      System.out.println(abe);
      System.out.println(jag);
      System.out.println();
      
      //runs methods from objects
      sid.service();
      sahil.doctor();
      dev.nurse();
      amol.administrator();
      kunaal.surgeon();
      abe.receptionist();
      jag.janitor();
   }
}

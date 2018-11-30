package chapter7;

//PROJECT 7.5
public class DiffPeople { //driver class for different people
	
   public static void main(String args[]) {
      Person[] person = new Person[3]; //new Person object with 3 items
      person[0] = new Person("John", 28, "American", "Teacher", 50000.00);
      person[1] = new Student("James", 17, "American", "Student", 0.0, "Nashua South");
      person[2] = new Athlete("LeBron", 21, "African American", "NBA", 25000000.00, "Basketball", "Celtics");

      //loops through to print out objects
      for(int i=0; i<person.length; i++)
         System.out.println(person[i] + "\n");
   }
}

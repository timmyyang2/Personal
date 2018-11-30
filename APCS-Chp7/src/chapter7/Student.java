package chapter7;

//PROJECT 7.5
public class Student extends Person { //Student class inherits Person class
   private String school; //String variable school

   //Student class constructor
   public Student(String name, int age, String nationality, String occupation, double income, String school) {
      super(name, age, nationality, occupation, income);
      this.school = school;
   }

   //toString method to print out school
   public String toString() {
      return super.toString() + "\nSchool: " + school;
   }
}

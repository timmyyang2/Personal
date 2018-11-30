package chapter7;

//PROJECT 7.5
public class Person {
	//attributes that relate with a person
   private String name;
   private int age;
   private String nationality;
   private String occupation;
   private double income;
   
   //Person class constructor
   public Person(String name, int age, String nationality, String occupation, double income) {
      this.name = name;
      this.age = age;
      this.nationality = nationality;
      this.occupation = occupation;
      this.income = income;
   }

   //toString method to print out person info
   public String toString() {
      return "Name: " + name + "\nAge: " + age + "\nNationality: " + nationality + 
    		  "\nOccupation: " + occupation + "\nIncome: " + income;
   }
}

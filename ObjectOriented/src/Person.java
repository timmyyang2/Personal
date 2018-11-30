
public class Person {
	
	String name;
	int age;
	
	public Person(){
		
	}
	
	public Person(String inputName, int inputAge){
	
		name = inputName;
		age = inputAge;
		
	}
	
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public void doSomething(){
		System.out.println("I'm teaching shalom this Sunday!");
	}
	
	public static void main(String[] args){
		Person myPerson = new Person("Yichong", 49);
		System.out.println("The person is " + myPerson.getName() + ".");
		System.out.println(myPerson.name + "'s age is " + myPerson.getAge() + ".");
		myPerson.doSomething();
	}
	
	
}

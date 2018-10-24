package House;

public class Person {

	private String name;
	private String relation;
	
	public Person(String name, String relation) {
		this.name = name;
		this.relation = relation;
	}
	
	public String getName() {
		return name;
	}
	
	public String getRelation() {
		return relation;
	}
	
	public void live() {
		System.out.println(name + ", a " + relation + ", is doing something.");
	}
	
}

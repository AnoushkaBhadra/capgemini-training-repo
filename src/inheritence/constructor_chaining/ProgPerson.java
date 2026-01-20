package inheritence.constructor_chaining;

public class ProgPerson {
	String name; 
	int age;
	public ProgPerson(String name, int age) {
		super();
		this.name = name; 
		this.age = age;
	}
	public void displayPerson() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
}

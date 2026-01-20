package inheritence.constructor_chaining;

public class Developer extends Employee {
	String technology;
	public Developer(int id, String name, double salary, String tech){
		super(id, name, salary);
		this.technology = tech;
	}
	public void displayDeveloper(){
	display();
	System.out.println(this.technology);
	}
	public static void main(String args[]){
		Developer d = new Developer(101, "Jatin", 50000, "SpringBoot");
		d.displayDeveloper();

	}

}

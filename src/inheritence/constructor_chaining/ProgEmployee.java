package inheritence.constructor_chaining;

public class ProgEmployee extends ProgPerson{
	int id; 
	double salary;
	public ProgEmployee(String name, int age, int id, double salary) {
		super(name, age);
		this.id = id; 
		this.salary = salary;
	}
	public void displayEmployee() {
		System.out.println(this.id);
		System.out.println(this.salary);
	}

}

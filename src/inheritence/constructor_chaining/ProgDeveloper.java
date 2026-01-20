package inheritence.constructor_chaining;

public class ProgDeveloper extends ProgEmployee{
	String technology;
	public ProgDeveloper(String name, int age, int id, double salary, String technology) {
		super(name, age, id, salary);
		this.technology = technology;
	}
	public static void main(String args[]) {
		ProgDeveloper pd = new ProgDeveloper("Alice", 30, 102, 60000, "Java");
		pd.displayPerson();
		pd.displayEmployee();
		System.out.println(pd.technology);
	}
}

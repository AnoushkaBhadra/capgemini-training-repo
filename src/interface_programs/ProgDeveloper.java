package interface_programs;

public class ProgDeveloper extends ProgEmployee implements ProgCoder{
	public void work() {
		System.out.println("Developer is working right now");
	}
	public void writeCode() {
		System.out.println("Develoepr writes codes");
	}

}

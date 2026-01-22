package interface_programs;

abstract class ProgEmployee {
	int id;
	String name;
	public void employeeInfo() {
		System.out.println("Id: ");
		System.out.println("Name : ");
	}
	public abstract void work();

}

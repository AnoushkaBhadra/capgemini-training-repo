package array;

public class ArrayEmployee {
	int id; 
	String name;
	double salary;
	
	ArrayEmployee(int id, String name, double salary){
		this.id = id;
		this.name=name;
		this.salary=salary;
	}
	
	public void display()
	{
		System.out.println("Name :" +name);
		System.out.println("ID :" +id);
		System.out.println("Salary :" +salary);
	}
}

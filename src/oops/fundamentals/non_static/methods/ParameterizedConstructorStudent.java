package oops.fundamentals.non_static.methods;

public class ParameterizedConstructorStudent {
	String name;
	int ID; 
	double percentage;
	
	ParameterizedConstructorStudent(String name, int id, double percent) {
		this.name = name; 
		this.ID = id;
		this.percentage = percent;
	}
	
	public void display() {
		System.out.println("Name: " +name);
		System.out.println("ID :" +ID);
		System.out.println("Percentage: " +percentage);
	}
}


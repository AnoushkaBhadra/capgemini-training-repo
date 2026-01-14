package oops.fundamentals.non_static.methods;

public class Test {
	public static void main(String[] args) {
		Person p1 = new Person();
		
		p1.initialize("Jake Sully", 32, "Male");
		p1.display();
		p1.name = "A";
		p1.age = 20;
		p1.gender = "F";
		
		p1.display();
		
		Person p2 = new Person();
		p2.name = "B";
		p2.age = 25;
		p2.gender = "M";
		
		p2.display();
	}

}

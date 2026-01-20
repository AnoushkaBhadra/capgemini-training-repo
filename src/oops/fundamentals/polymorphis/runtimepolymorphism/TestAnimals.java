package oops.fundamentals.polymorphis.runtimepolymorphism;

public class TestAnimals {
	public static void main(String args[]) {
		Lion lion = new Lion();
		lion.sound();
		
		Dog dog  = new Dog();
		dog.sound();
		
		//upcasting
		Animal ob = new Lion();
		ob.sound();
		
		Animal ob1 = new Dog();
		ob1.sound();
	}

}

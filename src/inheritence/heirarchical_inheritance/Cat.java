package inheritence.heirarchical_inheritance;

public class Cat extends Animal {
	String cat;
	public Cat(String cat) {
		super();
		this.cat = cat;
	}
	public void meow() {
		System.out.println("Cat meows: " + this.cat);
	}


}

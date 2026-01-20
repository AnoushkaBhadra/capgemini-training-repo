package inheritence.heirarchical_inheritance;

public class Dog extends Animal {
	String s;
	public Dog(String s) {
		super();
		this.s = s;
	}
	public void bark() {
		System.out.println("Dog barks: " + this.s);
	}
    public static void main(String[] args) {
        Cat c = new Cat("Meow");
        c.meow();

        Dog d = new Dog("Woof");
        d.bark();
    }
}

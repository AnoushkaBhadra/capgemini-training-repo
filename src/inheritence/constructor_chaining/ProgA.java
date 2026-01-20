package inheritence.constructor_chaining;

public class ProgA {
	static int a = 100;

	public void A() {

	System.out.println("A()");

	}

	{

	System.out.println("Static block of A");

	}

	public ProgA() {

	super();

	System.out.println("Constructor of Program A");

	}

}

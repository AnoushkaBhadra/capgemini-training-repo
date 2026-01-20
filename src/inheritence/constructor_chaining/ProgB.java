package inheritence.constructor_chaining;

public class ProgB extends A {
	int b = 200;

	public void B() {

	System.out.println("B()");

	}

	{

	System.out.println("Non static block of B");

	}

	public ProgB() {

	super();

	System.out.println("Constructor of Program B");

	}
}

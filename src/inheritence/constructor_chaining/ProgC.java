package inheritence.constructor_chaining;

public class ProgC extends ProgB {
	int c = 300;

	public void C() {

	System.out.println("C()");

	}

	{

	System.out.println("Non static block of C");

	}

	public ProgC() {

	super();

	System.out.println("Constructor of Program C");

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	ProgC obj = new ProgC();
	
	System.out.println("Main method started");
	
	System.out.println(obj.a);
	
	System.out.println(obj.b);
	
	System.out.println(obj.c);
	}

}

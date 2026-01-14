package oops.fundamentals.non_static.non_static_initializer;

public class NonStaticProg2 {
	static {
		System.out.println("Static Block 1");

	}
	{
		System.out.println("Non-Static Block 3");
	}
	
	public static void main(String [] args) {
		System.out.println("Main");
		new NonStaticProg2();
		new NonStaticProg2();
	}
	public int test() {
		System.out.println("Test");
		return 10;
	}
	int a = test();
}


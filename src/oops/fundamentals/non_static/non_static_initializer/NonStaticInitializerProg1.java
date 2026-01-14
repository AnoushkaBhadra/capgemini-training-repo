package oops.fundamentals.non_static.non_static_initializer;

public class NonStaticInitializerProg1 {
	static {
		System.out.println("Static Block 1");
	}
	
	//Non-static initializer block
	{
		System.out.println("Non-Static Block 3");
	}	
	public static void main(String[] args) {
		System.out.println("Main Method");
		new NonStaticInitializerProg1();
		new NonStaticInitializerProg1();
		new NonStaticInitializerProg1();
		new NonStaticInitializerProg1();
		new NonStaticInitializerProg1();
	}
	
	static {
		System.out.println("Static Block 2");
	}
}


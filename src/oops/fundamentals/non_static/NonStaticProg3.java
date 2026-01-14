package oops.fundamentals.non_static;

public class NonStaticProg3 {
	//non static variables are also called object variables
	int a; 
	double d;
	byte b; 
	static String s = "Hello World";
	public static void main(String[] args) {
		NonStaticProg3 nsp = new NonStaticProg3();
		NonStaticProg3 nsp1 = new NonStaticProg3();
		System.out.println(nsp.a);
		System.out.println(nsp.d);
		System.out.println(nsp.b);
		System.out.println(s);
		System.out.println(nsp1);
		System.out.println(nsp);
		System.out.println(nsp == nsp1); //false because there are two different objects in the heap memory
	}
}

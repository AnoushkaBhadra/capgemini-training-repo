package oops.fundamentals.non_static;

public class NonStaticProg2 {
	int a; 
	double d; 
	byte b; 
	String s;
	public static void main(String[] args) {
		NonStaticProg2 nsp = new NonStaticProg2();
		System.out.println(nsp); //stores the reference
		System.out.println(nsp.s); 
		System.out.println(nsp.d);
	}
}

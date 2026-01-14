package oops.fundamentals.non_static;

public class NonStaticProg4 {
	int a = 10;
	static String s= "Hiiiiii";
	public static void main(String [] args) {
		NonStaticProg4 nsp = new NonStaticProg4();
		nsp.a = 100;
		nsp.s = "Hello"; //since the memory is shared, the variable gets overwritten
		
		NonStaticProg4 nsp1 = new NonStaticProg4();
		System.out.println(nsp1.a);
		System.out.println(nsp1.s);
	}

}

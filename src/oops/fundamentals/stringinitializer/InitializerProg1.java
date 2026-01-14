package oops.fundamentals.stringinitializer;

public class InitializerProg1 {
	static int i=test();
	public static void main(String[] args) {
		System.out.println(" Main Start ");
		System.out.println(i);
		System.out.println(" Main End ");
	}
	public static int test(){
		System.out.println(" Test Method ");
		System.out.println(i);
		return 10;
	}
}

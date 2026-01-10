package methods;

public class MethodsProg1 {
	public static void main(String args[]) {
		demo(); //this is called a method signature
		paramDemo(5);
	
	}
	
	public static void demo() {
		System.out.println("This is demo method");
	}
	public static int paramDemo(int a){
		System.out.println("Testing parameterized argument");
		return 0;
	}
}

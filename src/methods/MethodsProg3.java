package methods;

public class MethodsProg3 {
	public static void main(String args[]) {
		num(1,2);
		num('A','B');
		num('A', 2);
	}
	public static void num(int a, int b) {
		System.out.println("int, int");
	}
	public static void num(double a, double b) {
		System.out.println("double, double");
	}
//	public static void num(char a, char b) {
//		System.out.println("char, char");
//	}
//	public static void num(int a, char b) {
//		System.out.println("int, char");
//	}
//	public static void num(char a, int b) {
//		System.out.println("char, int");	
//	}
}

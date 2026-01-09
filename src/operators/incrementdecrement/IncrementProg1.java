package operators.incrementdecrement;

public class IncrementProg1 {
	public static void main(String args[]) {
		int a = 10;
		System.out.println("Before pre-incrementation:" +a);
		System.out.println("Pre-Incrementing: " +(++a));
		System.out.println("After Pre-incrementing/Before Post-incrementing: " +a);
		System.out.println("Post Incrementing: " +(a++));
		System.out.println("After Post-Incrementing: " +a);
	}
}

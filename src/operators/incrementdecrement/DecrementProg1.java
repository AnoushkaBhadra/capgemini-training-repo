package operators.incrementdecrement;

public class DecrementProg1 {
	public static void main(String args[]) {
		int a = 10;
		System.out.println("Before pre-decrementation:" +a);
		System.out.println("Pre-Decrementing: " +(--a));
		System.out.println("After Pre-decrementing/Before Post-decrementing: " +a);
		System.out.println("Post Decrementing: " +(a--));
		System.out.println("After Post-Decrementing: " +a);
	}
}

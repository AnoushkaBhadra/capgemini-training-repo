package exception_handling.finally_func;

public class FinallyProg1 {
	public static void main(String args[]) {
		try {
			System.out.println("Program Started");
			System.out.println("statement 1");
			System.out.println(100/0);
			System.out.println("statement 2");
			System.out.println("statement 3");
			
			System.out.println("Program ended");
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("statement 3");
		}
	}
}

package exception_handling.finally_func;

public class FinallyProg2 {
	public static int method() {
		try {
			return 10/2;
		}
		catch(ArithmeticException e) {
			return -1;
		}
		finally {
			return 100;
		}
	}
	public static void main(String args[]) {
		System.out.println(method());
	}

}

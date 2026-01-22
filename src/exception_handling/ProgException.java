package exception_handling;

public class ProgException {
	public static void main(String args[]) {
		System.out.println("Program started");
		try {
			System.out.println(10/0);
		}
//		catch(ArithmeticException e) {
//			System.out.println("Cannot be divided by zero");
//			
//		}
//		catch(RuntimeException e) {
//			System.out.println(e.getMessage());
//			
//		}
//		catch(Exception e) {
//			System.out.println("Cannot be divided by zero");
//			
//		}
		catch(Throwable e) {
			System.out.println(e.getMessage());
			
		}
	}

}

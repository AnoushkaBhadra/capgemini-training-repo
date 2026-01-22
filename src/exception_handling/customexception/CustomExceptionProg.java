package exception_handling.customexception;

public class CustomExceptionProg {
	public static void calRes(double percentage) {
		if(percentage > 0 &&  percentage <=100) {
			if(percentage > 45) {
				System.out.println("Passed");
			}
		}
		else {
			throw new InvalidPercException("Invalid Percentage value");
		}
	}
	
	public static void main(String args[]) {
		try {
		calRes(101.78);
		}
		catch (InvalidPercException e) {
			System.out.println(e.getMessage());
		}
	}
}

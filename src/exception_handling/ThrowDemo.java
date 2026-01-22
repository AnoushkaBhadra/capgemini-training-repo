package exception_handling;

public class ThrowDemo {
	public static void vote(int age) {
		if(age >= 18) {
			System.out.println("Candidate can vote");
		}
		else {
			throw new ArithmeticException("Candidate is not eligible to vote");
		}
	}
	
	public static void main(String args[]) {
		System.out.println("Candidate went for voting");
		try{
		vote(12);
		}
		catch(Throwable e) {
			System.out.println(e.getMessage());
		}
		
	}
}

package exception_handling.customexception;

public class BankProg {
	public static double balance = 10000;
	public static void debit(double amt) throws InvalidAmtException{
		if(amt > balance) {
			throw new InvalidAmtException("Amout is greater then balance");
		}
		else {
			balance = balance-amt;
			System.out.println("Amount debited");
		}
	}
	
	public static void main(String args[]) {
		System.out.println("Program started");
		try {
		debit(1202000);
		}
		catch(InvalidAmtException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Program ended");
		
		
	}

}

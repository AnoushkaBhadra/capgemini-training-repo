package encapsulation;

public class BankAccount {
	int accNo; 
	String name; 
	double balance; 
	
	BankAccount(int accNo, String name, double balance){
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}
	
	public void details() {
		System.out.println("Account no:"+accNo);
		System.out.println("Account holder name :"+name);
		System.out.println("Account Balance : "+balance); 
	}


	public void deposit(double amt) {
		if(amt >= 0) {
		balance = balance +amt;
		System.out.println("Amount of "+amt+" credited to your bank account no" +accNo);
		}
		else {
			System.out.println("");
		}
	}
	
	public void withdraw(double amt) {	
		if(amt<=balance) {
			balance = balance - amt;
			System.out.println("Amt withdrawn :" +balance);
		}
		
	}
	
}

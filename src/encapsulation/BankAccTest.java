package encapsulation;

public class BankAccTest {
	public static void main(String args[]) {
	BankAccount  obj = new BankAccount(2, "Aran", 2000);
	obj.deposit(200);
	obj.withdraw(1000);
	obj.details();
	obj.deposit(3000);
	obj.details();
	obj.withdraw(240);
	obj.details();
	}
	
}

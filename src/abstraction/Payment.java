package abstraction;

abstract class Payment {
	double amount;
	public Payment(double amount) {
		this.amount = amount;
	}
	public void PaymentInfo() {
		System.out.println("Ammount: " + amount);
	}
		
	public abstract void makePayment();
}

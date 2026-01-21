package abstraction;

public class UpiApp extends Payment {
    String upiApp;

    public UpiApp(double amount, String upiApp) {
        super(amount);
        this.upiApp = upiApp;
    }

    @Override
    public void PaymentInfo() {
        super.PaymentInfo();
        System.out.println("UPI App: " + upiApp);
    }

    @Override
    public void makePayment() {
        System.out.println("Payment is done using UPI app");
    }
}

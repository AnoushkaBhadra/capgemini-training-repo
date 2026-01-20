package instanceOf;

public class ProgB extends ProgA{
	int a = 20;
	public void msg(){
		System.out.println("This is the child class");
	}
	public void display(){
		System.out.println(a);
		System.out.println(super.a);
	}
	public void displayMsg(){
		msg();
		super.msg();
	}
	public static void main(String args[]) {
		ProgB b = new ProgB();
		b.display();
		b.displayMsg();
	}
}

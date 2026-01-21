package shadowing;

public class Prog3 extends Prog2 {
	int a = 20;
	public void displayGrandChild() {
		System.out.println("This is the GrandChild Class");
	}
	public void show() {
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(((Prog1)this).b);
	}
	public static void main(String[] args) {
		Prog3 obj = new Prog3();
		obj.show();
		obj.displayGrandChild();
		obj.displayChild();
		obj.displayParent();
	}
}

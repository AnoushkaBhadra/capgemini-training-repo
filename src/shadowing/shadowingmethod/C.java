package shadowing.shadowingmethod;

public class C extends B{
	@Override
	void show() { System.out.println("C"); }
	
	void test() {
		show(); // C
		super.show(); // B
		((A)this).show(); // C < -- typecast cannot be used to overshadow overriden methods
	}
	public static void main(String[] args) {
		C obj = new C();
		obj.test();
	}

}

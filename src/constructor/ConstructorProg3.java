package constructor;

public class ConstructorProg3 {
	public static ConstructorProg3 m1() {
		System.out.println("m1()");
		return new ConstructorProg3();
	}
	
	//factory method
	public static void main(String [] args) {
		ConstructorProg3 obj = m1();
		obj.m1().m1().m1();
	}
	
	public void m2() {
		System.out.println("m2()");
	}
	public void m3() {
		System.out.println("m3()");
	}
}

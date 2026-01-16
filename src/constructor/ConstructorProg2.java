package constructor;

public class ConstructorProg2 {
	public static void demo(ConstructorProg2 obj) { //reference to an object of the class
		System.out.println("demo()");
		System.out.println(obj);
		obj.test();
	}
	
	public static void main(String[] args) {
		demo(new ConstructorProg2());
//		demo(null); null can not be used as actual argument reference
	};
	
	public void test() {
		System.out.println("test()");
	}

}

package inheritence;

public class B extends A{
	static int j = 20;
	public static void main(String[] args) {
		System.out.println(A.a);
		System.out.println(B.a);
		B.print();
		
		System.out.println(B.j);
//		System.out.println(A.j);
	}

}

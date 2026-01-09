package operators.logical_operators;

public class LogicalOperatorsProg3 {
	public static void main(String args[]) {
		System.out.println(false || true || false);
		
		int a = 5;
		
		System.out.println(a>10 || ++a>a);
		System.out.println(a);
		
		int b = 10;
		System.out.println(b<20 || ++b<b);
		System.out.println(b);
	}
}

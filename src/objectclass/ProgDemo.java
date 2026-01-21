package objectclass;

public class ProgDemo {
	public static void main(String args[]) {
		int a = 10;
		int b = 10;
		
		ProgDemo pg = new ProgDemo();
		ProgDemo pg1 = new ProgDemo();
		
		System.out.println(a == b); // true
		System.out.println(pg == pg1); //false
		
		System.out.println(pg.equals(pg1)); // false 
	}

}

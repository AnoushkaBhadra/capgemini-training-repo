package assignments;

public class SquareRootProg {
	public static void main(String args[]) {
		int num = 49;
		int sqrt = 0;
		for(int i=1 ; i<=num ; i++) {
			if(i*i == num) {
				sqrt = i;
				System.out.println("Square root of " +num + " is: " +sqrt);
			}
		}
	}
}

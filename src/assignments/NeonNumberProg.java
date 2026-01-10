package assignments;

public class NeonNumberProg {
	public static void main(String args[]) {
		int num = 9;
		int square = num * num;
		int sum = 0;
		int temp = num;
		while (square > 0) {
			int digit = square % 10;
			sum = sum + digit;
			square = square / 10;
		}
		if (temp == sum) {
			System.out.println(temp + " is a Neon Number");
		} else {
			System.out.println(temp + " is not a Neon Number");
		}
	}
}

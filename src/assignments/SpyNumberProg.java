package assignments;

import java.util.Scanner;
public class SpyNumberProg {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		int sum = 0;
		int prod = 1;
		while (num > 0) {
			int digit = num % 10;
			sum = sum + digit;
			prod = prod * digit;
			num = num / 10;
		}
		if (sum == prod) {
			System.out.println("Spy Number");
		} else {
			System.out.println("Not a Spy Number");
		}
		sc.close();
	}
}

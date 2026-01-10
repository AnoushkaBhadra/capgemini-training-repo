package assignments;

import java.util.Scanner;
public class DecimalToBinary {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a decimal number:");
		int decimal = sc.nextInt();
		String binary = "";
		while(decimal>0) {
			int binaryDigit = decimal % 2;
			binary+=binaryDigit;
			decimal = decimal / 2;
		}
		System.out.println("Binary equivalent: " + binary);
		sc.close();
	}
}

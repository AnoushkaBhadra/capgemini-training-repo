package flowcontrol.conditional.loop;
import java.util.Scanner;
public class WhileLoopProg1 {
	public static void main(String args[]) {
		int rev = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		//reversing the number
		int n = sc.nextInt();
		while (n>0) {
			int digit = n%10;
			rev = rev*10 + digit;
			n=n/10;
		}
		System.out.println("Reversed number is: " + rev);
		sc.close();
	}
}

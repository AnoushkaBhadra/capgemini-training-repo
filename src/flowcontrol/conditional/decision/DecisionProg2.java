package flowcontrol.conditional.decision;
import java.util.Scanner;
public class DecisionProg2 {
	public static void main(String args[]) {
		//special digit
		int sum = 0;
		int prod = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		int temp = n;
		while(n>0) {
			int digit = n%10;
			sum+=digit;
			prod*=digit;
			n=n/10;
		}
		if(temp == (sum+prod)) {
			System.out.println("Special digit");
		}
		else {
			System.out.println("Not a special digit");
		}
		sc.close();
		
	}

}

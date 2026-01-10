package assignments;

public class PerfectNumberProg {
	public static void main(String args[]) {
		int num = 496;
		int sum = 0;
		int i = 1;
		while(i<=num/2) {
			if(num%i==0) {
				System.out.println(i+" is a divisor of "+num);
				sum+=i;
			}
			i++;
		}
		if(sum==num) {
			System.out.println("\n"+num+" is a perfect number");
		}
		else {
			System.out.println("\n"+num+" is not a perfect number");
		}
	}
}

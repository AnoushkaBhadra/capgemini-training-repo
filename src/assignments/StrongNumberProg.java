package assignments;
//also called Krishnamurthy Numbers
public class StrongNumberProg {
	public static void main(String args[]) {
		isStrong(145);
		isStrong(132);
		isStrong(40585);
	}
	public static int getDigit(int num) {
		return num%10;
	}
	public static int factorial(int num) {
		int fact = 1;
		for(int i=1;i<=num;i++) {
			fact = fact * i;
		}
		return fact;
	}
	public static void isStrong(int n) {
		int sum = 0;
		int temp = n;
		while(temp!=0) {
			int digit = getDigit(temp);
			sum = sum + factorial(digit);
			temp= temp/10;
		}
		if(sum == n) {
			System.out.println(n+" is a Strong Number");
		}
		else {
			System.out.println(n+" is not a Strong Number");
		}
	}

}

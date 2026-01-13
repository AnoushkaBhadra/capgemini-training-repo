package assignments;

public class ArmstrongNumberProg {
	public static void main(String[] args) {
		isArmstrong(153);
		isArmstrong(32);
		
	}
	public static void isArmstrong(int n) {
		int rem = 0, sum = 0;
		int temp = n;
		while(temp > 0) {
			rem = temp%10;
			sum = sum + (rem*rem*rem);
			temp = temp/10;
		}
		if(sum == n) {
			System.out.println("It is an Armstrong number");
		}
		else {
			System.out.println("It is not an Armstrong Number");
			
		}
	}

}

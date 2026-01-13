package assignments;

public class SunnyNumberProg {
	public static void main(String args[]) {

		isSunny(8);
		isSunny(3);
		isSunny(7);
	}
	public static void isSunny(int n) {
		int nextNum = n+1;
		int sqrt = (int)Math.sqrt(nextNum);
		if(sqrt*sqrt == nextNum) {
			System.out.println(n+" is a Sunny Number");
		}
		else {
			System.out.println(n+" is not a Sunny Number");
		}
	}
}

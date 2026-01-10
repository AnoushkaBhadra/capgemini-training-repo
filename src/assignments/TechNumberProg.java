package assignments;

public class TechNumberProg {
	public static void main(String args[]) {
		//checking if a number is tech number or not using just loops and arithmetic operators
		int num = 2025; // example tech number	
		int count = 0;
		int temp = num;
		// counting number of digits
		while(temp > 0) {
			count++;
			temp = temp / 10;
		}
		// splitting the number into two halves
		int divisor = (int)Math.pow(10, count / 2);
		int firstHalf = num / divisor;
		int secondHalf = num % divisor;

		int sum = firstHalf + secondHalf;
		if(sum * sum == num) {
			System.out.println(num + " is a Tech Number.");
		} else {
			System.out.println(num + " is not a Tech Number.");
		}
		
	}
}

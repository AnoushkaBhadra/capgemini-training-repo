package oops.fundamentals.polymorphism;
import java.util.Scanner;
public class MyAPProg {
	public static void main(String args[]) {
		    Scanner sc = new Scanner(System.in);

		    while (true) {
		        System.out.println("Welcome to Area Calculator. Please select an option:");
		        System.out.println("1. Calculate the area of a square");
		        System.out.println("2. Calculate the area of a rectangle");
		        System.out.println("3. Calculate the area of a circle");
		        System.out.println("4. Exit\n");

		        int choice = sc.nextInt();

		        switch (choice) {

		            case 1:
		                System.out.println("Enter the value of one side of the square\n");
		                int s = sc.nextInt();
		                System.out.println(Calculator.calculateArea(s));
		                break;

		            case 2:
		                System.out.println("Enter the length");
		                int l = sc.nextInt();
		                System.out.println("Enter the breadth\n");
		                int b = sc.nextInt();
		                System.out.println(Calculator.calculateArea(l, b));
		                break;

		            case 3:
		                System.out.println("Enter the radius\n");
		                int r = sc.nextInt();
		                System.out.println(Calculator.calculateArea(r));
		                break;

		            case 4:
		                System.out.println("Exited My App\n");
		                return;

		            default:
		                System.out.println("Invalid option\n");
		        }
		    }
		}


}

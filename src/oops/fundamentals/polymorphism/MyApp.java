package oops.fundamentals.polymorphism;
import java.util.Scanner;
public class MyApp extends Calculator{
	//required: for the methods to keep looping until exit (option 4 is selected)
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    while (true) {
	        System.out.println("Welcome to Area Calculator. Please select an option:");
	        System.out.println("1. Calculate the area of a square");
	        System.out.println("2. Calculate the area of a rectangle");
	        System.out.println("3. Calculate the area of a circle");
	        System.out.println("4. Exit\n");

	        int choice = sc.nextInt();

	        if (choice == 1) {
	            System.out.println("Enter the value of one side of the square\n");
	            int s = sc.nextInt();
	            System.out.println(Calculator.calculateArea(s));
	        }

	        else if (choice == 2) {
	            System.out.println("Enter the length\n");
	            int l = sc.nextInt();
	            System.out.println("Enter the breadth\n");
	            int b = sc.nextInt();
	            System.out.println(Calculator.calculateArea(l, b));
	        }

	        else if (choice == 3) {
	            System.out.println("Enter the radius\n");
	            int r = sc.nextInt();
	            System.out.println(Calculator.calculateArea(r));
	        }

	        else if (choice == 4) {
	            System.out.println("Exited My App\n");
	            break;
	        }
	    }
	    sc.close();
	}

}

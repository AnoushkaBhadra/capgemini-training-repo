package oops.fundamentals.polymorphism;

public class Calculator {
	public static double calculateArea(double s) {
		return s * s ; 
	}
	public static double calculateArea(double l, double b){
		return l * b;
	}
	public static double CalculateArea(float r) {
		return 3.14* r * r;
	}

}

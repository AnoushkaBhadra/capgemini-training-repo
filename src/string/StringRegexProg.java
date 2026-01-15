package string;

public class StringRegexProg {
	public static void main(String args[]) {
		
		System.out.println("9".matches("[a-zA-Z]"));
		System.out.println("hello".matches("[a-zA-Z]+"));
		System.out.println("5799132436".matches("[6-9][0-9]+"));
		
	}

}

package string;

public class StringReverseProg {
	public static void main(String[] args) {
		//reverse the string
		
		String s = "Hello";
		String rev = "";
		for(int i =  s.length()-1; i>=0; i++) {
			rev = rev+s.charAt(i);

		}
		System.out.println(rev);
	}

}

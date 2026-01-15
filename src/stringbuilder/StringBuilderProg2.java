package stringbuilder;

public class StringBuilderProg2 {
	public static void main(String args[]) {
		StringBuilder sb = new StringBuilder("Helloooo");
		//default capacity will increase to 16+length of ("Helloooo")--> 24
		System.out.println(sb.capacity()); 
		System.out.println(sb.length());
		sb.append("123456789123456");
		System.out.println(sb.capacity()); 
		System.out.println(sb.length());
	}
}

package stringbuilder;

public class StringBuilderProg1 {
	public static void main(String args[]) {
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.length());
		sb.append("12345678910111213423456784328tyvdfsi");
		System.out.println(sb.capacity());
	}
}

package string;

public class StringProg3 {

	public static void main(String args[]) {
		System.out.println("123456".matches("[6-9]\\d+"));
		System.out.println("8234556778".matches("[6-9]\\d{9}"));
		System.out.println("4832189543196".matches("[4-8]\\d{9,13}"));
		
		String s = "abcXWES";
		System.out.println(s.matches("\\w+")); //words
		
		String space = " ";
		System.out.println(space.matches("\\s+")); //white spaces
		
		String special="java!w#qse(";
		String removed[] = special.split("[!#(]");
		
		for(int i = 0; i<removed.length; i++) {
			System.out.println(removed[i]);
		}
		
		String specialchar= " @!$#%";
		System.out.println(specialchar.matches("\\s[^a-zA-Z0-9]+"));
		
		
	}
}

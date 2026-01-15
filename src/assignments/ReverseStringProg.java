package assignments;

public class ReverseStringProg {
	public static void  main(String args[]) {
		String s = "java is an OOP language";
		String[] s1 = s.split(" ");
		String rev = "";
		for(int i = 0; i<s1.length; i++) {
			rev = rev+rev(s1[i])+ " ";
		}
		System.out.println(rev.trim());
		
	}
	public static String rev(String s) {
		String rev = "";
		for(int i = s.length()-1; i>=0; i--) {
			rev= rev+s.charAt(i);
			
		}
		return rev;
	}
}

package assignments;

public class AnagramProg {
	public static void main(String args[]) {
		String s1 = "listen";
		String s2 = "silent";
		boolean find = false;
		
		if(s1.length() == s2.length()) {
			for(int i=0; i<s1.length(); i++){
				for(int j = 0; j<s2.length(); j++) {
					if (s1.charAt(i) == s2.charAt(j)) {
						find = true;
					}
				}
			}
		if(find == true) {
				System.out.println("It is an Anagram");
			}
		else {
				System.out.println("It is not an Anagram");
			}

				
			
		}
	}
}

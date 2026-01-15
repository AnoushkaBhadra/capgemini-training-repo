package assignments;

public class OccuranceStringProg {
	public static void main(String args[]) {
		        String s = "Hello";
		        boolean[] visited = new boolean[s.length()];

		        for (int i = 0; i < s.length(); i++) {

		            if (visited[i]) continue;

		            char ch = s.charAt(i);
		            int count = 1;

		            for (int j = i + 1; j < s.length(); j++) {
		                if (ch == s.charAt(j)) {
		                    count++;
		                    visited[j] = true;
		                }
		            }

		            System.out.println(ch + " = " + count);

		}

	}
}

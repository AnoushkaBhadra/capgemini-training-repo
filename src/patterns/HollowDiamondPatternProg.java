package patterns;

public class HollowDiamondPatternProg {
	/*
	 * Pattern:
	 * *****
	 * ** **
	 * *   *
	 * ** **
	 * *****
	 */
	public static void main(String args[]) {
		int n = 3;
		int total = 2 * n - 1;

		for (int i = 0; i < total; i++) {
		    for (int j = 0; j < total; j++) {

		        if (
		            i + j <= n - 1 ||
		            j - i >= n - 1 ||
		            i - j >= n - 1 ||
		            i + j >= total + n - 2
		        ) {
		            System.out.print("*");
		        } else {
		            System.out.print(" ");
		        }

		    }
		    System.out.println();
		}

	}

}

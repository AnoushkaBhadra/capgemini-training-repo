package patterns;

public class HollowHourglassProg {
	public static void main(String args[]) {
		int n = 3;
		int total = 2 * n - 1;

		for (int row = 1; row <= total; row++) {
		    for (int col = 1; col <= total; col++) {

		        if (
		            (row >= col && row + col <= 2 * n) ||
		            (row <= col && row + col > 2 * n)
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

package patterns;

public class UprightHollowTrigProb {
	public static void main(String args[]){
		int n = 3;
		int totalCols = 2 * n - 1;

		for (int row = 1; row <= n; row++) {
		    for (int col = 1; col <= totalCols; col++) {

		        if (
		            row == 1 ||
		            col <= n - row + 1 ||
		            col >= n + row - 1
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


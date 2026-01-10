package patterns;

public class PatternProg3 {
	//mirror image right angled triangle
	public static void main(String[] args) {
		int rows = 5;
		for(int i=1;i<=rows;i++) { // outer loop for rows
			// inner loop for spaces
			for(int j=1;j<=(rows-i);j++) {
				System.out.print(" ");
			}
			// inner loop for stars
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

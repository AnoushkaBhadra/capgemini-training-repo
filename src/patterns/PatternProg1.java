package patterns;

public class PatternProg1 {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++) { // i loops the rows
			for(int j=1;j<=i;j++) { // j loops the columns
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

package patterns;

public class PatternProg2 {
	public static void main(String[] args) {
		int rows; 
		int cols;
		for(rows=5; rows>=0; rows--) {
			for(cols = 0; cols<=rows; cols++) {
				System.out.print("*");
			}
			System.out.println();
		}
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
	}

}

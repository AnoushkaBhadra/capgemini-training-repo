package patterns;

public class PatternProg4 {
	public static void main(String args[]) {
		int rows, cols;
		for(rows=1; rows<=3; rows++) {
			for(cols= 3; cols>0; cols--) {
				//print * for co-ordinates (3,1), (2,2), (1,3)
				if(cols==rows) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
//		
//		public static void main(String[] args) {
//			int n=3;
//			for(int rows= 1; rows<=n; rows++) {
//				for (int cols = 1; cols<=n ; cols++) {
//					if(rows+cols==n+1) {
//						System.out.print("*");
//					} else {
//						System.out.print(" ");
//					}
//				}
//				System.out.println();
//			}
//		}
	}

}

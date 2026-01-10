package patterns;

public class TriangleProg {
	public static void main(String[] args) {
		int n=5;
		for(int rows=1; rows<=n; rows++) {
			for(int spaces=n-rows; spaces>=1; spaces--) {
				System.out.print(" ");
			}
			for(int stars=1; stars<=(2*rows-1); stars++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

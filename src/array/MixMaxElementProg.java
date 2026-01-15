package array;

public class MixMaxElementProg {
	public static int Min(int[] arr) {
		int min = arr[0];
		for(int i = 1; i<arr.length; i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		return min;
	}
	public static int Max(int[] arr) {
		int max = arr[0];
		for(int i = 1; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
	}
	public static void main(String args[]) {
		int[] arr = {3, 4, 1, 10, 9, 11};
		System.out.println("Minimum : " +Min(arr));
		System.out.println("Maximum : " +Max(arr));
		System.out.println("Different:  "+(Min(arr)-Max(arr)));
		
		
	}
}

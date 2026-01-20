package assignments;

public class SubArraySumProg {
	public static void main(String args[]) {
		int[] arr = {1, 2, 3, 4};
		int sum = 0;

		for(int i = 0; i< arr.length; i++) {
			for(int j = i; j< arr.length; j++) {
				 System.out.print("[");
				 for (int k = i; k <= j; k++) {
	                    System.out.print(arr[k]);
	                    sum+=arr[k];
	                    if (k < j) System.out.print(", ");
	                }
				 System.out.println("]");
			}
		}
		System.out.println("The sum of all possible subarrays: " +sum);
	}

}

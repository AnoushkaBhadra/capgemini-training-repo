package exception_handling;

public class MultipleException {
	public static void main(String[] args) {
//		
//		try {
//			System.out.println(100/0);
//		}
//		catch(ArithmeticException e) {
//			System.out.println(e.getMessage());
//		}
//		
//		try {
//		String s = "null";
//		System.out.println(s.length());
//		}
//		catch(NullPointerException e) {
//			System.out.println(e.getMessage());
//		}
//		
//		try {
//		int[] arr= new int[2];
//		
//		System.out.println(arr[5]);
//		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println(e.getMessage());
//		}
		
		try {
			System.out.println(100/0);
			
			String s = "null";
			System.out.println(s.length());
			
			int[] a = new int[2];
			System.out.println(a[5]);
		}
//	catch(Exception e) {
//		System.out.println(e.getMessage()); //only displays the error msg of the first Exception
//		
//	}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
//		catch(Throwable e) {
//			System.out.println(e.getMessage());
//		}
	}

}

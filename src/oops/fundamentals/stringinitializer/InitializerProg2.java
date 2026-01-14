package oops.fundamentals.stringinitializer;

public class InitializerProg2 {

		// TODO Auto-generated method stub
		static int i = 10;

		static {
			i = 30;
			System.out.println(i);
			System.out.println(" Static Block ");
			i = test1();
		}
		
		public static void main(String[] args) {
			System.out.println(" Main Start ");
			System.out.println(i);
			System.out.println(" Main End ");
		}
		public static int test1(){
			System.out.println(" Test Method ");
			System.out.println(i);
			return 50;
		}
		static {
			System.out.println("Static Initializer Block 2");
			}

}

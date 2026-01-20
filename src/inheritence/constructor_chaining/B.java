package inheritence.constructor_chaining;

public class B extends A {
	static int b = 500;
	public static void b(){
		System.out.println("b()");
		}
		static{
			System.out.println("B static block" );
			}
			public static void main(String args[]){
			System.out.println("B main() method ");
			System.out.println(a);
			a();
			}
}

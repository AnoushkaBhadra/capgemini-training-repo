package constructor;

public class ConstructorProg1 {
	ConstructorProg1(int a){
		System.out.println("Program2()");
	}
	public static void main(String[] args) {
		new ConstructorProg1(10);
	}
	
	{
		System.out.println("NSB");
	}
	
}

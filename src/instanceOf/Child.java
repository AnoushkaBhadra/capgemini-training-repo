package instanceOf;

public class Child extends Parent{
	public static void childMethod() {
		System.out.println("This is the Child Method");
	}
	public static void main(String args[]) {
		Parent p = new Child();//upcasting
		p.parentMethod();
		//p.childMethod(); compile time error
		Child c = (Child) p; //downcasting using typecast operator
		c.childMethod();
//		childMethod();
		c.parentMethod();
		
		Parent p1 = new Parent();
		System.out.println(p1 instanceof Parent); //true
		System.out.println(p1 instanceof Child); //false
		
		Child c1 = new Child();
		System.out.println( c1 instanceof Parent);//true;
		System.out.println(c1 instanceof Child); //true
		
		
		System.out.println(p instanceof Child); //true
	}
}

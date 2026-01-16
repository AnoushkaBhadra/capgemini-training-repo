package encapsulation;

public class EncapsulationProg2 {
	//private variable, global var, method, constructors
	//class initializer not used
	// constructor --> object

	private int a;
	
	private EncapsulationProg2() {}
	
	private static EncapsulationProg2 ob = new EncapsulationProg2(); //since the object is being created before anyone calls anything, arguments cannot be passed through it
	
	public static EncapsulationProg2 getObject() {
		return ob;
	}

    public int getValueA() {
        return a;
    }

    public void setValueA(int a) {
        this.a = a;
    }
	
	
}

//public class Demo {
//
//	
//	//private variable global var,method,Constructor
//	//class Initializer not used 
//	// Constructor ---> object 
//	private Demo(){
//		
//	}
//	private int a;
//	// write value , read the value
//	
//	//method write design setter method
//	//read the value design getter method
//	
//	public int getValueA() {
//		return a;
//	}
//	
//	public void setValueA(int a) {
//		this.a=a;
//	}
//	// Factory Method
//	static Demo object;//null/ref
//	public static Demo getA() {
//		if(object==null) {
//		object=new Demo();
//		}
//		return object;
//	}
//}

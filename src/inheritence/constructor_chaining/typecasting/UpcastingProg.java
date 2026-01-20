package inheritence.constructor_chaining.typecasting;

public class UpcastingProg {
	public static void main(String[] args) {
		 // Upcasting: WhiteTiger object as Tiger reference
        ChildTiger t1 = new ChildWhiteTiger();
        t1.roar();      
        t1.walk();      

        // t1.whitefur(); // Compile error: Tiger reference can't see WhiteTiger-specific method

        // Upcasting further: WhiteTiger as Animal reference
        ParentAnimal a1 = new ChildWhiteTiger();
        a1.walk();  
        // a1.roars();    // Compile error
        // a1.whitefur(); // Compiler Error
		
	}

}

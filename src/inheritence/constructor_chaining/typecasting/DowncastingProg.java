package inheritence.constructor_chaining.typecasting;

public class DowncastingProg {
	public static void main(String[] args) {

        // Upcasting first: WhiteTiger as Animal
        ParentAnimal a1 = new ChildWhiteTiger();
        a1.walk();

        // a1.roars();     // Compile-time error
        // a1.whitefur();  //Compile-time error

        // Downcasting to Tiger
        ChildTiger t1 = (ChildTiger) a1;  // explicit cast
        t1.roar();            
        t1.walk();            
        // t1.whitefur();       //Compile-time error

        // Downcasting to WhiteTiger
        ChildWhiteTiger w1 = (ChildWhiteTiger) a1;
        w1.whiteFur();         
        w1.roar();             
        w1.walk();             

        // Unsafe cast example
        ParentAnimal a2 = new ParentAnimal();
        a2.walk();
        w1.roar();
        w1.whiteFur();
        // WhiteTiger w2 = (WhiteTiger) a2; //Runtime ClassCastException
    }
}

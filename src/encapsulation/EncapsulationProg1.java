package encapsulation;

public class EncapsulationProg1 {
	private int a;
	
	//method write design setter method
	//read the value using design getting method
	
	private EncapsulationProg1() {
		
	}
	public static EncapsulationProg1 Constructor(){
		return new EncapsulationProg1();
	}
	public int getValueA() {
		return a;
	}
	public void setValueA(int a) {
		this.a = a;
	}

}

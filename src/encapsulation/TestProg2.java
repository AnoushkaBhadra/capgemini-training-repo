package encapsulation;

public class TestProg2 {
	public static void main(String args[]) {
		EncapsulationProg2 ob = EncapsulationProg2.getObject();
		EncapsulationProg2 ob2 = EncapsulationProg2.getObject();
		ob.setValueA(100);
		System.out.println(ob.getValueA());
		System.out.println(ob);
		System.out.println(ob2);
		
	}
	
}

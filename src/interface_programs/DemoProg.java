package interface_programs;

public class DemoProg implements InterfaceProgA {
	public void testA()
	{
		System.out.println("Demo testA");
	}
	public void testB()
	{
		System.out.println("Demo testB");
	}
		public void testC()
		{
			System.out.println("Demo testC");
		}
		public static void main(String[] args) {
			// I3 i1=new I3(); CTE
			InterfaceProgA i2=new DemoProg();
			i2.testA();
			i2.testB();
			//i2.testC(); CTE  as i2 doesnt have testC
			
		}
}

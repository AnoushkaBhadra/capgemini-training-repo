package interface_programs;

public class InterfaceDemo implements InterfaceProg1, InterfaceProg2{
	public static void main(String args[]) {
		//System.out.println(a); <-- direct access is not allowed in case 2 or more Interfaces have the same variable
		//m() ; <-- cannot be directly accessed
		InterfaceProg1.m();
		
	}
	
}

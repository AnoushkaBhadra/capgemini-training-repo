package flowcontrol.conditional.decision;

public class SwitchCaseProg1 {
	public static void main(String args[]) {
		byte b = 1;
		switch(b) {
		case 1: 
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");	
			break;
		case 3:
			System.out.println("Three");
			break;
		default:
			System.out.println("Invalid Input");
		}
	}
}

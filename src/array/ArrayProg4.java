package array;

public class ArrayProg4 {
	public static void main(String args[]) {
		
		ArrayEmployee[] emp = new ArrayEmployee[3];
		emp[0] = new ArrayEmployee(1, "Adam", 12644);
		emp[1] = new ArrayEmployee(2, "Miller", 45678);
		emp[2] = new ArrayEmployee(3, "Adam", 14657);
		
		for(int i=0; i<emp.length; i++) {
			System.out.println(emp[i]);
			emp[i].display();
		}
	}
}

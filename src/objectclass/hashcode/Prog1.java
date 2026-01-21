package objectclass.hashcode;

public class Prog1 {
	public int hashCode() {
		return 100;
	}
	
	public static void main(String[] args) {
		Prog1 p = new Prog1();
		System.out.println(p.hashCode());
	}

}

package objectclass;

public class ProgStudent {
	int id;
	String name; 
	double percentage;
	
	public ProgStudent(int id, String name, double percentage) {
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}
	public boolean equals(Object o) {
		ProgStudent s = (ProgStudent)o;
		if(this.id == s.id) {
			return true;
		}
		return false;
	}
	public static void main(String args[]) {
		ProgStudent s1 = new ProgStudent(1, "Sourab", 100);
		ProgStudent s2 = new ProgStudent(1, "Sourab", 100);
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}
}

package encapsulation;

public class TestStudentProg {
	public static void main(String args[]) {
		StudentDetails std = new StudentDetails();
		std.setId(8);
		std.setName("Anoushka");
		std.setCgpa(9.1);
		std.getId();
		std.getName();
		std.getCgpa();
	}

}

package interface_programs;

public class TechLead extends ProgEmployee implements ProgCoder, Manage
{
public void work() {
	System.out.println("Tech Lead is working");
}
public void writeCode() {
	System.out.println("Tech Lead is writing code");
}
public void manageTeam() {
	System.out.println("Tech Lead is manageing team");
}
}

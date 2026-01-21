package objectclass;

	public class ProgEmployee {

	    int id;
	    String name;
	    double salary;

	    public ProgEmployee() {
	        this.id = 101;
	        this.name = "Vinod";
	        this.salary = 23909.09;
	    }
//
//	    public int toInt() {
//	        return id;
//	    }
//
//	    public double toDouble() {
//	        return salary;
//	    }

	    public String toString() {
	        return "ID=" + id + ", Name=" + name + ", Salary=" + salary;
	    }

	    public static void main(String[] args) {
	        ProgEmployee emp = new ProgEmployee();

	        System.out.println(emp);
//	        System.out.println(emp);
//	        System.out.println(emp);
	    }
	}


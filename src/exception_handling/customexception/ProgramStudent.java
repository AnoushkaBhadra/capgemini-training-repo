package exception_handling.customexception;

public class ProgramStudent {
	private String name;
	private int a;

	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.a;
	}
	
	public void setName(String name) throws InvalidNameException{
		if(name == null || name == " ") {
			throw new InvalidNameException("Name cannot be null or empty");
		}
	}
	public void setAge(int a) {
		if(a<=0) {
			throw new InvalidAgeException("Age cannot be 0 or less than zero");
		}
	}

}

package inheritence.constructor_chaining;

public class Employee {
		int id; 
		String name;
		double salary;
		public Employee(int id, String name, double salary){
				super();
				this.id = id; 
				this.name = name;
				this.salary = salary;
			}
			public void display(){
					System.out.println(this.id);
					System.out.println(this.name);
					System.out.println(this.salary);
			}
		
}

package JavaSessions;

public class Employee {
	
	//class var:
	String name;
	int age;
	double salary;
	boolean isCitizen;
	String deptName;

	public static void main(String[] args) {

		int i = 10; //local variable
		System.out.println(i);
		
		//create the object: new keyword
		Employee obj = new Employee();
		
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.salary);
		System.out.println(obj.isCitizen);
		System.out.println(obj.deptName);
		
	}

}
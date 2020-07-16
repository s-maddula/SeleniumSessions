package JavaSessions;

public class Students {
	
	String name;
	int rollNumber;
	int marks;
	char gender;
	
	//can not create a function inside a function
	
	public void setStudentName(String name){
		this.name = name;
	}
	
	public String getStudentName(){
		return name;
	}
	
	
	

	public static void main(String[] args) {

		Students obj = new Students();
		obj.name = "Kan";
		System.out.println(obj.name);
		System.out.println(obj.getStudentName());
		
		obj.setStudentName("Tom");
		
		String studentName = obj.getStudentName();
		System.out.println(studentName);
		
		System.out.println(obj.name);
		
	}	
	}
	
	
	
	
	
	
	
	
	
	


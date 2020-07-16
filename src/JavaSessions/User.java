package JavaSessions;

public class User {
	
	//data members : 
	//1. class variables
	//2. class methods
	
	String name;
	int age;
	String email;
	long phone;
	String address;
	boolean isCitizen;
	
	
	public void getName(){
		System.out.println("get name method");
	}
	
	
	public static void main(String ar[]){
		//for using class data members, we need to create the obejct of the class:
		//using new keyword:
		
		int i = 10;
		
		User user1 = new User();
		user1.name = "tom";
		user1.age = 25;
		user1.email = "sheetal@gmail.com";
		user1.phone = 98989;
		user1.address = "108 LA";
		user1.isCitizen = true;
		
		user1.getName();
		
		User user2 = new User();
		user2.name = "Rufat";
		user2.age = 26;
		user2.email = "rufat@gmail.com";
		user2.phone = 878787;
		user2.address = "108 SFO";
		user2.isCitizen = false;
		
		user2.getName();
		
		User user3 = new User();
		user3.name = "Anusha";
		user3.age = 29;
		user3.email = "anusha@gmail.com";
		
		user3.getName();
		
		System.out.println(user1.name + " " + user1.age + " "+ user1.email + " " + user1.phone + " "+ user1.address + " " + user1.isCitizen);;
		System.out.println(user2.name + " " + user2.age + " "+ user2.email + " " + user2.phone + " "+ user2.address + " " + user2.isCitizen);;
		System.out.println(user3.name + " " + user3.age + " "+ user3.email + " " + user3.phone + " "+ user3.address + " " + user3.isCitizen);;

		User user4 = new User();
		user4.name = "Naveen";
		System.out.println(user4.name + " " + user4.age + " "+ user4.email + " " + user4.phone + " "+ user4.address + " " + user4.isCitizen);;

		
	}
}
	
	
	
	
	
	
	
	
	


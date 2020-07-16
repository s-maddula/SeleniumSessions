package JavaSessions;

public class Persons {

	String name;
	int age;
	long phone;

//	public Persons() { //0 param or default const...
//		System.out.println("default const....");
//	}
//
//	public Persons(int i) { //1 param const...
//		System.out.println("1 param const..." + i);
//	}

	public Persons(String name, int age, long phone){
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
	
	public Persons(String name){
		this.name = name;
	}
	
	public Persons(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public static void main(String a[]) {

		//call const... create the object:
		//Persons p1 = new Persons(10);

		Persons p1 = new Persons("Tom", 25, 909090);
		Persons p2 = new Persons("Kan", 26, 898989);
		Persons p3 = new Persons("Riddhi", 30, 877888);
		Persons p4 = new Persons("Naveen", 20, 89898999);

		
		System.out.println(p1.name + " " + p1.age + " "+ p1.phone);
		System.out.println(p2.name + " " + p2.age + " "+ p2.phone);
		System.out.println(p3.name + " " + p3.age + " "+ p3.phone);

		System.out.println(p4.name + " " + p4.age + " "+ p4.phone);
	}

}
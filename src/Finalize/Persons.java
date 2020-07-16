package Finalize;

public class Persons {
	
	int age;

	public static void main(String[] args) {

		Persons p1 = new Persons();
		p1 = null;
		System.gc();
////		p1.age = 20;
////		
////		System.out.println(p1.age);
//		
//		new Persons();
//		new Persons();
		
		//Persons p2 = new Persons();
		
		
		
		
	}
	
	public void finalize(){
		System.out.println("this is finalize....");
	}

}

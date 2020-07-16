package JavaSessions;

public class Candidate {

	String name;
	int age;
	String location;

	public Candidate(String name, int age, String location) {
		this.name = name;
		this.age = age;
		this.location = location;
	}

	public static void main(String[] args) {

		Candidate a = new Candidate("KAN", 25, "NY");
		Candidate b = new Candidate("Sheena", 45, "LA");
		Candidate c = new Candidate("Anusha", 55, "Bangalore");

		System.out.println(a.name + " " + a.age + " " + a.location);
		System.out.println(b.name + " " + b.age + " " + b.location);
		System.out.println(c.name + " " + c.age + " " + c.location);

		
		a=b;
		
		System.out.println(a.name + " " + a.age + " " + a.location);
		System.out.println(b.name + " " + b.age + " " + b.location);
		System.out.println(c.name + " " + c.age + " " + c.location);
		
//		Sheena 45 LA
//		Sheena 45 LA
//		Anusha 55 Bangalore
		
		b=c;
		System.out.println(a.name + " " + a.age + " " + a.location);
		System.out.println(b.name + " " + b.age + " " + b.location);
		System.out.println(c.name + " " + c.age + " " + c.location);
		
//		Sheena 45 LA
//		Anusha 55 Bangalore
//		Anusha 55 Bangalore
		
		c=a;
		System.out.println(a.name + " " + a.age + " " + a.location);
		System.out.println(b.name + " " + b.age + " " + b.location);
		System.out.println(c.name + " " + c.age + " " + c.location);
		
//		Sheena 45 LA
//		Anusha 55 Bangalore
//		Sheena 45 LA
		
		
	}

}
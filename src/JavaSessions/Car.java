package JavaSessions;

public class Car {
	
	String name;
	String color;
	double price;
	String model;
	static int wheels = 4;
	

	public static void main(String[] args) {

		Car c1 = new Car();	
		Car c2 = new Car();	
		Car c3 = new Car();	

		c1.name = "Audi";
		c1.color = "Red";
		c1.price = 75;
		c1.model = "Q5";
		
		c2.name = "BMW";
		c2.color = "Blue";
		c2.price = 70;
		c2.model = "520d";
		
		c3.name = "Honda";
		c3.color = "Civic";
		c3.price = 40;
		c3.model = "ivtec";
		
		Car.wheels = 5;

		System.out.println(c1.name + " " +c1.price + " " + Car.wheels);
		System.out.println(c2.name + " " +c2.price + " " + c2.model + " " + Car.wheels);

		
	}

}
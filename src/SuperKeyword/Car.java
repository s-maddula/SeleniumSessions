package SuperKeyword;

public class Car {
	
	public Car(){
		System.out.println("Car -- const....");
	}
	
	public Car(int i){
		System.out.println("Car -- const...." + i);
	}
	
	public Car(int i, int k){
		System.out.println("Car -- const...." + (i+k));
	}
	
	int max_speed = 100;
	
	public void start(){
		System.out.println("Car -- start");
	}
	
	

}
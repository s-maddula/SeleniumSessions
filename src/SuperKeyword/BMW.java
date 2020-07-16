package SuperKeyword;

public class BMW extends Car{
	
	public BMW(){
		super();
		System.out.println("BMW -- const....");
	}
	
	public BMW(int i){
		super(i);
		System.out.println("BMW -- const....");
	}
	
	public BMW(int i, int k){
		super(i,k);
		System.out.println("BMW -- const....");
	}
	
	
	int max_speed = 150;
	
	@Override
	public void start(){
		System.out.println("BMW -- start");
		
	}
	
	public void drive(){
		System.out.println("Car speed is : " + super.max_speed);
		super.start();
	}
	
	

}
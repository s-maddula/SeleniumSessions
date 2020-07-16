package JavaSessions;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int temp;
int x=23;
int y=45;
// swapping with three variables process
temp=x;
x=y;
y=temp;
System.out.println("x= "  +x    +   " y= "  +y);
System.out.println("-----");
// swapping without using third variable
x=x+y; //23+45=68
y=x-y;//68-45=23
x=x-y;//68-23=45
System.out.println("Value of x:"  +x );
System.out.println("Value of y:"  +y );


	}

}

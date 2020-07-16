package JavaSessions;

public class ConditionalOperators {
	
public static void main(String[] args) {

	
		int p=25;
		int q=78;
		int r=87;
		int s=101;{
		if(p>q && p>r && p>s){
		System.out.println("p is greater number");
		}else if (q>p && q>r && q>s) {
			System.out.println("q is greater number");
		}
			else if(r>p && r>q && r>s) {
				System.out.println("r is greater number");
			}
				else
					System.out.println("s is greater number");
			}
		System.out.println(" --------------");		
		int age = 20;
		System.out.println("Enter age:" +age);
				if(age<18) {
			System.out.println("Not eligible to vote");
		}else
			System.out.println("Eligible to vote");
				System.out.println(" --------------");
				int stay =2;
		System.out.println("Enter years of stay:" +stay);
		if(stay<3) {
			System.out.println("Not eligible to vote");
		}else
			System.out.println("Eligible to vote");
		System.out.println(" --------------");
		int num = 4;
		System.out.println("Enter a number:" +num);
		if(num%2 == 0) {
			System.out.println("Even number");
		}else
			System.out.println("Odd number");
		System.out.println(" --------------");
		String name = "Virat";
		int score;

		if (name == "Virat") {
			 score = 100;
			System.out.println("Virat score =" + score);
		} else if (name == "Smith") {
			 score = 90;
			System.out.println("Smith score =" + score);
		} else if (name == "Sachin") {
			 score = 200;
			System.out.println("Sachin score =" +score);
		} else if (name == "Werner") {
			System.out.println("This player is not found");
		}

		System.out.println("--------");
		
		String PlayerName = "Virat";
int score1;
		switch (PlayerName) {
		case "Sachin":
			score1 = 200;
			System.out.println("Sachin Score is" + score1);
			break;

		case "Virat":
			score1 =100;
			System.out.println("Virat Score is "+ score1);
			break;
		case "Smith":
			score1 = 90;
			System.out.println("Smith Score is " +score1);
			break;
		case "Werner":
			System.out.println("This player is not found");
			break;
		}
		System.out.println(" --------------");
		
		
		
		
}	
		
}	


	

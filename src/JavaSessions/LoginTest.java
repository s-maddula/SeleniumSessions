package JavaSessions;

public class LoginTest {

	public static void main(String[] args) {
		LoginTest lp = new LoginTest();
		lp.login(9090);

	}

	//method overloading -- poly + morphism -- compile time
	public void login() {

	}

	public void login(int otp) {

	}

	public void login(String username, String password) {

	}

	public void login(String email, String username, String password) {

	}

	public void login(String socialMediaAccount) {

	}
	
	public void login(long phoneNumber, String password){
		
	}
	

}
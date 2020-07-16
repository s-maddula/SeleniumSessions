package JavaSessions;

public class PaymentPage {

	public static void main(String[] args) {
		PaymentPage pp = new PaymentPage();
		pp.payment("123212121", "Test@1234");
		
	}

	public void payment(String cardNumber, String password) {
		System.out.println(cardNumber + " and "+ password);
	}

	public void payment(String cardNumber, String password, int otp) {

	}

	public void payment(String UPI, long phoneNumber, int otp) {

	}
	
	public void payment(String payPalId, String password, String emailId){
		
	}

}
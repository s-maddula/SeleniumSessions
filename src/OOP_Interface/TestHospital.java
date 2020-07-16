package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {

		
		FortisHospital fh  = new FortisHospital();
		
		fh.cardioServices();
		fh.neuroServices();
		fh.Services_911();
		fh.physioServices();
		fh.ENTServices();
		fh.medicalInsurance();
		fh.OPDServices();
		CDC.vaccination();
		
		System.out.println(USMedical.min_fee);
		
		USMedical.display();
		fh.billing();
		
		
		//top casting:
		//child class object can be referred by parent interface ref variable:
		
		USMedical us = new FortisHospital();
		
		us.orthoServices();
		us.neuroServices();
		us.Services_911();
		
		
		UKMedical uk = new FortisHospital();
		
		uk.pediaServices();
		uk.physioServices();
		
	}
}
		
		
		
		
		
		
		
		

		
	


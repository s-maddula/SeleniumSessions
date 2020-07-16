package JavaSessions;

import java.util.ArrayList;

public class Company {

	public String getCompnayName() {
		return "IBM";
	}

	public double getCurrentMarketSharePrice() {
		return 345.55;
	}

	public ArrayList<String> getDeptList() {

		ArrayList<String> deptList = new ArrayList<String>();

		deptList.add("Admin");
		deptList.add("IT");
		deptList.add("HR");
		deptList.add("Finance");
		deptList.add("Sales");

		return deptList;

	}

	public String[] getBoardOfMembers() {

		String boardArr[] = new String[3];
		boardArr[0] = "Tom";
		boardArr[1] = "Steve";
		boardArr[2] = "Kan";

		return boardArr;
	}

	public ArrayList<Object> getCompanyInfo() {
		ArrayList<Object> infoList = new ArrayList<Object>();
		infoList.add("IBM");
		infoList.add("Bangalore");
		infoList.add(10000);
		infoList.add("RFT");
		infoList.add(true);
		infoList.add(1990);

		return infoList;
	}

	// create a function where we will pass the company name and then you return
	// total employees

	public int getEmployeeCount(String compName) {

		int empCount = 0;

		if (compName.equals("IBM")) {
			empCount = 1000;
		} else if (compName.equals("TCS")) {
			empCount = 10000;
		} else if (compName.equals("ZoomCar")) {
			empCount = 200;
		} else if (compName.equals("Uber")) {
			empCount = 500;
		} else {
			System.out.println(compName + " is not found...plz pass the correct comp name....");
		}

		return empCount;
	}

	// create a function where u need to pass the comp name and return list of
	// co-founders....

	public ArrayList<String> getCoFoundersList(String compName) {

		ArrayList<String> founderList = new ArrayList<String>();

		if (compName.equals("Myntra")) {
			founderList.add("Mukesh Bansal");
			founderList.add("Binny bansal");
		}

		else if (compName.equals("HCL")) {
			founderList.add("Shiv Nadar");
		} else if (compName.equals("Google")) {
			founderList.add("Larry Page");
			founderList.add("Sundar Pichai");
		} else if (compName.equals("MS")) {
			founderList.add("Steve Balmer");
			founderList.add("Bill Gates");
		} else {
			System.out.println(compName + " is not found...plz pass the correct comp name....");
		}

		return founderList;

	}

}
package JavaSessions;

import java.util.ArrayList;

public class CompanyTest {

	public static void main(String[] args) {

		
		Company comp = new Company();
		
		String name = comp.getCompnayName();
		System.out.println(name);
		
		double price = comp.getCurrentMarketSharePrice();
		System.out.println(price);
		
		ArrayList<String> depList = comp.getDeptList();
		System.out.println(depList.size());
		
		for(String d : depList){
			System.out.println(d);
		}
		
		String members[] = comp.getBoardOfMembers();
		System.out.println(members.length);
		
		ArrayList<String> founderList = comp.getCoFoundersList("NAL");
		System.out.println(founderList);
		
		ArrayList<Object> compList = comp.getCompanyInfo();
		System.out.println(compList);
		
		System.out.println(comp.getEmployeeCount("ZoomCar"));
		System.out.println(comp.getEmployeeCount("TCS"));

	}

}
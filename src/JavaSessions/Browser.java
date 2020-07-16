package JavaSessions;

import java.util.ArrayList;

public class Browser {
	
String Browsername;
String Vendorname;
double Currentversion;

ArrayList<String> pluginList ;
	
public Browser(String browsername) {
	this.Browsername = browsername;
	
}
	
	public Browser(String browsername, String vendorname, double currentversion,ArrayList<String> ChpluginList, ArrayList<String> pluginList) {
	this.Browsername = browsername;
	this.Vendorname = vendorname;
	this.Currentversion = currentversion;
	this.pluginList = pluginList; 
	}

	public static void main(String[] args) {
			
		ArrayList<String> chpluginList= new ArrayList<String>();
		chpluginList.add("video Maker");
		chpluginList.add("firepath");
		chpluginList.add("blog reviews");
		
		Browser ch= new Browser("chrome","firepath", 81.23, chpluginList, chpluginList);
			
		System.out.println(ch.Browsername);
		System.out.println(ch.Vendorname);
		System.out.println(ch.pluginList);
		
	}
	
}

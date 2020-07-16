package JavaSessions;

import java.util.ArrayList;

public class University {

String name;
String Country;
int establisheddate;
ArrayList<String> ListOfCourses;

public University(String name, String country,  int establisheddate, ArrayList<String> UListOfCourses, ArrayList<String> ListOfCourses) {
	this.name = name;
    this.Country = country;
	this.establisheddate = establisheddate;
	this.ListOfCourses=ListOfCourses;
}

public static void main(String[] args) {
	
	ArrayList<String> UListOfCourses= new ArrayList<String> ();
	UListOfCourses.add("Computers");
	UListOfCourses.add("Science");
	UListOfCourses.add("Maths");
	UListOfCourses.add("Physics");
	
	University U = new University( "Texas A&M", "USA", 4/17/1871, UListOfCourses , UListOfCourses);
	
	System.out.println(U.name);
	System.out.println(U.Country);
	System.out.println(U.ListOfCourses);
}
}


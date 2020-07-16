package JavaSessions;

public class StringManipulation {
	
	 public static void main(String[] args) {

	        String s1 = ("String Manipulation");
	        String s2 = ("string Manipulation");

	        if(s1.equals(s2))
	            System.out.println("Equal");
	        else
	            System.out.println("Not Equal");
	        
	        System.out.println("-----------");
	          
		 		
			 String t1 = "   Hello Everyone   ";
				System.out.println(t1.replace(" ", ""));

				 System.out.println("-----------");
// program to print first and last letter of a string		
		String s= "Selenium";		 
	   char first = "Selenium".charAt(0);
	   System.out.println("The word is Selenium");
	  System.out.println("first letter is.." +first);
	  char last = s.charAt(s.length() -1);
	  System.out.println("last letter is.."+last);
	  
	  System.out.println("-----------");
	  
	  String message  = "let us learn String Manipulation";
		System.out.println(message.contains("learn"));
		
		if(message.contains("learn")){
			System.out.println("learn is present....");
			
			 System.out.println("-----------");
		
// program to print last half of the string.
			 
			 String p3 = "this is substring method";
				System.out.println(p3.substring(5));
				
				 System.out.println("-----------");
					
	//program to get the 3rd  “ e “ of the string 
				 
		String str=  "Welcome to Naveen Automation Lab ! ";
		System.out.println(str.indexOf("e",  str.indexOf('e',+2)+1));
		
		System.out.println("-----------");
		
	//  print index of (-1) if string is not available. . it should return integer. if String is present, then it should return the specific index.	
	
		String mesg = "This is Automation";
		if(mesg.indexOf("Automation")>0){
			System.out.println("Automation is present...");
		}
		
		System.out.println(str.indexOf("Java"));//-1
		
		System.out.println("-----------");
		
// program that breaks a whole string into small strings, and print out its all values 

		String studDet = "Anish;Maddula;13;Pearson;Frisco;Tx;75036";
		System.out.println(studDet);
		
		for(int i=0; i<studDet.split(";").length; i++){
			System.out.println(studDet.split(";")[i]);
			
		}
		System.out.println("-----------");
		
		
	String fn = studDet.split(";")[0];
		String ln = studDet.split(";")[1];
		String age = studDet.split(";")[2];
		String school = studDet.split(";")[3];
		String city = studDet.split(";")[4];
		String state = studDet.split(";")[5];
		String zipcode = studDet.split(";")[6];
		System.out.println(fn);
		System.out.println(ln);
		System.out.println(age);
		System.out.println(school);
		System.out.println(city);
		System.out.println(state);
		System.out.println(zipcode);
		
		System.out.println("-----------");
		
//Assume that a string consists of 3 words, print out the middle one. 
		
		
		String z = "this is selenium";
		System.out.println(z.substring(5,8));
		
		System.out.println("-----------");
		
//getting numeric part from this String:		
		
String msg = "your transaction id is 12345 and reference id is 34567";	
String msg2[]= msg.split("is");


System.out.println(msg2[1].substring(0,6));
System.out.println(msg2[2]);

System.out.println("-----------");

// reverse your name

String name= "Sujatha";
String reverse="";

for(int i=name.length()-1;i>=0;i--) {
	reverse=reverse+name.charAt(i);
}
System.out.println("reverse of name is..." +reverse);
}
	 }
	 }


		
		

		



							 
		
	



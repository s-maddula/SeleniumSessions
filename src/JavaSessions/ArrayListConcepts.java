package JavaSessions;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.Collections;
//import java.util.List;

public class ArrayListConcepts {

	public static void main(String[] args) {

		ArrayList ar = new ArrayList();
		ar.add("white");
		ar.add("yellow");
		ar.add("orange");
		ar.add("Green");
		System.out.println(ar.size());

		for (int list = 0; list < ar.size(); list++) {
			System.out.println(ar.get(list));
		
		}
		System.out.println("-----");
		// adding elements before and after the list
		ar.add(0, "black");
		ar.add(ar.size(), "purple");
		System.out.println(ar.size());
		// System.out.println(ar.get(list));
		for (int list = 0; list < ar.size(); list++) {
			System.out.println(ar.get(list));
		}

			// retrieving an element
			//
		
		System.out.println("-----");
		System.out.println(ar.get(1));
		// updating specific array element by a given element
		ar.set(2, " peach");
		ar.set(4, "brown");
		// System.out.println(ar.size());
		System.out.println("-----");
		for (int list = 0; list < ar.size(); list++) {
			System.out.println(ar.get(list));
		}
			// retrieving an element
		System.out.println("-----");		
		System.out.println(ar.get(1));
		System.out.println("-----");
		
		//remove the third element
				ar.remove(4);
		 for(int list3 = 0; list3<ar.size(); list3++) {
		 System.out.println(ar.get(list3));
		 }
		 System.out.println("-----"); 
		// searching for an element
		 if(ar.contains("brown"))
			 System.out.println("brown is there");
		 else
		  System.out.println("brown is not there");
		 System.out.println("-----");
		
		 // reverse elements
				 Collections.reverse(ar);
				  for(int list4 = 0; list4<ar.size(); list4++) {
				  System.out.println(ar.get(list4));
				  }
				  System.out.println("-----");
	
	
	}
}
		 

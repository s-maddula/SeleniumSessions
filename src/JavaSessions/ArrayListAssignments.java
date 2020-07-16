package JavaSessions;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListAssignments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Extract a portion of Array List
	/*	ArrayList ar = new ArrayList();
		List < String > list = ar.subList(1, 4) ;
		 System.out.println(list);
		 int a = 4;
		 int b = 2;
		 int c = a+b;
		 a = b;
		 b = c-a;
        System.out.println(a);
		 System.out.println(b); */
		
		ArrayList ar = new ArrayList();
		ar.add("white");
		ar.add("yellow");
		ar.add("orange");
		ar.add("Green");
		ar.add("purple");
		 System.out.println("Original list is:  " );
		for (int list = 0; list < ar.size(); list++) {
			System.out.println(ar.get(list)); 
		
				}
		List<String> sub_List = ar.subList(0,3);
		System.out.println("List of first three elements are:" + sub_List); 
		System.out.println("-------");
		
		// Swapping two elements
		Collections.swap(ar, 1, 3);
		System.out.println("List of elements after swapping are:" );
		for (int list = 0; list < ar.size(); list++) {
			System.out.println(ar.get(list)); 
		}				
		System.out.println("-------");
		// emptying an Array List
		System.out.println("List of elements Before Clearing " +ar); 
		ar.clear();
		System.out.println("List of elements After clearing" + ar);
	System.out.println("-----");
		// trim size
		ar.add("white");
		ar.add("yellow");
		ar.add("orange");
		ar.add("Green");
		ar.add("purple");
		
		ar.trimToSize();
		System.out.println(" Elements after trimming the size" +ar);
		
		//printing the Array list using the position of elements
		System.out.println("-----");
		for(int list = 0; list<ar.size(); list++) {
		System.out.println(ar.get(list));
		}		
	}
	
}

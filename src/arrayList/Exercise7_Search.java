package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Exercise7_Search {

	//Search an element in a array list
	
	public static void main(String[] args) {
		
		 // Create a list and add some colors to the list
		  List<String> list_Strings = new ArrayList<String>();
		  list_Strings.add("Red");
		  list_Strings.add("Green");
		  list_Strings.add("Orange");
		  list_Strings.add("White");
		  list_Strings.add("Black");
		  
		  // Search the value Red
		    if (list_Strings.contains("Red")) {
		    System.out.println("Found the element");
		    } else {
		    System.out.println("There is no such element");
		    }
	}

}
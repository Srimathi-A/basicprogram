package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       ArrayList<String>arraylist = new ArrayList<String>();
	       arraylist.add("String1");
	       arraylist.add("String2");
	      arraylist.add("HCL");
	       arraylist.add("DELL");
	       arraylist.add("CTS");
	      arraylist.add("TCS");
	       arraylist.add("Tech Mahindra");
	       arraylist.add(2,"Zoho");
	       arraylist.set(1, "Imarticus");
	       //sorting list in ascending order according to the natural ordering
	      // Collections .sort(list);
	     arraylist.forEach(System.out::println);
	     arraylist.remove(2);
	     arraylist.add("Imarticus");
	     System.out.println(arraylist.indexOf("Imarticus"));
	     System.out.println(arraylist.get(3));
	     System.out.println(arraylist.size());
	     System.out.println(arraylist.contains("Hello"));
	     System.out.println(arraylist.lastIndexOf("Imarticus"));
	     System.out.println(arraylist);
	     arraylist.remove("TCS");
	     arraylist.remove(1);
	    
	        for(String str:arraylist)
	    	 System.out.println(str);
	       
	       arraylist.clear();
	       System.out.println(arraylist);

	}

}

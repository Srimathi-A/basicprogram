package Collections;
import java.util.*;
import java.util.ArrayList;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList<String> alist= new ArrayList<String>();
    alist.add("Steve");
    alist.add("Tim");
    alist.add("Lucy");
    alist.add("Pat");
    alist.add("Angela");
    alist.add("Tom");
    //displaying elements
    System.out.println(alist);
    
    // Removing "Steve" and "Angela"
    alist.remove("Steve");
    alist.remove("Angela");
    // display elements
    System.out.println(alist);
    
    //removing 3rd element
    alist.remove(2);
    
    // display elements
    System.out.println(alist);
    
    for(String str:alist)
    	System.out.println(str);
    System.out.println("number of elements in ArrayList: "+alist.size());
    	
	}

}

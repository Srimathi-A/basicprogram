package Collections;
import java.util.*;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      LinkedList<String> list = new LinkedList<String>();
      //adding elements to the linked list
     list.add("steve");
     list.add("carl");
     list.add("raj");
     // adding an elements to the first position
     list.addFirst("negan");
     // adding an elements to the last position
     list.addLast("rick");
     // adding an elements to the 3rd position
     list.add(2,"glenn");
     //Iterating LinketList
     Iterator<String>iter=list.iterator();
     while(iter.hasNext()) {
    	 System.out.println(iter.next());
     }
      
	}

}

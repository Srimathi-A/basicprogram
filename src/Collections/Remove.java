package Collections;
import java.util.*;
import java.util.Iterator;
import java.util.LinkedList;

public class Remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<String>();
	      //adding elements to the linked list
	     list.add("steve");
	     list.add("carl");
	     list.add("raj");
	     list.add("negan");
	     list.add("rick");
	     list.removeFirst();
	     list.removeLast();
	     Iterator<String>iter=list.iterator();
	     while(iter.hasNext()) {
	    	 System.out.println(iter.next());
	}
	}
}

package Collections;
import java.util.*;
import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Example1 {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       LinkedList<String> list = new LinkedList<String>();
       LinkedList<String>llistobj = new LinkedList<String>();
       ArrayList<String>arraylist = new ArrayList<String>();
       arraylist.add("String1");
       arraylist.add("String2");
       llistobj.addAll(arraylist);
       System.out.println(llistobj);
       
       list.add("HCL");
       list.add("DELL");
       list.add("CTS");
       list.add("TCS");
       list.add("Tech Mahindra");
       list.add(2,"Zoho");
       list.set(1, "Imarticus");
       //sorting list in ascending order according to the natural ordering
      // Collections .sort(list);
     list.forEach(System.out::println);
     list.remove(2);
     list.addFirst("IBM");
     list.addLast("PWC India");
     list.add("Imarticus");
     System.out.println(list.indexOf("Imarticus"));
     System.out.println(list.get(3));
     System.out.println(list.size());
     System.out.println(list.contains("Hello"));
     System.out.println(list.getFirst());
     System.out.println(list.getLast());
     System.out.println(list.lastIndexOf("Imarticus"));
     System.out.println(list);
     list.poll();
     list.pollFirst();
     list.pollLast();
     list.remove("TCS");
     list.remove(1);
     Iterator<String>iter=list.iterator();
     while(iter.hasNext()) {
    	 System.out.println(iter.next());
     }
  
        //  for(String str:list)
    	//   System.out.println(str);
       
       list.clear();
       System.out.println(list);
       
	}

}

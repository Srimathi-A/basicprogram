package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class Details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     HashMap<Integer,String>hmap=new HashMap<Integer,String>();
     
     hmap.put(12, "chaitanya");
     hmap.put(2, "rahul");
     hmap.put(7, "singh");
     hmap.put(49, "ajeet");
     hmap.put(3, "anuj");
     
     Set set=hmap.entrySet();
    java.util.Iterator iterator = set.iterator();
    while(iterator.hasNext()) {
    	Map.Entry mentry=(Map.Entry)iterator.next();
    	System.out.print("key is : "+mentry.getKey()+"&value is:");
    	System.out.println(mentry.getValue());
    	
    }
    String var=hmap.get(2);
    System.out.println("value at index 2 is: "+var);
    hmap.remove(3);
    System.out.println("map key and values after removal: ");
    Set set2=hmap.entrySet();
    Iterator iterator2=set2.iterator();
    while(iterator2.hasNext()) {
    	Map.Entry mentry2=(Entry)iterator2.next();
    	System.out.print("key is: "+mentry2.getKey()+"& value is: ");
    	System.out.println(mentry2.getValue());
    }
	}

}

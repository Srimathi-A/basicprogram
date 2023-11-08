package Collections;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Vector <String> vec=new Vector<String>(2);
      vec.addElement("Apple");
      vec.addElement("Orange");
      vec.addElement("Mango");
      vec.addElement("Fig");
      /*check size and capacityIncremeent*/
      System.out.println("size is:"+vec.size());
      System.out.println("defalut capacity increment is"+vec.capacity());
      vec.addElement("fruit1");
      vec.addElement("fruit2");
      vec.addElement("fruit3");
      
      System.out.println("size after addition: "+vec.size());
      System.out.println("capacity after increment is: "+vec.capacity());
      
      Enumeration en = vec.elements();
      System.out.println("\n Elements are:");
      while(en.hasMoreElements())
    	  System.out.print(en.nextElement()+" ");
	}

}

package Collections;

import java.util.ArrayDeque;
import java.util.Iterator;

public class DequeExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<String>animals=new ArrayDeque<>();
	     animals.add("dog");
	     animals.add("cat");
	     animals.add("cow");
	     animals.add("horse");
	     animals.add("hen");
	     animals.add("tiger");
	     animals.add("lion");
	    
	   Iterator<String>iterator=animals.iterator();
	   while(iterator.hasNext()) {
		   System.out.print(iterator.next());
		   System.out.print(",");
	   }
	   System.out.println("\n ArrayDeque in reverse order: ");
	   Iterator<String>desIterate=animals.descendingIterator();
	   while(desIterate.hasNext()) {
		   System.out.print(desIterate.next());
		   System.out.print(",");
	   }
	}

}

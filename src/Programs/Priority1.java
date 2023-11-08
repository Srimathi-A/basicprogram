package Programs;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Priority1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer>numbers=new PriorityQueue<>();
	     //offer elements to the queue
	     numbers.add(4);
	     numbers.add(2);
	     numbers.add(1);
	     System.out.print("priorityqueue using iterator():");
	     //using the iterator method
	    Iterator<Integer>iterate=numbers.iterator();
	    while(iterate.hasNext()) {
	    	System.out.print(iterate.next());
	    	System.out.print(" ,");
	    }
	}

}

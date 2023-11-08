package Programs;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Priority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Queue<Integer>numbers=new PriorityQueue<>();
	     //offer elements to the queue
	     numbers.offer(5);
	     numbers.offer(1);
	     numbers.offer(2);
	     System.out.println("queue: "+numbers);
	     //access elements of the queue
	     int accessednumber=numbers.peek();
	     System.out.println("accessed element: "+accessednumber);
	     //remove elements from the queue
	     int removednumber=numbers.poll();
	     System.out.println("removed element: "+removednumber);
	     System.out.println("updated queue: "+numbers);
		}

	
	}



package Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Deque<Integer>numbers=new ArrayDeque<>();
     numbers.offer(1);
     numbers.offerLast(2);
     numbers.offerFirst(3);
     System.out.println("deque: "+numbers);
     int firstElement=numbers.peekFirst();
     System.out.println("First Element:"+firstElement);
     int lastElement=numbers.peekLast();
     System.out.println("last Element:"+lastElement);
     int removenumber1=numbers.pollFirst();
     System.out.println("remove First Element:"+removenumber1);
     int removenumber2=numbers.pollLast();
     System.out.println("remove last Element:"+removenumber2);
	}
	}


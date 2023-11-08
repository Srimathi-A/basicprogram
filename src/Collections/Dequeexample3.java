package Collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Dequeexample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String>d=new ArrayDeque<>();
		d.add("one");
		d.add("two");
		d.add("three");
		d.add("four");
		d.add("five");
		System.out.println(d);
		d.addFirst("red");
		d.addLast("blue");
		System.out.println(d);
		System.out.println("remove the element:");
		d.pollFirst();
		d.pollLast();
		d.remove("red");
		d.remove("blue");
		System.out.println(d);
		d.remove("three");
		System.out.println(d);
		Iterator<String>desIterate=d.descendingIterator();
		   while(desIterate.hasNext()) {
			   System.out.print(desIterate.next());
			   System.out.print(",");
	}
	}
}

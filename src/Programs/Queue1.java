package Programs;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Queue<Integer>q=new PriorityQueue<Integer>();
  q.add(11);
  q.add(5);
  q.add(25);
  q.add(34);
  q.add(96);
  q.add(112);
  System.out.println(q);
  int a=q.peek();
  System.out.println("Accessed element "+ a);
  q.remove(11);
  q.remove(34);
 // System.out.println("remove element "+b);
  System.out.println(q);
  
	}

}

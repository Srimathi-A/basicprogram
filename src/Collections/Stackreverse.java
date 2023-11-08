package Collections;
import java.util.Iterator;
import java.util.Stack;

public class Stackreverse {
 public static void reverse (Stack<Integer>s) {
	 if(s.empty())
		 return;
	 int x=s.peek();
	 s.pop();
	 System.out.print(x+ " ");
	 reverse(s);
	 s.push(x);
	 
	 
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Stack<Integer>s=new Stack<Integer>();
	s.push(24);
	s.push(5);
	s.push(11);
	s.push(36);
	s.push(65);
	System.out.println(s);
	s.pop();
	Iterator<Integer>iterate=s.iterator();
	while(iterate.hasNext()) {
	System.out.print(iterate.next()+ " ");	
	}
	System.out.println();
	reverse(s);
	}

}

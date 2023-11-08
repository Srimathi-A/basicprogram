package Collections;

import java.util.ArrayDeque;

public class DequeExample1 {

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
     System.out.println("ArrayDeque: "+animals);
     String element=animals.remove();
     System.out.println("removed element: "+element);
     System.out.println("new ArrayDeque: "+animals);
     
     animals.remove("cow");
   //  System.out.println("removed specific element: "+specificelement);
     System.out.println("new ArrayDeque: "+animals);
     
     String firstelement=animals.removeFirst();
     System.out.println("removed first element: "+firstelement);
     
     String lastelement=animals.removeLast();
     System.out.println("removed last element: "+lastelement);
     System.out.println("new ArrayDeque: "+animals);
     animals.clear();
     System.out.println("new ArrayDeque: "+animals);
	}

}

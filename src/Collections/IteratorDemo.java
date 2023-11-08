package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ArrayList a1= new ArrayList();
  // add elements to the array list
  a1.add("C");
  a1.add("A");
  a1.add("E");
  a1.add("D");
  a1.add("F");
  // use iterator to display contents of a1
  System.out.print("original contents of a1: ");
  Iterator itr = a1.iterator();
  while(itr.hasNext()) {
	  Object element = itr.next();
	  System.out.print(element + " ");
  }
  System.out.println();
  //modify objects being iterated
  @SuppressWarnings("rawtypes")
ListIterator litr = a1.listIterator();
  while(litr.hasNext()) {
	Object element = litr.next();
	litr.set(element + "+");
  }
  System.out.print("modified contents of a1: ");
  itr = a1.iterator();
  while(litr.hasNext()) {
		Object element = litr.next();
		litr.set(element + " ");
	  }
  System.out.println();
  // now,display the list backwards
  System.out.print("modified list backwards: ");
  while(litr.hasPrevious()) {
	  Object element = litr.previous();
		litr.set(element + " ");
	  }  
  System.out.println();
  }
	}



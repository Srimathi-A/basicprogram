package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sortedlist {
   private ArrayList<Integer>list;
   //constructor
   public Sortedlist()
   {
	   list=new ArrayList<Integer>();
   }
   //function to check if list is empty
   public boolean isEmpty()
   {
	   return list.size()==0||list==null;
   }
   public void  clear()
   {
	   list=new ArrayList<Integer>();
   }
   public int size()
   {
	  return list.size(); 
   }
   public void add(int ele)
   {
	   int pos=list.size();
	   list.add(ele);
	   while(pos>0&&ele<list.get(pos-1))
	   {
		   list.set(pos, list.get(pos-1));
		   pos--;
	   }
	   list.set(pos, ele);
   }
   public void remove(int ind)
   {
	   list.remove(ind);
   }
   public int binaryserach(int ele)
   {
	   return Collections.binarySearch(list,ele);
   }
   public boolean contains(int ele)
   {
	   return binaryserach(ele)>=0;
   }
   public class sorted
   { 
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s = new Scanner(System.in);
      Sortedlist list =new Sortedlist();
      System.out.println("sorted list test\n");
      char ch;
      do {
      System.out.println("\n sorted list operation\n");
      System.out.println("1.insert");
      System.out.println("2.remove");
      System.out.println("3.binary serach");
      System.out.println("4.contains");
      System.out.println("5.check empty");
      System.out.println("6.get size");
      System.out.println("7.clear");
      int choich =s.nextInt();
      switch(choich)
      {
      case 1:
    	  System.out.println("enter integer element to add");
    	  list.add(s.nextInt());
    	  break;
      case 2:
    	  System.out.println("enter index");
    	  list.remove(s.nextInt());
    	  break;
      case 3:
    	  System.out.println("enter integer element to serach");
    	  System.out.println("binary serach result: + list.binary serach(scan.nextInt()");
    	  break;
      case 4:
    	  System.out.println("enter  integer element");
    	  System.out.println("contains result: + list.contains(scan.nextInt()");
    	  break;
      case 5:
    	  System.out.println("empty status ="+list.isEmpty());
    	  break;
      case 6:
    	  System.out.println("size ="+list.size()+ "/n");
    	  break;
      case 7:
    	  System.out.println("sorted list cleared");
    	  list.clear();
    	  break;
    	  default:
    		  System.out.println("wrong entry /n");
    		  break;
      }
      System.out.println(list);
      System.out.println("/n do you want to continue(type y or n) /n");
      ch=s.next().charAt(0);
	}
      while(ch=='y'||ch=='y');

}
 }
  }


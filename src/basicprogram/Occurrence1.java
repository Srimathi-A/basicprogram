package basicprogram;

import java.util.Scanner;

public class Occurrence1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter no.of elements you want in array: ");
	     int n,element,count=0;
	     n= s.nextInt();
	     System.out.print("Enter all the elements: ");
	     int arr[]= new int[n];
	     for(int i=0;i<n;i++)
	    	 arr[i]=s.nextInt();
	     System.out.print("Enter the element of which you  want to" + " count number of occurrences: ");
	     element =s.nextInt();
	     for(int i=0;i<n;i++) {
	    	 if(arr[i]==element) {
	    		 count++;
	     }
	}
  if(count==0)
	  System.out.println("element not persent");
  else
	  System.out.println("number of occurrence of"+ "the element:"+count);
  s.close();
}
}

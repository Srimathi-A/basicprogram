package Example_sum;

import java.util.Scanner;

public class Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		 Scanner s = new Scanner (System.in);
	      System.out.print("enter the number of element: ");
	      n=s.nextInt();
	      int arr[]=new int[n];
	      System.out.print("enter the array of element:");
	      for(int i=0;i<n;i++) 
	    	  arr[i]=s.nextInt();
	    	  System.out.print("enter the element you want to you:");
	    	  int element=s.nextInt();
	    	  for(int i=0;i<n;i++) 
	    		  if(arr[i]==element)
	    		  System.out.print("element fount at position:" +i);
	    	  }
	    	  
	}




package basicprogram;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		 int n	;
	      n=s.nextInt();
	      int arr[] = new int[n];
	      for(int i=0;i<n;i++) 
	    	   arr[i] = s.nextInt();
	    	 int  large=arr[0],small=arr[0];
	    	 for(int i=1;i<n;i++ ) {
	    		 if(arr[i] >large)
	    			 large=arr[i];
	      }
	      System.out.println("largest = " +large);
	      
	      for(int i=n-1;i<n;i++) {
	    	  if(arr[i] < small)
	    		  small=arr[i];
	    	  
	      }
	      System.out.println("smallest="+small);
	      s.close();
		}

}

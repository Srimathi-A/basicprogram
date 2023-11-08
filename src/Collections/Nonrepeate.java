package Collections;

import java.util.Scanner;

public class Nonrepeate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s = new Scanner(System.in);
      int flag=0;
      System.out.print("Enter the size of the array: ");
      int n=s.nextInt();
      int arr[]= new int[n];
      System.out.print("Enter array elements: ");
     
      for(int i=0;i<n;i++) {
    	  arr[i]=s.nextInt();
    	  int count=0;
    	  for(int j=0;j<n;j++) {
    		 if(arr[i]==arr[j]&& i!=j) {
    			count++; 
    		 }
    		    	 
    		 }
    	  if(count==0) {
    		  System.out.print(arr[i]+ " ");
    		  flag=1;
    	  }
      }
      if(flag==1) {
    	  System.out.println("all the elements are repeated: ");
    	  s.close();
      }
	}

}


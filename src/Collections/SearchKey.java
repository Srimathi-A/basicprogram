package Collections;

import java.util.Scanner;

public class SearchKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
	     System.out.print("Enter number of elements your want in array: ");
	     int n = s.nextInt();
	     int arr[]=new int[n];
	     System.out.print("enter all the elements: ");
	     for(int i=0;i<n;i++) 
	    	 arr[i]=s.nextInt();
	     System.out.print("enter the element you want to find:");
	     int search = s.nextInt();
	     int count = 0;
	    for(int i=0;i<n;i++) {
	    	if(arr[i]==search) {
	    		count++;
	    		System.out.printf("Element %d found at position: ",search,i+1);
	    		
	    	}
	    }
	    if(count==0)
	    	System.out.println("element found at position ");
	    s.close();
	}
	}



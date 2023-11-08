package basicprogram;

import java.util.Scanner;

public class Position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n,pos = 0;
     Scanner s = new Scanner(System.in);
     System.out.print("Enter no of elements want to in array: ");
     n=s.nextInt();
     int arr[]= new int[n];
     System.out.print("enter all the elements: ");
     for(int i=0;i<n;i++) {
    	 arr[i]=s.nextInt();
    	 System.out.println(arr[i]);
     }
     for(int i=pos;i<n;i++)
    	 System.out.println(arr[i]);
     s.close();
	}

}

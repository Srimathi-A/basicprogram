package Collections;

import java.util.Scanner;

public class array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s = new Scanner (System.in);
      int n;
      System.out.print("Enter the size of the array: ");
      n=s.nextInt();
      int arr[]=new int[n];
      System.out.print("Enter array elements:");
      for(int i=0;i<n;i++) {
    	  arr[i]=s.nextInt();
      }
      System.out.print("the initial array is:");
      int x=arr[0];
      int i;
      for(i=0;i<arr.length-1;i++) {
    	  arr[i]=arr[i+1];
    	   }
      arr[i]=x;
      System.out.print("the array after permutation is:");
	}

}

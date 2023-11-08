package basicprogram;

import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s= new Scanner(System.in);
      int n,temp;
      System.out.print("Enter the array size: ");
      n=s.nextInt();
      int arr[]= new int[n];
      System.out.println("Enter the array element one by one: ");
      for(int i=0;i<n;i++) 
    	  arr[i]=s.nextInt();
      for(int i=0;i<n-1;i++) {
    	  for(int j=i+1;j<n;j++) {
    		  if(arr[i] >arr[j]) {
    			  temp=arr[i];
    			  arr[i]= arr[j];
    			  arr[j]= temp;
    		  }
    	  }
      }
      System.out.println("After sorting array elements are: ");
      for(int i=0;i<n;i++)
    	  System.out.print(arr[i]+ " ");
      System.out.println("deceding order: ");
      for(int i=n-1;i>=0;i--)
    	  System.out.print(arr[i]+ " ");
      System.out.println("/nSecond smallest: "+arr[1]);
      System.out.println("second largest: "+arr[n-2]);
      s.close();
	}

}

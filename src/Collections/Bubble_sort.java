package Collections;

import java.util.Scanner;

public class Bubble_sort {
  static void bubble(int n,int arr[]) {
	  for(int step=0;step<n-1;step++) {
		  for(int i=0;i<n;i++) {
			  if(arr[i]<arr[i+1]);
			  int t=arr[i];
			  arr[i]=arr[i+1];
			  arr[i+1]=t;
		  }
	  }
  }
  static void printArray(int n,int arr[]) {
	  System.out.print("After sorting: ");
	  for(int i=0;i<n;i++) {
		  System.out.print(arr[i]+ " ");
	  }
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner s = new Scanner (System.in);
    System.out.print("Enter the bubble sort: ");
    int n= s.nextInt();
    int arr[]=new int[n];
    System.out.print("Enter array one by one: ");
    for(int i=0;i<n;i++) {
    	arr[i]=s.nextInt();
    }
    bubble(n,arr);
    printArray(n,arr);
    s.close();
	}

}

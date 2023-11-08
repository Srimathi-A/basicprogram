package Collections;

import java.util.Scanner;

public class Insertion_sort {
   static void insert(int n,int arr[]) {
	   int t,key;
   	for(int step=1;step<n;step++ ) {
   		key=step;
   		for(int i=step-1;i>=0;i--) {
   			if(arr[i]>arr[key]) {
   				t=arr[i];
   				arr[i]=arr[key];
   				arr[key]=t;
   				key--;
   			}
   	}
   	}
   }
   static void printArray(int n,int ar[]) {
	   	 System.out.print("After  sorting : ");
	   	 for(int i=0;i<n;i++) {
	   		 System.out.print(ar[i]+ " ");
	   	 }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner s = new Scanner(System.in);
   System.out.print("enter the sort array: ");
   int n=s.nextInt();
   int arr[]=new int[n];
   System.out.print("enter the sorting: ");
    for(int i=0;i<n;i++) {
    	arr[i]=s.nextInt();
    }
    insert(n,arr);
    printArray(n,arr);
    s.close();
	}

}

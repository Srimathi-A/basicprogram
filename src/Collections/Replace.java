package Collections;

import java.util.Scanner;

public class Replace {
    static void replaceElement(int arr[],int n) {
    	int max,min;
    	max=arr[n-1];
    	for(int i=n-2;i>=0;i--) {
    		int temp=arr[i];
    		arr[i]=max;
    		if(temp>max)
    			max=temp;
    		
    	}
    	arr[n-1]=0;
    }
    static void printArray(int arr[],int n) {
    	for(int i=0;i<n;i++)
    		System.out.print(arr[i]+ " ");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s =  new Scanner(System.in);
       System.out.print("Enter the size of the array: ");
       int n=s.nextInt();
       int arr[]=new int[n];
       System.out.print("Enter array elements: ");
       for(int i=0;i<n;i++)
    	   arr[i]=s.nextInt();
	replaceElement(arr,n);
	printArray(arr,n);
}
}

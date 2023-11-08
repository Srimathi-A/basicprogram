package Collections;

import java.util.Scanner;

public class SumandAverage {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum=0,average=0;
	    Scanner s = new Scanner (System.in);
	    System.out.print("enter the array: ");
	    n=s.nextInt();
	    int arr[]=new int[n];
	    System.out.print("enter all the elements: ");
	    for(int i = 1;i<n;i++) {
	    	arr[i]=s.nextInt();
	    	sum=sum+arr[i];
	    }
	    System.out.print("sum : "+sum);
	    average=sum /n;
	    System.out.print("average: "+average);
	   
	    	 s.close();	
	    }
	    	
	   
		}
	




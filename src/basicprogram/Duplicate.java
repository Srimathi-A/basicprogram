package basicprogram;

import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n;
    Scanner s= new Scanner(System.in);
    n=s.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++) 
    	arr[i]=s.nextInt();
    int d=arr[0];
    for(int i=1;i<n;i++) {
    	if(arr[i]==d)
    		d=arr[i];
    }
    System.out.print(d);
    s.close();
	}

}

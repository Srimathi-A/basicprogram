package basicprogram;

import java.util.Scanner;

public class Beautiful {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
	      int n,sum=0;
	      n=s.nextInt();
	      int arr[] = new int[n];
	      for(int i=0;i<n;i++) 
	    	   arr[i] = s.nextInt();
for(int i=0;i<n;i++) 
{
	sum= sum+arr[i];
}
for(int i=0;i<n;i++) {
	
	if(sum % 2==0 && sum%3==0 && sum %5==0)
		System.out.print("1");
	else
		System.out.print("0");
}

}
}


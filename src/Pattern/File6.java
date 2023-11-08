package Pattern;

import java.util.Scanner;

public class File6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n;
		    Scanner s = new Scanner(System.in);
		    System.out.print("enter the number: ");
		    n=s.nextInt();
		    for(int i=2;i<=n;i++) {
		    	for(int j=1;j<=i;j++)
		    	{
		    		System.out.print("*");
		    	}
		    	System.out.println();
		    }
		    for(int i=2;i<=n;i++) {
		    	for(int j=n;j>=i;j--)
		    	{
		    		System.out.print("*");
		    	}
		    	System.out.println();
		    }
		    s.close();
		    }
}
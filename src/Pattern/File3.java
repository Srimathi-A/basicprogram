package Pattern;
import java.util.Scanner;

public class File3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n;
		    Scanner s = new Scanner(System.in);
		    System.out.print("Enter the number: ");
		    n=s.nextInt();
		    for(int i=1;i<=n;i++)
		    
		    	{
		    		System.out.print(" ");
		    	}
		    	for(int j=1;j<=n;j++)
		    	{
		    		System.out.print("*");
		    	}
		    	System.out.println();
		    	    for(int i=2;i>=n;i++)
		    	    	{
		    	    		System.out.print(" ");
		    	    	}
		    	    	for(int j=1;j<=n;j--)
		    	    	{
		    	    		System.out.print("*");
		    	    	}
		    	    	System.out.println();
		    	    	s.close();
		    	    }
		    	 
}

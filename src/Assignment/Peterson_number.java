package Assignment;
import java.util.Scanner;

public class Peterson_number {
	private static int[] factorial;
	public static void main(String[] args) {
		int n,fact=1,pnum;
	    Scanner s = new Scanner(System.in);
	    System.out.print("Enter the peterson number: ");
	    n=s.nextInt();
	    for(int i=1;i<=n;i++)
	    {
	    	fact =fact *i;
	    }
	    System.out.println("it is a number is peterson");
	    System.out.println("it is a number is not peterson");
	    s.close();
		}
	}





package Number_method;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n,fact=1;
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the number: ");
    n=s.nextInt();
    for(int i=1;i<=n;i++)
    {
    	fact =fact *i;
    }
    System.out.println("factorial = "+fact);
	}
	

}

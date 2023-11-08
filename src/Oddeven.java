import java.util.Scanner;

public class Oddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n;
	       Scanner s = new Scanner (System.in);
	       System.out.print("enter the number: ");
	       n=s.nextInt();
	       if(n%2==0) 
	    	   System.out.println("Even number ");  	   
	     else 
	    	  System.out.println("Odd  number");
	       s.close();
	    	   
	}
}

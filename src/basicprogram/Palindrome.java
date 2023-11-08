package basicprogram;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,r,reverse=0,temp;
		   Scanner s= new Scanner (System.in);
		   System.out.print("enter the number: ");
		   n=s.nextInt();
		   temp =n;
		   while(n>0) {
			   r=n%10;
			  // System.out.println(r);
			   reverse =reverse*10+r;
			   n= n/10;
		   }
		   //System.out.println("n=" +n);
		  // System.out.println("reverse =" +reverse);
		   if(temp==reverse)
			   System.out.println("palindrome");
		   else
			   System.out.println("not a palindrome");		
		   s.close();
			}
	}



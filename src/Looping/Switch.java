 package Looping;

import java.util.*;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner scan = new Scanner (System.in);
  System.out.print("Enter the grade:");
  char ch= scan.next().charAt(0);
 switch(ch)
  {
	  case'A':
		  System.out.println("Excellent!");
		  break;
	  case'B':
	  case'C':	 
		  System.out.println("Well done");
		  break;
	  case'D':
		  System.out.println("you passed");
	  case'F':
		  System.out.println("Better try again");
	      break;
	    default:
	    	System.out.println("Invalid grade");
  }
           System.out.println("your grade  is "+ch);
           scan.close();
  
	}
}

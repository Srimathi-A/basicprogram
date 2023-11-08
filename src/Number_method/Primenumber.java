package Number_method;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,number=2;
	    Scanner s = new Scanner (System.in);
	    System.out.print("Enter the prime number: ");
	    n=s.nextInt();
	    for(int i =1;i<=n;i++) 
	    {
	    	if(number==2)
	    	{
	    		System.out.print(2+ " ");
	    		number++;
	    		break;
	    	}
	    	else {
	    		Task:
	    			for(int j=2;j<=number/2;j++) {
	    				//number=27,27%3==0
	    				if(number%j==0) {
	    					number++;
	    					continue Task;
	    				}
	    			}
	    		System.out.print(number++ +" ");
	    		s.close();
	    	}
	    }
	   
	}

}

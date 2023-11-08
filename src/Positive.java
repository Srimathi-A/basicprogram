import java.util.Scanner;

public class Positive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a;
       Scanner s = new Scanner (System.in);
       System.out.println("enter the number: ");
       a=s.nextInt();
       if(a>0) 
    	   System.out.println("positive number: ");
       else if(a==0) 
    		   System.out.println("zero");   	   
     else 
    		   System.out.println("nagative number:");
    	s.close();  
       }
	

}

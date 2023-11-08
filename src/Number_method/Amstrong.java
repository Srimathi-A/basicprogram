package Number_method;

import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s =new Scanner(System.in);
     int n=s.nextInt();
     int sum=0, r,temp=n;
     String str1 =String.valueOf(n);
     int length= str1.length();
    // System.out.println(Math.pow(2, 3));
     while(n>0) {
    	 r=n%10;
    	 sum=(int) (sum+Math.pow(r, length));
    	 n=n/10;
     }
     if (temp==sum)
    	 System.out.println("Amstrong number");
     else
    	 System.out.println("not a Amstrong number");
	}

}

package basicprogram;

import java.util.Scanner;

public class BitManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s = new Scanner(System.in);
     int n = s.nextInt();
     int x=n%4;
     if(x==0)
    	 System.out.println(n);
     else if(x==1)
    	 System.out.print(1);
     else if(x==2)
    	 System.out.print(n+1);
     else
     System.out.print(0);
     s.close();
	}

}

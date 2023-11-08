 package Switchcase;
 import java.util.Scanner;
public class Naturalnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n,sum =0;
    Scanner s = new Scanner (System.in);
    System.out.print(" enter the number: ");
    n=s.nextInt();
    for(int i=1;i<=n;i++)
    {
    	sum = sum+i;
    }
    System.out.println("sum = "+ sum);
    s.close();
	}

}

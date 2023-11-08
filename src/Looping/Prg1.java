package Looping;

import java.util.Scanner;

public class Prg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner s = new Scanner (System.in);
		System.out.print("enter the num1: ");
		a=s.nextInt();
		System.out.print("Enter the num2 : ");
		b=s.nextInt();
		System.out.print("enter the num3: " );
		c=s.nextInt();
		if(a>b && b>c)
		System.out.println("a is greater:  " +c);
		
		else if(b>a && b>c)
		System.out.println("b is greater: " +b);
		else
			System.out.println("c is greater: "+c);
		s.close();

	}

}

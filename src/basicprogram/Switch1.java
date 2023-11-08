package basicprogram;

import java.util.Scanner;

public class Switch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		Scanner  s = new Scanner(System.in);
		while(true)
		{
		System.out.print("Enter the first  number: ");
		x=s.nextInt();
		System.out.print("Enter the second number: ");
		y=s.nextInt();
		int operator=1;
		System.out.println("choose the operation you want to perform");
		System.out.println("choose 1 for Addition");
		System.out.println("choose 2 for Subraction");
		System.out.println("choose 3 for Multiplication");
		System.out.println("choose 4 for Division");
		System.out.println("choose 5 for Modulus");
		System.out.println("choose 6 for Exit");
		int n=s.nextInt();
		switch(n)
		{
		case 1:
			int add;
			add = x+y;
			System.out.println("result: "+add);
			break;
		case 2:
			int sub;
			sub = x-y;
			System.out.println("result: "+sub);
			break;
		case 3:
			int multiple;
			multiple = x*y;
			System.out.println("result: "+multiple);
			break;
		case 4:
			int division;
			division = x/y;
			System.out.println("result: "+division);
			break;
		case 5:
			int mod;
			mod = x%y;
			System.out.println("result: "+mod);
			break;
		case 6:
			int exit;
			System.out.println("exit");
			break;
		}
		
		
		}
	}

}

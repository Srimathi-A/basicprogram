package Looping;

import java.util.Scanner;

public class VerysimpleRecursionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner s = new Scanner(System.in);
   long n = s.nextLong();
   callMyself(n);//5=5 4 3 2 1
	}
	public static void callMyself(long i) {
		if(i<=0) {
			return;
		}
		System.out.print(i+" ");
		i=i-1;
		callMyself(i);

	}

}

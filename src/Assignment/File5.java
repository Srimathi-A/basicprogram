package Assignment;

import java.util.Scanner;

public class File5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		   Scanner s= new Scanner(System.in);
		   System.out.print("enter the number: ");
		   		n=s.nextInt();
		   		for(int i=1;i<=n;i++) {
		   			for(int j=1;j<=n;j++) {
		   				if(i==1||i==n||j==1||j==n);
		   				System.out.print("* " );
		   					System.out.print(" ");
		   			}
		   			System.out.println();
		   		}
		   		s.close();
	}

}

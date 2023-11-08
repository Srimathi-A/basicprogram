package basicprogram;

import java.util.Scanner;

public class Increment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n;
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the number: ");
    n=s.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    	arr[i]= s.nextInt()+1;
    for(int i=0;i<n;i++ ) {
    	
	System.out.print(arr[i]+ " ");
	s.close();
	}

}
}

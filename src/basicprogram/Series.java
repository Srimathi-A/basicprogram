package basicprogram;

import java.util.Scanner;

public class Series {

	public static void main(String[] args) {
	 	// TODO Auto-generated method stub
		int n,a=0;
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
		for(int i=1;i<=n;i++) {
			a=(i*1)+1;
			System.out.print(a + " " );
			
		}
		s.close();	

	}

}

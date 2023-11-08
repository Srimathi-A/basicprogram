package basicprogram;

import java.util.Scanner;

public class sum {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,k,sum,count=0;
		Scanner s = new Scanner(System.in);
		 n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		 k=s.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=n-1;j>=0;j++) {
				if(arr[i]-arr[j]==k&&i!=j) {
					System.out.println(arr[i]+ " "+arr[j]);
					count++;
				}
			}
		}
     
	}

}

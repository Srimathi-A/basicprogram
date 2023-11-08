package basicprogram;

import java.util.Scanner;

public class Duplicate_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n,count,flag=0;
		System.out.print("Enter the size of  array: ");
		n=s.nextInt();
		int arr[]= new int[n];
		System.out.print("Enter the array elements: ");
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		System.out.print("the elements are: ");
		for(int i=0;i<n-1;i++ ) {
				count=0;
				for(int j=0;j<n;j++) {
					if(arr[i]==arr[j] && i!=j)
						count++;
				}
				if(count==0) {
					System.out.print(arr[i]+ " ");
				flag=1;
		}
 		
	}
	if(flag==0)
		System.out.println("all elements are repeated");
	s.close();

}
}

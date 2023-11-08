package basicprogram;

import java.util.Scanner;

public class Duplicate_remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s= new Scanner(System.in);
int n,count=0,flag=0;
System.out.print("Enter array size: ");
n=s.nextInt();
int arr[]= new int[n];
int temp[]=new int[n];
System.out.println("Read array elements from user: ");
for(int i=0;i<n;i++) {
	System.out.print("Enter array elements of index"+i+":");
	arr[i]=s.nextInt();
}
System.out.println("Before removing duplicate elements are: ");
for(int i=0;i<n;i++)
	System.out.println(arr[i]);
System.out.println("After removing duplicate element array are: ");
for(int i=0;i<n;i++) {
	if(i==0)
		temp[count++]=arr[i];
	else {
		for(int j=0;j<count;j++)
		{
			if(arr[i]==temp[j])
				flag=1;
		}
		if(flag==0)
			temp[count++]=arr[i];
	}
}
for(int i=0;i<count;i++)
	System.out.println(temp[i]);
s.close();
	}

}

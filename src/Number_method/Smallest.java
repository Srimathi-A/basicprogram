package Number_method;

import java.util.Scanner;

public class Smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int n,a=0,b=0,c;
  Scanner s = new Scanner(System.in);
  n=s.nextInt();
  int arr[] = new int[n];
  for(int i=0;i<n;i++)  {
	   arr[i] = s.nextInt();
  }
for(int i=1;i<n;i++) 
{
if(arr[i]<arr[b])
b=i;
else if(arr[i]>arr[a])
a=i;
}


	c=a-b;
	System.out.print(c);
	}
}



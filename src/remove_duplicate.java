import java.util.Scanner;

public class remove_duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n,count=0,flag=0;
		System.out.print("Enter array size of the array: ");
		n=s.nextInt();
		int arr[]= new int[n];
		int temp[]=new int[n];
		System.out.println("array elements in sorting order: ");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println("After removing duplicate is: ");
		for(int i=0;i<n;i++)
			System.out.print(arr[i]);
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


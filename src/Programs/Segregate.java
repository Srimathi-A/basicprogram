package Programs;

public class Segregate {
 static void segregate0and1 (int arr[],int n)
 {
	 int count =0;
	 for(int i=0;i<n;i++) {
		 if(arr[i]==0)
			 count++;
	 }
	 for(int i=0;i<count;i++)
		 arr[i]=0;
	 for(int i=count;i<n;i++)
		 arr[i]=1;
 }
 static void print(int[] arr, int n) {
 for(int i=0;i<n;i++)
	 System.out.print(arr[i]+ " ");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[] {0,1,0,1,1,0};
		int n= arr.length;
		segregate0and1(arr,n);
		print(arr,n);
        	     
          }
	}



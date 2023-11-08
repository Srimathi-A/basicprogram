import java.util.Scanner;

public class bc{
	static void bubble(int n,int ar[]) {
		 n=ar.length;
    	for(int i=0;i<n;i++) {
    		for(int j=1;i<(n-i);j++) {
    			if(ar[j-1]>ar[j]) {
    			int t=ar[j-1];
    			ar[j-1]=ar[j];
    			ar[j]=t;
    		}
    	}
    	}	
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int arr[]= {1,2,3,4,5};
	       System.out.print("Enter the number of elements: ");
	        for(int i=0;i<arr.length;i++) {
	        	System.out.print(arr[i]+ " ");
	        }
	    	   System.out.println();
	       System.out.print("after sorting: ");
	       for(int i=0;i<arr.length;i++) {
	    	   System.out.print(arr[i]+ " ");
	       }
	  
	}

}





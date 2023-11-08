import java.util.Scanner;

public class Smallestarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n;
      Scanner s = new Scanner (System.in);
      System.out.print("enter the array: ");
      n=s.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++) {
    	  arr[i]=s.nextInt();
    	  int largest=arr[0];int small=arr[0];
    	  for( i=0;i<n;i++) {
    		  if(arr[i]<small) {
    		  small=arr[i];
    	  }
    		  if(arr[i]>largest)
    		  largest=arr[i];
    	  }
          System.out.println("value =+small");
    	  System.out.print("value =+largest");
    		  
    		  
    		  
    	  }
      }
}
	



import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      // int arr[] = {10,20,30,40,50};
      int n;
      Scanner s =  new Scanner(System.in);
      System.out.print("Enter the number of elements: ");
      n=s.nextInt();
      int arr[] = new int [n];
      String array1[]=new String[n];
      System.out.print("enter the array elements one by one: ");
      for(int i=0;i<n;i++) {
    	  array1[i]=s.next();
    	  
      }
      System.out.println("output: ");
      for(int i=0;i<n;i++) {
    	  System.out.println(array1[i]);
    	  s.close();
      }
	}

}

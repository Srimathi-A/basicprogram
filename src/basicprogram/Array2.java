package basicprogram;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner (System.in);
	      int row =3,col =3;
	      int [] [] a= {{1,2,3},
	    		  {4,5,6},
	    		  {7,8,9}};
	      int b[] []=new int[row] [col];
	      System.out.print("Enter the b matrix: ");
	      for(int i=0;i<row;i++) {
	    	  for(int j=0;j<col;j++) {
	    		  b[i][j]=s.nextInt();
	    	  }
	      }
	      
		
	   	  System.out.println("2D matrix b: ");
	   	  for(int i=0;i<row;i++) {
	   		  for(int j=0;j<col;j++) {
	   			  System.out.print(b[i][j]+" ");
	   		  }
	   		  System.out.println();
	   	  }
	   	  System.out.println("2D matrix a: ");
	   	  for(int i=0;i<row;i++) {
	   		  for(int j=0;j<col;j++) {
	   			  System.out.print(a[i][j]+ " ");
	   		  }
	   		  System.out.println();

}
	}
}

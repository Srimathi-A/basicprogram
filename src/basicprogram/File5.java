package basicprogram;

import java.util.Scanner;

public class File5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,result;
      Scanner s= new Scanner(System.in);
      n=s.nextInt();
      String str1 =String.valueOf(n);
      if(str1.length() ==4) {
      result =(int)Math.pow((n/10)+(n%10),(2));
      if(n==result) 
    	  System.out.println(n+"is a tech number");
      else
    	  System.out.println(n+"is not tech number");
      }
      else
     	 System.out.println("not  a valid number");
      s.close();
 	}
}

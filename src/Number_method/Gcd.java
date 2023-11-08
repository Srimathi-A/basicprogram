package Number_method;

import java.util.Scanner;

public class Gcd {
   static void print(int n1,int n2,int gcd) {
	   //int n1=2,n2=6;
	 int Gcd =1;
	   for(int i=1;i<=n1&&i<=n2;i++) {
		   if(n1%i==0&&n2%i==0) {
			   gcd=i;
			   gcd=(n1+n2)/gcd;
		   }
		   else {
			   gcd=-1;
			   gcd=-1;
		   }
	   }
	   System.out.println("Gcd of "+n1+"and"+n2+" is "+gcd);
	   System.out.println("Lcm of "+n1+"and"+n2+" is "+gcd);
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int a,b,c=1;
  Scanner s = new Scanner(System.in);
  s.useDelimiter("[//s]+");
  a=s.nextInt();
  b=s.nextInt();
  print(a,b,c);
  s.close();
	}

}

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n,m;
    Scanner s = new Scanner(System.in);
    n=s.nextInt();
   System.out.print("Enter the n and m number: ");
   s.useDelimiter("[//s]+");
   m=s.nextInt();
   if(n==m)
	   System.out.println("yes");
   else
	   System.out.println("no");
	}

}

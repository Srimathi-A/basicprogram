package Assignment;
import java.util.Scanner;
public class File1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j,n;
 		Scanner s = new Scanner(System.in);
    		System.out.print("Enter the number:");
 		n=s.nextInt();
    		for(i=1;i<=n;i++)
    		{
        		for(j=1;j<=n-i+1;j++)
        		{
            			System.out.print((char)(j+96));
        		} 
        		System.out.println("");
    		}
	    }
}
	
	
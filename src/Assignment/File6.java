package Assignment;
import java.util.Scanner;
public class File6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
 
        int rows = s.nextInt();            
        for (int i= 0; i<= rows-1 ; i++)
        {
            for (int j=0; j <i; j++)
            {
                System.out.print(" ");
            }
            for (int k=i; k<=rows-1; k++) {
            	System.out.print("*" + " "); 
            	} System.out.println(""); 
            	} 
        for (int i= rows-1; i>= 0; i--)
        {
            for (int j=0; j< i ;j++)
            {
                System.out.print(" ");
            }
            for (int k=i; k<=rows-1; k++)
            {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
        s.close();
    }
           }


package basicprogram;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner s = new Scanner(System.in);
   char ch=s.next().charAt(0);
   switch(ch)
   {
       case 'a'|'A':
	   case 'e' |'E':	
	   case 'i' |'I':	
	   case 'o' |'O':
	   case 'u' |'U':	
		   System.out.println("vowel");
		   break;
		   default:
			   System.out.println("consonent");
			   s.close();
   }
	}

}

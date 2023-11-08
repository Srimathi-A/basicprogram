package basicprogram;
import java.util.Arrays;
public class Splitchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String vowels ="a+e+f";
      //splitting the string at"+"
      String [] result = vowels.split("//+");
      //converting array to string and printing it
      System.out.println("result= "+Arrays.toString(result));
	}

}

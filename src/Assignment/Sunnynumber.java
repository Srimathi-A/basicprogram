package Assignment;

public class Sunnynumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inputnumber = 80;

        //declare a variable which store next value of input number
        double next= inputnumber + 1;

        //Find the square root of the next number
        //store it as double value
        double square_root = Math.sqrt(next);

        //check whether the square root is a integer value or not
        //if yes return true otherwise false
        if(((square_root - Math.floor(square_root)) == 0))

        //if true then print it is a sunny number
           System.out.println( inputnumber  + " is a sunny number.");
        else
           //if true then print it is a sunny number
           System.out.println(inputnumber  + " is not a sunny number.");
  }
	}
  

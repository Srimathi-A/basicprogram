package Looping;

public class RecursiveSumOfAllNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     long sumOfAllNumbers = sumOfAllNumbers(9);
     System.out.println(sumOfAllNumbers);
	}
	public static long sumOfAllNumbers(long number)
	{
		if(number !=0) {  //9+8+7+6+5+4+3+2+1
			return number +sumOfAllNumbers(number - 1);
			//9+8+sumOfAllNumbers(7)
		} else {
			return number;
		}
	}
}

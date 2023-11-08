package basicprogram;

import java.util.Arrays;

public class Splitlimit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String vowels ="a:bc:de:fg:h";
     
     //splitting array at":"
     
     //limit is -2;array contains all substrings
     String[] result = vowels.split(":",-2);
     System.out.println("result when limit is -2= "+Arrays.toString(result));
     
     //limit is0;array contains all substring
     result=vowels.split(":",0);
     System.out.println("result when limit is 0= "+Arrays.toString(result));
     //limit is 2;array contains a maximum of 2 substrings
     result=vowels.split(":",2);
     System.out.println("result when limit is 2= "+Arrays.toString(result));
     //limit is 4;array contains a maximum of 2 substrings   
     result=vowels.split(":",4);
     System.out.println("result when limit is 4= "+Arrays.toString(result));
	}
	}
	



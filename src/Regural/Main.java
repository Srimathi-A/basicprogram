package Regural;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Pattern pattern = Pattern.compile("java Traning",Pattern .CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher("Welcome java Training");
    boolean matchFound=matcher.find();
    if(matchFound) {
    	System.out.println("Match found");
    	
    } else {
    	System.out.println("Match not fount");
    }
	}

}

package Regural;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class JavaAlphanumbericRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List <String> names= new ArrayList<String>();
      names.add("Imarticus");
      names.add("Imarticus123");
      names.add("Imarticus-----////");
      String regex = "^[a-zA-Z0-9]+$";
      Pattern pattern = Pattern.compile(regex);
      for(String name:  names) {
    	  Matcher matcher = pattern.matcher(name);
    	  System.out.println(matcher.matches());
      }
	}

}

package Regural;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Pattern p = Pattern.compile("a(bb)");
    Matcher m = p.matcher("aabbabbabbaaa");
    while(m.find())
    	System.out.println("Start : "+m.start()+",End: "+m.end()+",group"+m.group());
	}

}

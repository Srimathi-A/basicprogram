package basicprogram;

import java.util.Arrays;

public class Stringchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String st="this is great";
       char [] chars= st.toCharArray();
       for(int i=0;i<chars.length;i++) 
       {
    	    if(i==chars.length-1)
    	    	System.out.print(chars[i]);
    	    else
    	   System.out.print(chars[i]+ " ,");
       }
       System.out.println();
       System.out.println(Arrays.toString(chars));
	}

}

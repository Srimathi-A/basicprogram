package basicprogram;

public class Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       char ch ='c';
       String st = (String) Character.toString(ch);
       //Alternatively
       String st1= String.valueOf(ch);
       System.out.println("the string is: " +st);
       System.out.println("the string is: "+st1);
       
	}

}

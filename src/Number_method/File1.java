package Number_method;

public class File1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//wrapper class
		//converting integer object into float/double object
     Integer x=10;
     Float f =x.floatValue();
     System.out.println(x.floatValue());
     System.out.println("f = "+f);
     //converting primitive data type into objects
     String str ="10";//primitive data type
     Integer y =Integer.parseInt(str);
     Double d = y.doubleValue();
     System.out.println("y = "+y);
     System.out.println("d = "+d);
     //string str2=d.tostring();
     System.out.println(d.toString());
     System.out.println(String.valueOf(str));
     
     Integer num1=10;
     Integer num2=5;
     System.out.println(num1.compareTo(num2));
     System.out.println(num1.equals(num2));
     
     String a= "hello";
     String b="hello";
     if(a.equals(b))
    	 System.out.println("both strings are equal");
     if(a.compareTo(b)==0)
    	 System.out.println("both strings are equal");
     
     Double f1 =-20.45;
     System.out.println("abs = " + Math.abs(4-7));
     System.out.println("ceil = " + Math.ceil(f1));
     System.out.println("round = " + Math.round(f1));
     System.out.println("Floor = " + Math.floor(f1));
     System.out.println( "Minimum value = " +Math.min(12,24));
     System.out.println( "Maximum value = " +Math.max(12, 24));
     System.out.println(Math.pow(2, 3));
     System.out.println("escape sequnce =/r");
     System.out.println("escape sequnce =/n");
     System.out.println("this is/'java/' program");
     System.out.println(Character.isLetter('5'));
     
     System.out.println(Character.isDigit('1'));
     System.out.println(Character.isLowerCase('c'));
     System.out.println(Character.isLowerCase('\n'));
     System.out.println(Character.toUpperCase('a'));
     System.out.println(Character.toLowerCase('B'));
     String str2 = "Welcome";
     String str3= "welcome";
     System.out.println(str2.charAt(5));
     System.out.println(str2.compareTo(str3));
     System.out.println(str2.compareToIgnoreCase(str3));
     System.out.println(str2.concat(str3));
     System.out.println(str2.length());
     System.out.println(str2.substring(4));
     System.out.println(str2.substring(2,7));
     System.out.println(str2.replace('e', 'a'));
     
	}

}

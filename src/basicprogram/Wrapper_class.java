package basicprogram;

public class Wrapper_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creates objects of wrapper class
        Integer obj1=Integer.valueOf(23);
        Double obj2 =Double.valueOf(5.55);
        boolean obj3 =Boolean.valueOf(true);
        // converts into primitive types
         int var1    = obj1.intValue();
         double var2 = obj2.doubleValue();
        // print the primitive values
        System.out.println("the value of int variable:" +var1);
        System.out.println("the value of double variable:" +var2);
        
	}

}

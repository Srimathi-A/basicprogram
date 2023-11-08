package Wrapperclass;

public class Boolean_to_stringusing_tostring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     // create boolean variables
		boolean Value1=true;
		boolean Value2=false;
		//convert boolean to string using tostring()
		String value1 = Boolean.toString(Value1);
		String value2 = Boolean.toString(Value2);
		
		System.out.println(value1);//true
		System.out.println(value2);//false
	}

}

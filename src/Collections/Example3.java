package Collections;

import java.util.ArrayList;

public class Example3 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    @SuppressWarnings("rawtypes")
	ArrayList numbers = new ArrayList();
    numbers.add(1);
    numbers.add(7);
    numbers.add(5);
    numbers.add(6);
    numbers.add("File1");
    numbers.add("File2");
    System.out.println("number of elements in ArrayList: "+numbers.size());
	}

}

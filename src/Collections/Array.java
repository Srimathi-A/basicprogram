package Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Integer[] Array1= {1,2,3,4,5};
    Integer[] Array2= {5,3,6,7,9};
    Set<Integer>set1=new HashSet<Integer>();
    set1.addAll(Arrays.asList(Array1));
    Set<Integer>set2=new HashSet<Integer>();
    set2.addAll(Arrays.asList(Array2));
    Set<Integer>union_data=new HashSet<Integer>(set1);
    union_data.addAll(set2);
    System.out.print("union : ");
    System.out.println(union_data);
    Set<Integer>intersection_data=new HashSet<Integer>(set1);
    intersection_data.retainAll(set2);
    System.out.print("intersection : ");
    System.out.println(intersection_data);
    
	}

}

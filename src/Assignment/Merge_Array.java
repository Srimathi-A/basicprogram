package Assignment;

import java.util.Arrays;
import java.util.Scanner;

import basicprogram.Array;

public class Merge_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		System.out.print("Enter the size of the two arrays: ");
		s.nextInt();
     int arr1[] = {89,45,32,6};
     int arrs1[]=  {1,2,3,4,5};
     int n1 = arr1.length;
     int ns1= arrs1.length;
     int arr2[] = {24,456,23,567,34};
     int arrs2[]= {2,3,6,7,8};
     int ns2=arrs2.length;
     int n2 = arr2.length;
     int arr3[] = new int[n1 + n2 ];
    		 int arrs3[]= new int [ns1 + ns2];
     mergeArrays(arr1, arr2,arrs1,arrs2, n1, n2,ns1,ns2, arr3,arrs3);

     System.out.println("the  merged arrays is : ");
     for (int i=0; i < n1+n2; i++)
         System.out.print(arr3[i] + " ");
     int i=0;
 	System.out.print(arrs3[i] + " ");
          
 }
  
 public static void mergeArrays(int[] arr1, int[] arr2, int[] arrs1, int[] arrs2, int n1, int n2, int ns1, int ns2, int[] arr3, int[] arrs3){
     int i = 0; 
     int j = 0; 
     int k = 0; 
     while(i < n1){  
      arr3[k++] = arr1[i++];  
     }  
     while(j < n2){  
      arr3[k++] = arr2[j++];  
     }
     Arrays.sort(arr3);
     Arrays.sort(arrs3);
 }

	}



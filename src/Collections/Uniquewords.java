package Collections;

import java.util.Scanner;

public class Uniquewords {
  static int calculateNoOfuniquewords(String str) {
	  String[]words=str.split(" ");
	  boolean[]array=new boolean[words.length];
	  int j,i=0;
	  int count=0;
	  for(i=0;i<words.length;i++) {
		  if(!array[i]) {
			  count++;
			  for(j=i+1;j<words.length;j++) {
				  if(words[j].compareTo(words[i])==0) {
					  array[j]=true;
					  count--;
					  
				  }
			  }
		  }
	  }
	  return count;
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
	Scanner s= new Scanner(System.in);
	String str;
	System.out.println("enter the string");
	str=s.nextLine();
	int count =calculateNoOfuniquewords(str);
	System.out.println("total nuber of unique words in\""+str+"\"are"+count);
      
    		}   
      
	}



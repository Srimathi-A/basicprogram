package Switchcase;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int stud_id,mark1,mark2,mark3;
    String stud_name;
    float total,avg;
    Scanner s = new Scanner (System.in);
    System.out.print("Enter the student id: ");
    stud_id =s.nextInt();
    System.out.print("Enter the student name: ");
    stud_name =s.next();
    System.out.print("Enter the mark1: ");
    mark1 =s.nextInt();
    System.out.print("Enter the mark2:");
    mark2 = s.nextInt();
    System.out.print("Enter the mark3: ");
    mark3 = s.nextInt();
    total = mark1+mark2+mark3;
    avg = total/3;
    if(avg >= 90)
    	System.out.println("Excellent");
    else if(avg >= 80)
         System.out.println("very good");
    else if (avg >=70)
    	System.out.println("good");
    else if (avg >=60)
    	System.out.println("Improve");
    else if ( avg >=50)
    	System.out.println("work hard");
    else if (avg >=40)
    	System.out.println("fail");
    else
    	System.out.println("not  eligible");
    	
    
	}

}

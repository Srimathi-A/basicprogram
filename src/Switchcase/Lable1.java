package Switchcase;

public class Lable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numbers = {10,20,30,40,50};
		   start:for (int x:numbers) {
			   if (x == 30) {
				   continue start;
				   
			   }
			   System.out.print(x);
			   System.out.print("\n");
			   
	}

}
}

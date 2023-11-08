package basicprogram;

public class Test {
	int b=100 ;
	public void local_var() {
		int a=10 ;
		System.out.println("local a = " +a);
		System.out.println("local b =  " +b);
	}
	void display() {
		//System.out.println(a);
		System.out.println("display b = " +b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test obj = new  Test();
		obj.local_var();
		obj.display();
		System.out.println(obj.b);
     
	}

}

package basicprogram;

public class Local {
	int a;
	int b =100;
	public void local_va() {
		System.out.println("local a = " +a);
		System.out.println("local b =  " +b);
	}
	void display() {
		int a = 10;
		System.out.println(a);
		System.out.println("display b = " +b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Local obj = new  Local();
		obj.local_va();
		obj.display();System.out.println(obj.b);
     
	}

}



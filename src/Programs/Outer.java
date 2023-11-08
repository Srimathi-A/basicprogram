package Programs;

public class Outer {
  // static member of the outer class
	private static char grade ='A';
	static void test () {
		System.out.println("Grade:Inside static method" + grade);
	}
	// non_static class
	static class Nested {
		public void fun() {
			// nested class can access the static member of the outer class
			System.out.println("Grade:Inside nested class: " + grade);
		}
	}
	public class check {
		void display() {
			System.out.println("check class grade: "+grade);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Outer.Nested obj = new Outer.Nested();
    
    obj.fun();// static class method
    System.out.println("ststic variable : " +grade);//static variable 
    test();// static method inside the outer class
    Outer.check ck = new Outer().new check();
    ck.display();
	}
}

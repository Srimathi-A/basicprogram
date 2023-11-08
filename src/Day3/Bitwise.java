package Day3;

public class Bitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a,b,c;
    a=60;
    b=13;
    c=0;
    c=a & b;
    System.out.println("a&b ="+c);
    c=a|b;
    System.out.println("c|b ="+c);
    c=a^b;
    System.out.println("a^b ="+c);
    c=~a;
    System.out.println("~a ="+c);
    c=a<<2;
    System.out.println("a<<2 ="+c);
    c=a>>2;
    System.out.println("a>>2 ="+ c);
    c=a>>>2;
    System.out.println("a>>>2 ="+c);
    }

}

package basicprogram;
public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String text =(" java is a fun programming language");
    
    //split string from space
    String[] result = text.split( " ");
    System.out.print("result = ");
    for(String str:result) {
    	System.out.print(str + ",");
    }
	}

}

package Assignment;

public class Determine {
	public static boolean check(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        String concatenatedString = s1 + s1;
        return concatenatedString.contains(s2);
    }

    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "deabc";
        boolean flag = check(s1, s2);
        if(flag) System.out.println(s1 +  s1 );
        else System.out.println(s1 + s1);
    }
}


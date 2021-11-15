//Given two strings, append them together (known as
// "concatenation") and return the result. However, if the concatenation
// creates a double-char, then omit one of the chars. If the inputs
// are “Mark” and “Kate” then the output should be “markate”.
// (The output should be in lowercase).
package questions.string;
import java.util.Scanner;

public class StringConcatenate {
    public static String concatenate(String s1, String s2)
    {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        if(s1.charAt(s1.length()-1) == s2.charAt(0))
            s1 = s1 + s2.substring(1);
        else s1 = s1 + s2;
        return s1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(concatenate(s1,s2));
    }
}

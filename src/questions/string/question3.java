//Given a string, return a new string made of n copies of the
// first 2 chars of the original string where n is the length of
// the string. The string may be any length. If there are fewer
// than 2 chars, use whatever is there.
//If the input is “Apple” then the output should be “ApApApApAp”

package questions.string;
import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String s = sc.nextLine();
        System.out.println(s.substring(0,2).repeat(s.length()));
    }
}

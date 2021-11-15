//Given two strings, a and b, create a bigger string made of the
// first char of a, the first char of b, the second char of a, the
// second char of b, and so on. Any leftover chars go at the end of
// the result.
//If the inputs are "Hello" and "World", then the output is
// "HWeolrllod".
package questions.string;

import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine(),b = sc.nextLine();
        String s = "";
        int i;
        for(i = 0; i < a.length(); i++)
        {
            if(i == b.length())
            {
                s = s + a.substring(i);
                break;
            }
            else s = s + a.charAt(i) + b.charAt(i);
        }
        if(i < b.length()) s = s + b.substring(i);
        System.out.println(s);
    }
}

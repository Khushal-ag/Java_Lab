//Given a string and an int n, return a string made
// of n repetitions of the last n characters of the string. You may
// assume that n is between 0 and the length of the string,
// inclusive. For example, if the inputs are “Niraj” and 3, then
// the output should be “rajrajraj.
package questions.string;

import java.util.Scanner;

public class question5 {
    public static String LastString(String s,int n)
    {
        String s1 = "";
        for(int i = 0; i < n; i++)
        {
            s1 += s.substring(s.length()-n);
        }
        return s1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        System.out.println(LastString(s,n));
    }
}

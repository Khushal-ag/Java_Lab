//write a Java program to find if the given number is
// palindrome or not

package questions.arrayQuestion;
import java.util.Scanner;

public class ArrQuestion1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int temp = n,s = 0;
        while(n!=0)
        {
            int r = n%10;
            s = s*10 + r;
            n /= 10;
        }
        if(temp == s) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
}

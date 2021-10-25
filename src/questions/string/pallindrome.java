package questions.string;
import java.util.Scanner;

class ChangePallindrome{
    String s;
    ChangePallindrome(String s){
        this.s = s;
    }

}
public class pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        ChangePallindrome obj = new ChangePallindrome(sc.nextLine());
    }
}

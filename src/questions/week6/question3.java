package questions.week6;
import java.util.Scanner;
class NumberOutOfRange extends Exception{
    NumberOutOfRange(String s){
        super(s);
    }
}
class TestNumberException{
    static void range(int n)throws NumberOutOfRange{
        if(!(n>=0 && n<=100))
            throw new NumberOutOfRange("value out of range");
    }
}
public class question3 extends TestNumberException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    }
}

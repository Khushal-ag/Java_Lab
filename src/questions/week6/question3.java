package questions.week6;
import java.util.Scanner;
class NumberOutOfRange extends Exception{
    NumberOutOfRange(String s){
        super(s);
    }
}
class TestNumberException{
    static void range(int m1,int m2,int m3)throws NumberOutOfRange{
        if(!(m1>=0 && m1<=100) || !(m2>=0 && m2<=100) || !(m3>=0 && m3<=100))
            throw new NumberOutOfRange("value out of range");
        else
            System.out.println("Average Marks : " + (float)(m1+m2+m3)/3);
    }
}
public class question3 extends TestNumberException {
    String name;
    int m1,m2,m3;
    question3(String n,int m1,int m2,int m3){
        name = n;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("First Student ->");
        System.out.print("Enter Details : ");
        try{
            question3 obj1 = new question3(sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt());
            TestNumberException.range(obj1.m1, obj1.m2, obj1.m3);
        }
        catch (Exception e)
        {
            System.out.println("Exception : "+e);
        }
        System.out.println("Second Student ->");
        System.out.print("Enter Details : ");
        try{
            question3 obj2 = new question3(sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt());
            range(obj2.m1, obj2.m2, obj2.m3);
        }
        catch (Exception e)
        {
            System.out.println("Exception : "+e);
        }
    }
}

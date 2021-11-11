//Create class Number with only one private instance variable
// as a int primitive type. Initialize it with parameterised constructor
// and include the following methods  isZero( ), isPositive(), isNegative( ),
// isOdd( ), isEven( ), isPrime(), isAmstrong()
//the above methods return boolean primitive type value.
//getFactorial(), getSqrt(), getSqr(), sumDigits()  these methods return
// int primitive type value.
//dispBinary(), dispOctal(), displayhexa() these method return string value
package questions.week3;

import java.util.Scanner;
class Number {
    private int num;
    Number(int num)
    {
        this.num=num;
    }
    boolean isZero()
    {
        return num == 0;
    }
    boolean isPositive()
    {
        return num > 0;
    }
    boolean isNegative()
    {
        return num < 0;
    }
    boolean isOdd()
    {
        return num % 2 != 0;
    }
    boolean isEven()
    {
        return num % 2 == 0;
    }
    boolean isPrime()
    {
        if(num>1)
        {int f=0;
            for(int i=2;i<=Math.sqrt(num);i++)
            {
                if(num%i==0)
                {
                    f=1;
                    break;
                }
            }
            return f == 0;
        }
        else return false;
    }
    boolean isArmstrong()
    {
        int l=Integer.toString(num).length();
        int m=num,sum=0;
        while(m>0)
        {
            sum= (int) (sum+Math.pow(m%10,l));
            m=m/10;
        }
        return sum == num;
    }
    int getFactorial()
    {
        int f=1;
        for(int i=2;i<=num;i++){
            f=f*i;
        }
        return f;
    }
    int getSqrt()
    {
        return (int)Math.sqrt(num);
    }
    int getSqr()
    {
        return num*num;
    }
    int sumDigits()
    {
        int sum=0,m=num;
        while(m>0)
        {
            sum=sum+m%10;
            m=m/10;
        }
        return sum;
    }
    String dispBinary()
    {
        return Integer.toBinaryString(num);
    }
    String dispOctal()
    {
        return Integer.toOctalString(num);
    }
    String dispHexa()
    {
        return Integer.toHexString(num);
    }
}
public class TestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Number obj=new Number(num);
        System.out.println(obj.isZero());
        System.out.println(obj.isPositive());
        System.out.println(obj.isNegative());
        System.out.println(obj.isOdd());
        System.out.println(obj.isEven());
        System.out.println(obj.isPrime());
        System.out.println(obj.isArmstrong());
        System.out.println(obj.getFactorial());
        System.out.println(obj.getSqrt());
        System.out.println(obj.getSqr());
        System.out.println(obj.sumDigits());
        System.out.println(obj.dispBinary());
        System.out.println(obj.dispOctal());
        System.out.println(obj.dispHexa());
    }
}

package questions.week6;

import java.util.Scanner;

class function{
    public static void prime(int x){
        int f = 0;
        for (int i = 2; i <= x/2; i++) {
            if(x%i==0) {
                f = 1;
                System.out.println("Not a prime");
                break;
            }
        }
        if(f==0) System.out.println("Prime number");
    }
    public static void factorial(int x){
        double f = 1;
        for(int i=x;i>1;i--)
            f *= i;
        System.out.println("Factorial : "+f);
    }
    public static void fibonacci(int x){
        int a = 0,b = 1;
        int total = a + b;
        System.out.println("Fibonacci ->");
        System.out.print(a+" "+b+" ");
        x -= 2;
        while(x!=0){
            System.out.print(total+" ");
            a = b;
            b = total;
            total = a+b;
            x -= 1;
        }
        System.out.println();
    }
}
class chk{
    public static void chk_function(int val)
    {
        Scanner sc = new Scanner(System.in);
        if(val==1) {
            System.out.print("Enter no. to check prime : ");
            int x = sc.nextInt();
            function.prime(x);
        }
        else if(val==2) {
            System.out.print("Enter no. calculate fibonacci series : ");
            int x = sc.nextInt();
            function.fibonacci(x);
        }
        else if(val==3) {
            System.out.print("Enter no. to calculate factorial : ");
            int x = sc.nextInt();
            function.factorial(x);
        }
        else{
            System.out.println("Program Finish.");
        }
    }
}
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        do{
            System.out.println("[1] Prime no.");
            System.out.println("[2] Fibonacci.");
            System.out.println("[3] Factorial.");
            System.out.println("[4] Exit.");
            System.out.print("Enter Choice -> ");
            t = sc.nextInt();
            chk.chk_function(t);
        }while (t != 4);
    }
}

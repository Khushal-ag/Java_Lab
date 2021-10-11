//Write a program to reverse the elements of a given 2*2 array.
// Four integer numbers needs to be passed as Command Line arguments.
package questions.arrayQuestion;

public class ArrQuestion6 {
    public static void main(String[] args) {
        if(args.length != 4) System.out.println("Please enter 4 integer numbers");
        else{
            for (int i = args.length-1; i >= 0 ; i--) {
                if(i == args.length/2 - 1) System.out.println();
                System.out.print(args[i]);
                System.out.print(" ");
            }
        }
    }
}

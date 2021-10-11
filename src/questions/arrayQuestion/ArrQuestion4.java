//Initialize an integer array with ascii values and print
// the corresponding character values in a single row.
package questions.arrayQuestion;

public class ArrQuestion4 {
    public static void main(String[] args) {
        int[] arr = {65,66,91,98,74,88,45,76,90,92,97,100};
        for(var i:arr){
            System.out.print((char)i);
            System.out.print(" ");
        }
    }
}

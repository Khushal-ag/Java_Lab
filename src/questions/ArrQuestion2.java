//Write a program to initialize an integer array with
// values and check if a given number is present in the array or not.
//If the number is not found, it will print -1 else it will print
// the index value of the given  number in the array.

package questions;
import java.util.Scanner;

public class ArrQuestion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,5,6,67,8,12,1,56,71,45};
        System.out.print("Enter a number: ");
        int ele = sc.nextInt();
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==ele) {
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}

//Given an array of type int, print true if every element
//is 1 or 4.
//only14([1, 4, 1, 4]) → true
//only14([1, 4, 2, 4]) → false
//only14([1, 1]) → true

package questions;

public class ArrQuestion5 {
    public static void main(String[] args) {
        int[] arr = {1,4,4,1,4,2,1,1,1,4,4,4};
        boolean b = true;
        for (var i:arr) {
            if(i != 1 && i != 4){
                b = false;
                break;
            }
        }
        System.out.println(b);
    }
}

//Create an int array of size 5, initialize it with values
// (10,20,30,40,50). Create a public boolean search(int arr[], int
// search_element) this method will return true if the search element
// is present in the array else it will  print a message "element not found"
package questions.week3;

import java.util.Scanner;
class Array {
    public boolean search(int arr[],int search_element)
    {
        for (int ele : arr) {
            if (ele == search_element) return true;
        }
        System.out.println("element not found");
        return false;
    }
}
public class TestArray {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to search : ");
        int n = sc.nextInt();
        Array obj = new Array();
        System.out.println(obj.search(arr,n));
    }
}

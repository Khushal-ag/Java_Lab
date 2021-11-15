package questions.week6;
import java.util.Scanner;
public class question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array : ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the elements in the array ->");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            try {
                String s = sc.nextLine();
                arr[i] = Integer.parseInt(s);
                System.out.print("Enter the index of the array element you want to access : ");
            }
            catch (NumberFormatException e)
            {
                System.out.println("Exception : "+e);
            }

        }
        int i = sc.nextInt();
        try{
            System.out.println("The array element at index "+i+" = "+arr[i]);
            System.out.println("The array element successfully accessed");
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println("Exception : "+e);
        }
    }
}

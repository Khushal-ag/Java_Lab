//  At GLA College of  Programming, the final school fees to be paid is
//  calculated as follows.
//•	Original Fees should be greater than or equal to Rs. 50 000
//•	Minimum fixed deposit of R10 000
//•	If a deposit is greater than or equal to half the original fees, you get a 5% discount from the original fees
//•	Final total fees will also include the following
//      1.School Levy is 10% of original fees
//      2.Sports fee is 5% of the original fees.
// Write a program the calculates the final total fees to be paid.
// Program must request user to enter original fees value greater than Rs.50 000.
// Program should also request user to enter amount to deposit before
// calculating final total fees.
package questions.week5;

import java.util.Scanner;
class College_fees{
    static double original = 80000;
    static double final_amnt = original;
    static double levy = original/10,sports = 5*original/100;
    public static void fees(double deposit)
    {
        if(deposit<10000) System.out.println("Deposit is not sufficient");
        else if(deposit >= original/2){
            final_amnt -= (double) 5*final_amnt/100;
        }
        final_amnt += levy + sports;
        System.out.println("Final Fees :"+final_amnt);
    }
}
public class question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter deposit amount: ");
        double amount = sc.nextDouble();
        College_fees.fees(amount);
    }
}

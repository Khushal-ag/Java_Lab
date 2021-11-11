//Suppose you have a Piggie Bank with an initial amount of 50
// and you have to add some more amount to it. Create a class 'AddAmount'
// with a data member named 'amount' with an initial value of 50. Now make
// two constructors of this class as follows:
//  1 - without any parameter - no amount will be added to the Piggie Bank
//  2 - having a parameter which is the amount that will be added to Piggie Bank
//Create object of the 'AddAmount' class and display the final amount in
// Piggie Bank.
package questions.week3;
class AddAmount {
    static int amount = 50;
    AddAmount()
    {
    }
    AddAmount(int a)
    {
        amount += a;
    }
}
public class TestAmount {
    public static void main(String[] args) {
        AddAmount obj1 = new AddAmount(25);
        AddAmount obj2 = new AddAmount();
        System.out.println(AddAmount.amount);
    }
}

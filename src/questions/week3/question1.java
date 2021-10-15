// Create a class Car having properties manufacturer and
// price. Create three instances of the class and display the
// details of each car sorted with respect to the price.

package questions.week3;
import java.util.Scanner;
class Car{
    String manufacture;
    double price;
    public Car(){
        manufacture = "null";
        price = 0.0;
    }
    public static void sort(Car arr[])
    {
        for (int i = 0; i < arr.length-1; i++) {
            int minindex = i;
            double minval = arr[i].price;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j].price<minval){
                    double tempp = arr[j].price;
                    String temps = arr[j].manufacture;
                    arr[j].price = arr[minindex].price;
                    arr[j].manufacture = arr[minindex].manufacture;
                    arr[minindex].price = tempp;
                    arr[minindex].manufacture = temps;
                }
            }
        }
        for (var i:arr) {
            System.out.println("Manufacture: "+i.manufacture+" Price: "+i.price);
        }
    }
}
public class question1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Car[] arr = new Car[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Car();
            System.out.print("Enter Manufacture "+(i+1)+" : ");
            arr[i].manufacture = sc.nextLine();
            System.out.print("Enter Price of car "+(i+1)+" : ");
            arr[i].price = sc.nextDouble();
            sc.nextLine();
        }
        Car.sort(arr);
    }
}

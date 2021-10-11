//Create a class Book with the following information.
//Member variables : name (String),
// author (of the class Author you have just created),
// price (double), and qtyInStock (int)
//[Assumption: Each book will be written by exactly one Author]
//Parameterized Constructor: To initialize the variables
//  Getter methods  for all the member variables
//In the main method, create a book object and print all details of the book
// (including the author details)

package questions.basicQuestion;

class Book{
    String name,author;
    int qtyInStock;
    double price;
    Book(String name,String author,int qtyInStock,double price){
        this.name = name;
        this.author = author;
        this.qtyInStock = qtyInStock;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public double getPrice() {
        return price;
    }
}
public class Question2 {
    public static void main(String[] args) {
        Book b1 = new Book("OS","Galvin",50,530);
        Book b2 = new Book("CN","Ali",35,715);
        System.out.println("Details Book 1:");
        System.out.println(b1.getName());
        System.out.println(b1.getAuthor());
        System.out.println(b1.getQtyInStock());
        System.out.println(b1.getPrice());
        System.out.println("Details Book 2:");
        System.out.println(b2.getName());
        System.out.println(b2.getAuthor());
        System.out.println(b2.getQtyInStock());
        System.out.println(b2.getPrice());
    }
}

package questions.week2;

import questions.week2.Outer.Inner;

class Outer{
    public void display(){
        System.out.println("Inside outer");
    }
    class Inner {
        public static void display() {
            System.out.println("Inside inner");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.display();
        Inner.display();
    }
}

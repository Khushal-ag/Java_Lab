package questions.week2;
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
        Outer.Inner obj2 = obj.new Inner();
        obj2.display();
    }
}

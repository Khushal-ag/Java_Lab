package questions.basicQuestion;
class calculation {
    int area;
    int area(int x) {
        area = x*x;
        return area;
    }
    int area(int x,int y) {
        area = x*y;
        return area;
    }
}
public class overloading {
    public static void main(String[] args) {
        calculation obj = new calculation();
        System.out.println("Area of square : "+obj.area(5));
        System.out.println("Area of rectangle : "+obj.area(5,6));
    }
}


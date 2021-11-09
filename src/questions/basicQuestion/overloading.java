package questions.basicQuestion;
class calculation {
    int area;
    int area(int x) {
        return area;
    }
    int area(int x,int y) {
        area = x*y;
        area = x*x;
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


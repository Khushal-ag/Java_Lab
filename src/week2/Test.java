package question;
import java.util.Scanner;

class Point {
    private int x,y;
    public Point()
    {
        x = 0;
        y = 0;
    }
    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void setXY(int x,int y) {
        this.x = x;
        this.y = y;
    }
}
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Point obj = new Point();
    }
}

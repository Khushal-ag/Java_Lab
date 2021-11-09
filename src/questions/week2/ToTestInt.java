package question;
interface test{
    public void square(int n);
}
class Arithmetic implements test
{
    @Override
    public void square(int n) {
        System.out.println(n*n);
    }
}
public class ToTestInt {
    public static void main(String[] args) {
        Arithmetic obj = new Arithmetic();
        obj.square(10);
    }
}

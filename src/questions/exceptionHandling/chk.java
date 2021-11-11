package questions.exceptionHandling;

public class chk {
    public static void main(String[] args) {
        try {
            System.out.println(50 / 0);
            System.out.println(args[4]);
            System.out.println("hello");
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}

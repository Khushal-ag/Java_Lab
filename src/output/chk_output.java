package output;
class Test{
    public static void change(Integer i)
    {
        i++;
    }
    public static void change(int i)
    {
        i++;
    }
}
public class chk_output {
    public static void main(String[] args) {
        int i2 = 25;
        Integer i1 = i2;
        Test.change(i1);
        Test.change(i2);
        System.out.println(i1);
        System.out.println(i2);
    }
}
package questions.wrapperClass;

public class assignment2 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println("Integer Number : "+n);
        System.out.println("Binary Equivalent : "+Integer.toBinaryString(n));
        System.out.println("Hexa Decimal Equivalent : "+Integer.toHexString(n));
        System.out.println("Octal Equivalent : "+Integer.toOctalString(n));
    }
}

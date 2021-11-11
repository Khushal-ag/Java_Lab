//Create a class named 'Programming'. While creating an object of
// the class, if nothing is passed to it, then the message "I love
// programming languages" should be printed. If some String is passed to it,
// then in place of "programming languages" the name of that String variable
// should be printed.
package questions.week3;
class Programming {
    Programming()
    {
        System.out.println("I love programming languages");
    }
    Programming(String s)
    {

        System.out.println("I love "+s);
    }
}
public class TestProgramming {
    public static void main(String[] args) {
        Programming obj=new Programming();
        Programming obj2=new Programming("Java");
    }
}

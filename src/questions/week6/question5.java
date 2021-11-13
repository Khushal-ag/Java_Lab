package questions.week6;
class AgeException extends Exception{
    AgeException(String s)
    {
        super(s);
    }
}
class TestException{
    static void ageCheck(Integer age)throws AgeException{
        if(age >= 18 && age < 60)
            System.out.println("Age is perfect");
        else
            throw new AgeException("Not valid age");
    }
}

public class question5 extends TestException {
    public static void main(String[] args) {
        System.out.println("Name of person : "+args[0]);
        try{
            ageCheck(Integer.parseInt(args[1]));
        }
        catch (AgeException e){
            System.out.println("Exception : "+e);
        }
    }
}

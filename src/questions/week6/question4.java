package questions.week6;
import java.util.Scanner;
class InvalidCountryException extends Exception{
    InvalidCountryException(String s)
    {
        super(s);
    }
}
class UserRegistration{
   static void registerUser(String username,String userCountry)throws InvalidCountryException{
        if(!userCountry.equals("India"))
            throw new InvalidCountryException("User Outside India");
        else
            System.out.println("User registration done successfully");
    }
}
public class question4 extends UserRegistration{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username : ");
        String username = sc.nextLine();
        System.out.print("Enter user country : ");
        String userCountry = sc.nextLine();
        try {
            UserRegistration.registerUser(username, userCountry);
        }
        catch(InvalidCountryException e){
            System.out.println("Exception : "+e);
        }
    }
}

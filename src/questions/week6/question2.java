package questions.week6;

public class question2 {
    public static void main(String[] args) {
        int sum = 0;
        double avg;
        for (int i = 0; i < args.length; i++) {
            sum += Integer.parseInt(args[i]);
        }
        System.out.println("Sum : "+sum);
        try{
            avg = sum/ args.length;
            System.out.println("Average : "+avg);
        }
        catch(Exception e){
            System.out.println("Exception : "+e);
        }

    }
}

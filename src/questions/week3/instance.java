package questions.week3;
class InstanceCount{
    static int count;
    {
        count++;
    }
}
public class instance {
    public static void main(String[] args) {
        for(int i = 0; i<8; i++)
            new InstanceCount();
        System.out.println("No. of total instances = "+InstanceCount.count );
    }
}

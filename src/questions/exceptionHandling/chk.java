package questions.exceptionHandling;

class thread1 extends Thread
{
    public void run()
    {
        try
        {
            for(int i=1;i<5;i++)
            {
                System.out.println("K...."+i);
                //sleep(1000);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class thread2 extends Thread
{
    public void run()
    {
        try
        {
            for(int j=70;j<75;j+=1)
            {
                System.out.println("M...."+j);
                //sleep(500);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class chk
{
    public static void main(String args[]) throws InterruptedException {
        thread1 th=new thread1();
        thread2 th2= new thread2();
        th.start();
        th2.start();
        th.join();
    }
}
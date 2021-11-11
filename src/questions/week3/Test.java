package questions.week3;
import java.util.Scanner;

class Student
{
    String name;
    double percentage;
    Student(String name,double percentage)
    {
        this.name=name;
        this.percentage=percentage;
    }
}
public class Test {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name and percentage of student 1");
        Student stu1=new Student(sc.next(),sc.nextDouble());
        System.out.println("Enter name and percentage of student 2");
        Student stu2=new Student(sc.next(),sc.nextDouble());
        System.out.println("Enter name and percentage of student 3");
        Student stu3=new Student(sc.next(),sc.nextDouble());
        if(stu1.percentage>stu2.percentage)
        {
            if(stu1.percentage>stu3.percentage)
            {
                System.out.println("Topper is "+stu1.name+" Percentage is "+stu1.percentage);
            }
            else
            {
                System.out.println("Topper is "+stu3.name+" Percentage is "+stu3.percentage);
            }
        }
        else
        {
            if(stu2.percentage>stu3.percentage)
            {
                System.out.println("Topper is "+stu2.name+" Percentage is "+stu2.percentage);
            }
            else
            {
                System.out.println("Topper is "+stu3.name+" Percentage is "+stu3.percentage);
            }
        }
    }
}

package questions.com.myname.main;
import questions.com.myname.student.student;
import java.util.Scanner;
public class StudentMain {
    public void search()
    {

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        student stu[] = new student[n];
        for (int i = 0; i < n; i++) {
            stu[i] = new student();
        }
    }
}

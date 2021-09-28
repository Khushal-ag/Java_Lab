//Write a program to print the names of Student1s by creating a Student1 class.
// If no name is passed while creating an object of Student1 class,
// then the name should be "Unknown",
// otherwise the name should be equal to the String value
// passed while creating object of Student1 class.

package questions;
class Student1{
    String stuName;
    int rollNo;
    Student1(){
        rollNo = 0;
        stuName = "Unknown";
    }

    Student1(String name,int roll){
        rollNo = roll;
        stuName = name;
    }
}
public class Question1 {
    public static void main(String[] args) {
        Student1 stu1 = new Student1("Rohan",23);
        Student1 stu2 = new Student1();
        Student1 stu3 = new Student1("Aman",15);
        System.out.println(stu1.stuName+" "+stu1.rollNo);
        System.out.println(stu2.stuName+" "+stu2.rollNo);
        System.out.println(stu3.stuName+" "+stu3.rollNo);
    }
}

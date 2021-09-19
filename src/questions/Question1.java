//Write a program to print the names of Student1s by creating a Student1 class.
// If no name is passed while creating an object of Student1 class,
// then the name should be "Unknown",
// otherwise the name should be equal to the String value
// passed while creating object of Student1 class.

package questions;
class Student1{
    String stuName;
    Student1(){
        stuName = "Unknown";
    }

    Student1(String name){
        stuName = name;
    }
}
public class Question1 {
    public static void main(String[] args) {
        Student1 stu1 = new Student1("Rohan");
        Student1 stu2 = new Student1();
        Student1 stu3 = new Student1("Aman");
        System.out.println(stu1.stuName);
        System.out.println(stu2.stuName);
        System.out.println(stu3.stuName);
    }
}

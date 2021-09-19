//Write a program to print the names of students by creating a Student class.
// If no name is passed while creating an object of Student class,
// then the name should be "Unknown",
// otherwise the name should be equal to the String value
// passed while creating object of Student class.

package questions;

class Student{
    String stuName;
    Student(){
        stuName = "Unknown";
    }

    Student(String name){
        stuName = name;
    }
}
public class Question1 {
    public static void main(String[] args) {
        Student stu1 = new Student("Rohan");
        Student stu2 = new Student();
        Student stu3 = new Student("Aman");
        System.out.println(stu1.stuName);
        System.out.println(stu2.stuName);
        System.out.println(stu3.stuName);
    }
}

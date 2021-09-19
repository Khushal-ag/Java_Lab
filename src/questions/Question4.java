//Design an application in java that contains a class
// Student having properties name and percentage. Create a class Test
// that declares three instances of Student class. The values are
// passed through constructor at the time of its object creation.
// The output should be the name and percentage of the topper.

package questions;

class Student{
    String name;
    float percentage;

    public Student(String name, float percentage) {
        this.name = name;
        this.percentage = percentage;
    }
}

public class Question4 {
    public static void main(String[] args) {
        Student s1 = new Student("Ram",30);
        Student s2 = new Student("Ajay",35);
        Student s3 = new Student("Tej",28);

    }
}

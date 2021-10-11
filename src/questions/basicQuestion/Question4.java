//Design an application in java that contains a class
// Student having properties name and percentage. Create a class Test
// that declares three instances of Student class. The values are
// passed through constructor at the time of its object creation.
// The output should be the name and percentage of the topper.

package questions.basicQuestion;

class Student{
    String name;
    float percentage;

    public String getName() {
        return name;
    }
    public float getPercentage() {
        return percentage;
    }

    public Student(String name, float percentage) {
        this.name = name;
        this.percentage = percentage;
    }
}

public class Question4 {
    public static void main(String[] args) {
        Student s1 = new Student("Ram",80);
        Student s2 = new Student("Ajay",70);
        Student s3 = new Student("Tej",90.2f);
        float m = Math.max(Math.max(s1.getPercentage(), s2.getPercentage()), s3.getPercentage());
        System.out.println("Toppers details:");
        if(m== s1.getPercentage()){
            System.out.println(s1.getName());
            System.out.println(s1.getPercentage());
        }

        else if(m== s2.getPercentage()){
            System.out.println(s2.getName());
            System.out.println(s2.getPercentage());
        }

        else{
            System.out.println(s3.getName());
            System.out.println(s3.getPercentage());
        }
    }
}

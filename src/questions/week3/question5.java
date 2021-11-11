package questions.week3;
class Student1{
    String name,address;int age;
    Student1()
    {
        name ="unknown";
        age=0;
        address="not available";
    }
    public void setInfo(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public void setInfo(String name,int age,String address)
    {
        this.name=name;
        this.age=age;
        this.address=address;
    }
}
public class question5 {
    public static void main(String[] args) {
        Student1 obj[]=new Student1[10];
        for (int i=0;i<10;i++)
        {
            obj[i]=new Student1();
        }
        obj[2].setInfo("khushal",18,"Mathura");
        obj[5].setInfo("kashish",19,"Mathura");
        obj[7].setInfo("Tanmay",19,"Aligarh");
        obj[1].setInfo("Ayush",19,"Hathras");
        obj[3].setInfo("Vaibhav",19,"Mathura");
        obj[0].setInfo("Nandini",18);
        obj[4].setInfo("Shruti",18);
        obj[9].setInfo("Harsh",18);
        for (int i=0;i<10;i++)
        {
            System.out.println(obj[i].name+"  "+obj[i].age+"  "+obj[i].address);
        }
    }
}

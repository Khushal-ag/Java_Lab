//Create a class named 'Member' having the following members:
//Data members
//1 - Name
//2 - Age
//3 - Phone number
//4 - Address
//5 - Salary
//It also has a method named 'printSalary' which prints the
// salary of the members.
//Two classes 'Employee' and 'Manager' inherits the 'Member'
// class. The 'Employee' and 'Manager' classes have data
// members 'specialization' and 'department' respectively.
// Now, assign name, age, phone number, address and salary
// to an employee and a manager by making an object of both
// of these classes and print the same.
package questions.week5;
class Member{
    String name,phone,address;
    int age;
    double salary;
    Member(String name,int age,String phone,String address,double salary){
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.address = address;
        this.salary = salary;
    }
    public void display()
    {
        System.out.println("Name = "+name+" Address = "+address+" Age = "+age+" Phone number = "+phone+" Salary = Rs."+salary);
    }
    public void printSalary()
    {
        System.out.println("Salary : "+salary);
    }
}
class Employee extends Member{
    String specialization;
    Employee(String name,int age,String phone,String address,double salary,String specialization) {
        super(name, age, phone, address, salary);
        this.specialization = specialization;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Specialization : "+this.specialization);
    }
}
class Manager extends Member{
    String department;
    public Manager(String name,int age,String phone,String address,double salary,String department) {
        super(name, age, phone, address, salary);
        this.department = department;
    }
    @Override
    public void display()
    {
        super.display();
        System.out.println("Department : "+this.department);
    }
}
public class question3 {
    public static void main(String[] args) {
        Employee obj1 = new Employee("Peter",21,"8768634564","215/34-B hamilton street",35000,"System administrator");
        obj1.display();
        Manager obj2 = new Manager("Tony",34,"8768634564","220/34-B hamilton street",1500000,"Software Team");
        obj2.display();
    }
}

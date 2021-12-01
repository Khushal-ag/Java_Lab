package questions.com.myname.student;

public class student {
    private String name;
    private int rollNo;
    private double cpi;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public double getCpi() {
        return cpi;
    }

    public void setCpi(double cpi) {
        this.cpi = cpi;
    }
    public String toString(student obj)
    {
        return obj.name+" "+obj.rollNo+" "+obj.cpi+" ";
    }
}
//Design a classRoom that has properties AC_ON, HOME_THEATRE_ON, FAN_ON and LIGHT_ON that stores Boolean values to indicate whether the appliance is ON or OFF.
// Design a menu-driven program in java that puts ON/OFF the corresponding appliances and gives appropriate message. If the total power consumed is more than
// 2kW, show a message Overload. Assume AC consumes 1200 watts, Home Theatre consumes 600 watts, Fan consumes 400 watts and light consumes 100 watt.

package questions.week3;

import java.util.Scanner;

class Room{
    Boolean AC_ON,HOME_THEATRE_ON,FAN_ON,LIGHT_ON;
    static int AC = 1200,HOME = 600,FAN = 400,LIGHT = 100;
    public Room(){
        AC_ON = false;
        HOME_THEATRE_ON = false;
        FAN_ON = false;
        LIGHT_ON = false;
    }
    public String state(Boolean b){
        if(b) return "ON";
        else return "OFF";
    }
    public static void change(Room obj,int i){
        if(i==1) obj.AC_ON = true;
        else if(i==2) obj.HOME_THEATRE_ON = true;
        else if(i==3) obj.FAN_ON = true;
        else if(i==4) obj.LIGHT_ON = true;
        else if(i==5) billCalculate(obj);
    }
    public static void billCalculate(Room obj){
        int bill = 0;
        if(obj.AC_ON) bill += AC;
        if(obj.HOME_THEATRE_ON) bill += HOME;
        if(obj.FAN_ON) bill += FAN;
        if(obj.LIGHT_ON) bill += LIGHT;
        if(bill > 2000) System.out.println("OVERLOAD");
        else System.out.println("Bill Amount : "+bill);
    }
}
public class ClassAc{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Room obj = new Room();
        int t;
        do{
            System.out.println("[1] AC : "+obj.state(obj.AC_ON));
            System.out.println("[2] HOME THEATRE : "+obj.state(obj.HOME_THEATRE_ON));
            System.out.println("[3] FAN : "+obj.state(obj.FAN_ON));
            System.out.println("[4] LIGHT : "+obj.state(obj.LIGHT_ON));
            System.out.println("[5] For Calculate ");
            System.out.print("Enter Choice -> ");
            t = sc.nextInt();
            Room.change(obj,t);
        }while (t != 5);
    }
}

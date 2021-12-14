package questions.JDBC;

import java.sql.*;
import java.util.Scanner;

public class update {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner sc = new Scanner(System.in);
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded");
        java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/connection","root","");
        System.out.println("Connection successful");
        String str = "Insert into jdbc values(?,?)";
        System.out.print("Enter no. of rows you want to insert : ");
        int n = sc.nextInt();

        PreparedStatement psmt = con.prepareStatement(str);
        while (n>0)
        {
            System.out.println("Enter Name : ");
            String x = sc.nextLine();
            psmt.setString(1,x);
            System.out.println("Enter roll no. : ");
            int r = sc.nextInt();
            psmt.setInt(2,r);
            n -= 1;
            psmt.executeUpdate();
        }

        ResultSet rs = psmt.executeQuery("SELECT * from jdbc");
        while(rs.next())
        {
            System.out.println(rs.getString(1)+" "+rs.getInt(2));
        }

        con.close();
    }
}

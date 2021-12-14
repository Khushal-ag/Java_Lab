package questions.JDBC;
import java.sql.*;
public class Connection {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded");
        java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/connection","root","");
        System.out.println("Connection successful");
        Statement s = con.createStatement();
        String str = "select * from jdbc";
        ResultSet rs = s.executeQuery(str);
        while(rs.next())
        {
            System.out.println(rs.getString(1)+" "+rs.getInt(2));
        }

        con.close();
    }
}

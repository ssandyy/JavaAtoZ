import java.util.Scanner;
import java.sql.*;

class Test {
    public static void main(String[] args) {
        // Class.forName("com.mysql.jdbc.Driver");
        // Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "mysql", "mysql");

        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from emp101");

        while (rs.next()) {
            System.out.println(rs.getString("name"));
            System.out.println(rs.getString("pass"));
        }
    }
}
import java.util.Scanner;
import java.sql.*;

class Test1 {
    public static void main(String[] args) throws SQLException {
        // Class.forName("com.mysql.jdbc.Driver");
        // Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "mysql", "mysql");
    	 Connection con;
        try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
			  Statement stmt = con.createStatement();
		        ResultSet rs = stmt.executeQuery("select * from emp101");

		        while (rs.next()) {
		            System.out.println(rs.getString("name"));
		            System.out.println(rs.getString("pass"));
		        }
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
		
      
    }
}
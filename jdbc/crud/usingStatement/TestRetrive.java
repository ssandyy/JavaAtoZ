package jdbc.crud.usingStatement;

import java.sql.*;

public class TestRetrive {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
            System.out.println("Connection Established..!");
            
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from emp");
            while(rs.next()) {
                // int id = rs.getInt(1);
                // String name = rs.getString(2);
                // int age = rs.getInt(3);
                // System.out.println("Id: " + id + " Name: " + name + " Age: " + age);
                // OR
                // System.out.println("Id: " + rs.getInt(1) + " Name: " + rs.getString(2) + " Age: " + rs.getInt(3));

                //OR  for specific column by column identification/index..
                System.out.println(rs.getString("Name"));
                // Or 
                System.out.println(rs.getInt(3));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
}


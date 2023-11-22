import java.sql.*;
import java.util.Scanner;

public class TestUpdate {
    
    public static void main(String[] args) {
        try{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
        System.out.println("Connected to database");

        String name = "test";
        int age = 10;
        Statement statement = connection.createStatement();
        int x = statement.executeUpdate("update emp set name = '" + name + "', age = " + age + " where id = 4");

        ResultSet resultset = statement.executeQuery("select * from emp");

        while (resultset.next()) {
            System.out.println(resultset.getInt(1));
            System.out.println(resultset.getString(2));
            System.out.println(resultset.getInt(3));
        }
        }catch(SQLException i){
            System.out.print(i);
        }catch(Exception e){
            System.out.print(e);
        }
    }
}

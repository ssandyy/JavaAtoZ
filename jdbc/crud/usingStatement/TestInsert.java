import java.sql.*;
import java.util.Scanner;

public class TestInsert {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system","oracle");
            System.out.println("Connected to database");
            
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter id: ");
            int id = scanner.nextInt();
            System.out.print("Enter name: ");
            String name = scanner.next();
            System.out.print("Enter age: ");
            int age = scanner.nextInt();
           
            Statement statement = connection.createStatement();
            int x = statement.executeUpdate("insert into emp values(" + id + ",'" + name + "'," + age + ")");
            System.out.println(x);
            
            ResultSet resultSet = statement.executeQuery("select * from emp");
            while (resultSet.next()) {   
                System.out.println(resultSet.getInt(1));
                System.out.println(resultSet.getString(2));
                System.out.println(resultSet.getInt(3));
            }
            connection.close();
        }catch(SQLException i){
            System.out.println(i);
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
}

import java.sql.*;
import java.util.Scanner;

public class TestInsert {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system","oracle");
            System.out.println("Connected to database");
            // int y=1;
            while (true) {
                System.out.println("Enter 1 to insert");
                System.out.println("Enter 2 to exit");
                Scanner scanner = new Scanner(System.in);
                int choice = scanner.nextInt();
                if (choice == 1) {
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Enter id: ");
                    int id = sc.nextInt();
                    System.out.print("Enter name: ");
                    String name = sc.next();
                    System.out.print("Enter age: ");
                    int age = sc.nextInt();

                Statement statement = connection.createStatement();
                int x = statement.executeUpdate("insert into emp values(" + id + ",'" + name + "'," + age + ")");
                System.out.println(x);

                ResultSet resultSet = statement.executeQuery("select * from emp");while(resultSet.next())
                {
                    System.out.println(resultSet.getInt(1));
                    System.out.println(resultSet.getString(2));
                    System.out.println(resultSet.getInt(3));
                }   
                } else if (choice ==2) {
                    break;
                } else {
                    System.out.println("Invalid choice");
                }
                
            }
    connection.close();
    }
    catch(SQLException i)
    {
        System.out.println(i);
    }catch(Exception e)
    {
        System.out.println(e);
    }
}
}

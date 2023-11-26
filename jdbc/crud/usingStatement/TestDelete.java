import java.sql.*;
import java.util.*;

import javax.naming.spi.DirStateFactory.Result;

public class TestDelete {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "oracle");
            Statement stmt = conn.createStatement();
            int id;

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the id of the record to delete");
            id=scanner.nextInt();
            int a = stmt.executeUpdate("delete from emp where id = "+id);
            System.out.println(a);
            
            ResultSet result = stmt.executeQuery("select * from emp");
            while(result.next()){
                System.out.println(result.getInt(1));
                System.out.println(result.getString(2));
                System.out.println(result.getInt(3));

            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }catch(Exception e){
            System.out.println(e); 
        }
    }
}

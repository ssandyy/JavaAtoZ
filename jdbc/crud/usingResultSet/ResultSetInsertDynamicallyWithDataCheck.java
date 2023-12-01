package jdbc.crud.usingResultSet;
import java.sql.*;

import java.sql.DriverManager;

public class ResultSetInsertDynamicallyWithDataCheck {
    public static void main(String[] args) {
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
            if(connection!=null){
                System.out.println("Connection Established..!");
                Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
                ResultSet resultSet = statement.executeQuery("select * from emp");
                
                while(resultSet.next()){
                    System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3));
                    
                }
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

package jdbc.crud.usingResultSet;
import java.sql.*;

public class ResultSetInsert {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
            if (connection!= null) {
                System.out.println("Connection Established..!");
                
                Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                ResultSet resultSet = statement.executeQuery("select id, name, age from emp");

                System.out.println("Before insertion of new record");
                 while(resultSet.next()){
                    System.out.print(resultSet.getInt(1)+" ");
                    System.out.print(resultSet.getString(2)+" ");
                    System.out.print(resultSet.getInt(3)+" ");
                    System.out.println();
                }
                resultSet.moveToInsertRow();
                resultSet.updateInt(1, 1001);
                resultSet.updateString(2, "hello");
                resultSet.updateInt(3, 75);
                resultSet.insertRow();

                resultSet.beforeFirst();
                resultSet=statement.executeQuery("select * from emp");
                System.out.println("After insertion of new record");
                 while(resultSet.next()){
                    System.out.print(resultSet.getInt(1)+" ");
                    System.out.print(resultSet.getString(2)+" ");
                    System.out.print(resultSet.getInt(3)+" ");
                    System.out.println();
                }
                resultSet.close();
                statement.close();
                connection.close();;
            }
         }catch(SQLException e){
            e.printStackTrace();
         } catch (Exception e) {
                e.printStackTrace();
            }
    }
}

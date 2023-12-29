package servlet.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertPStatementExample {
    private static final String INSERT_USER = "INSERT INTO users" + " (id,name, email,country, password) " + " values(?,?,?,?,?); ";

    public void insertRecords() throws SQLException, ClassNotFoundException {
        System.out.println(INSERT_USER);

        // step 1 : connection establishment
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo?useSSL=false",
                    "root", "");
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USER);

            preparedStatement.setInt(1, 1);
            preparedStatement.setString(2, "Rahul");
            preparedStatement.setString(3, "rahul@servlet.com");
            preparedStatement.setString(4, "India");
            preparedStatement.setString(5, "rahul");

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}


    public static void main(String[] args)  {
        InsertPStatementExample ipe = new InsertPStatementExample();
        try {
            ipe.insertRecords();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}

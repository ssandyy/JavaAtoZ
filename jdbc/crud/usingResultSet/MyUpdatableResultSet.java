package jdbc.crud.usingResultSet;

import java.sql.*;

public class MyUpdatableResultSet{
	public static void main(String args[]){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
			if(connection!=null){
				System.out.println("Connection Established..!");

				Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
				ResultSet resultSet = statement.executeQuery("select id, age from emp where id=6");
				resultSet.next();
				resultSet.deleteRow();
				System.out.println("record Deleted..!");
				
			}
		}catch(SQLException e){
			e.printStackTrace();
		}catch(Exception e){
			System.out.print(e);
		}
	}
}
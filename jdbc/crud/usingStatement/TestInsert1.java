import java.sql.*;

public class TestInsert1 {
    public static void main(String[] args) {
        try {
           Class.forName("oracle.jdbc.driver.OracleDriver");
        //    DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system", "oracle");
//            Connection c = DriverManager.getConnection("jdbc:mysql://localhost/", "root", "");

            System.out.println("Connected to database");

            int id = 4;
            String name = "rahul";
            int age = 55;
            Statement stm = c.createStatement();

            // int z = stm.executeUpdate("Create table emp(id number, name varchar2(100), age number)");
            // System.out.println(z);

            int x = stm.executeUpdate("insert into emp values(" + id + ",'" + name + "'," + age + ")");
            System.out.println(x);
            ResultSet rs = stm.executeQuery("select * from emp");
            while (rs.next()) {
                System.out.println(rs.getInt(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getInt(3));
            }
        }catch(SQLException se){
			System.out.println(se);
		} 
		catch (Exception e) {
            System.out.println("Error occur while running program: " + e);
        }
    }
}
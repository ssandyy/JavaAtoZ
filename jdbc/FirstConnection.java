package jdbc;

/*
 * Step1: import required pkg
 * Step2: load and register the driver    --> com.mysql.jdbc.Driver / com .oracle. ....
 * step3: Create Connection
 * step4: Create Statement
 * step5: execute Query
 * step6: Process the result
 * stp7: close the connection
 * 
 */

import java.sql.*;
import java.io.*;

public class FirstConnection {
    
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cbse","root","");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from student");

        while (rs.next()) {
            System.out.println(rs.getInt(1));
            System.out.println(rs.getString(2));

        }
    }

}

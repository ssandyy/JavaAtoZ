package servlet.Login;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class LoginServlet extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {   
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        String uname = req.getParameter("uname");
        String pass = req.getParameter("pass");
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
            Statement stmt = con.createStatement();
            String query = "select * from emp101 where username='"+uname+"' and password='"+pass+"'";
            ResultSet rs = stmt.executeQuery(query);

            if(rs.next()){
                out.println("<html><body>");
                out.println("<h1>Welcome "+uname+"</h1>");
                out.println("</body></html>");
            }
            else{
                out.println("<html><body>");
                out.println("<h1>Invalid username or password</h1>");
                out.println("</body></html>");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

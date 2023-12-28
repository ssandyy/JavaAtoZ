import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class LoginServlet extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {   
        res.setContentType("text/html");
        
        PrintWriter out = res.getWriter();
        out.println("<html><body>");
        String name = req.getParameter("name");
        String pass = req.getParameter("pass");
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
            Statement stmt = con.createStatement();
            String s1 = "select * from emp101 where name='"+name+"' and pass='"+pass+"'";
            ResultSet rs = stmt.executeQuery(s1);

            if(rs.next()){
                out.println("<h1>Welcome "+name+"</h1>");
                out.println("<br>");
                out.println("<a href='index.html'>Back To Home</a>");;
            }
            else{
                out.println("<h1>Invalid username or password</h1>");
            }
        }catch(Exception e){
            out.println(e);
        }
         out.println("</body></html>");
    }
}

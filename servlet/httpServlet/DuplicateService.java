import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;


public class DuplicateService extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		//super.service(req, res);
		res.setContentType("text/html");
		PrintWriter.out = res.getWriter();
		out.println("<HTML><body><p>This is Duplicate Servlet..! </p></body></HTML>");
	}
	public void doGet(HttpServiceRequest req, HttpServiceResponse res) throws ServletException, IOException{
		res.setContentType("text/html");
		PrintWriter.out = res.getWriter();
		out.println("<HTML><body><p> This is doGet method..! </p></body></HTML>");
	}
}
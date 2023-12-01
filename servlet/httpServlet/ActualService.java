import javax.servlet.http.*;
import javax.servlet.*;
import java.sql.*;
import java.io.*;


public class ActualService extends HttpServlet{
	public void service(Servletrequest req, ServletResponse res) throws ServletException, IOException{
		super.service(req, res);
		res.setContentType("text/html");
		PrintWriter.out = res.getWriter();
		out.println("<html><body><p>Actual Servlet  </p></body></html> ");
	}
	
	public void service(HttpServletRequest req, HttpServletResponse res){
		res.setContentType("text/html");
		PrintWriter.out = res.getWriter();
		out.println("<html><body><p>Actual Servlet  </p></body></html> ");
	}
}
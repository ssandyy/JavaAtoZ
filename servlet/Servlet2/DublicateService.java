import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class DublicateService extends HttpServlet
{
	
	public void service(HttpServletRequest req , HttpServletResponse res)throws ServletException,IOException
	{
		//super.service(req,res);
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<html><body>");
		out.println("Dublicate service");
		out.println("</body></html>");
		
	}
	public void doGet(HttpServletRequest req , HttpServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		
		PrintWriter out = res.getWriter();
		out.println("<html><body>");
		out.println("Get Method");
		out.println("</body></html>");
	}
}
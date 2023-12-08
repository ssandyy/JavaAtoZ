import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;
public class RequestServlet extends HttpServlet
{
	/*
	public void service(HttpServletRequest req , HttpServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<html><body>");
		String s = req.getMethod();
		out.println(s+"Service Method");
		if(s.equals("POST"))
			doPost(req,res);
		if(s.equals("GET"))
			doGet(req,res);
		
	}
	*/
	
	public void service(HttpServletRequest req , HttpServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<html><body>");
		String name = req.getParameter("name");
		String pass = req.getParameter("pass");
		
		if(name.equals("ssandyy")&& pass.equals("ssandyy"))
			out.println("user is valid through service method");
		else
			out.println("User is Invalid through service method");
		//out.println("</body></html>");
		
	}
	
	
	public void doPost(HttpServletRequest req ,HttpServletResponse res)throws ServletException,IOException
	
	{
		res.setContentType("text/html");
		
		PrintWriter out = res.getWriter();
		out.println("<html><body>");
		String name = req.getParameter("name");
	
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
			
			Statement s = c.createStatement();
			
			int x = s.executeUpdate("insert into emp values('"+name+"')");
			ResultSet rs = s.executeQuery("Select * from emp");
			ResultSetMetaData rsmd = rs.getMetaData();
			
			out.println("<table bgcolor='yellow' border=1 width=200>");
			out.println("<tr>");
			for(int i=1;i<=rsmd.getColumnCount();i++)
			{
				out.println("<th>"+rsmd.getColumnName(i) +"</th>");
				
			}
			while(rs.next())
			{
				out.println("<tr>");
				out.println("<td>" +rs.getString(2)+"</td>");
				out.println("<td>" +rs.getInt(3)+"</td>");
				out.println("<tr>");
			}
		}
		catch(Exception e){System.out.println(e);}
		
		out.println("</table>");
	
		
	}/*
	public void doGet(HttpServletRequest req , HttpServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		
		PrintWriter out = res.getWriter();
		out.println("<html><body>");
		String name = req.getParameter("name");
		String pass = req.getParameter("pass");
		
		if(name.equals("codesquadz")&& pass.equals("codesquadz"))
			out.println("user is valid through get");
		else
		out.println("user is invalid through get");
	out.println("</body></html>");
	
	}*/
}
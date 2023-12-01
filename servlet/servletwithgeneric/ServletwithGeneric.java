import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class ServletwithGeneric extends GenericServlet{
	PrintWriter out;
	static int count=0;
	
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException{
		res.setContentType("text/html");
		out = res.getWriter();
		destroy();
		out.println("<html><body>");
		out.println("Hello Generic servlet..!");
		out.println("<br>");
		out.println(this);
		
		try{
			out.println("<br>");
			
		}catch(Exception e){
			
		}
		out.println(Thread.currentThread().getName());
		out.println("</body></html>");
	}
	public void destroy(){
		out.println("Connection destroyed..!");
		count++;
	}
	/*
	public ServletConfig getServletConfig(){
            return null;
     }
	public String getServletInfo(){
		return null;
	}
	*/
}
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class HomeCbse extends HttpServlet {
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		String homePageURL = req.getContextPath() + "/index.html";
		 
		PrintWriter out = res.getWriter();
		out.println("<html><body>");
		out.println("<h1>Welcome to CBSE</h1>");
		out.println("<a href=\"" + homePageURL + "\">Back to Home</a>");
		out.println("</body></html>");
	}
}
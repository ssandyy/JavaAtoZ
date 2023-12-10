
public class HomeCbse extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");

		PrintWriter out = res.getWriter();
		out.println("<html><body>");
		out.println("<h1>Welcome to CBSE</h1>");
		out.println("</body></html>");
	}

}
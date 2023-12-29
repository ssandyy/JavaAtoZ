import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class StudentCbse extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<div class=\"container mt-2\">\r\n" + //
                "    <div class=\"row\">\r\n" + //
                "      <div class=\"col-md-4 col-sm-12\">\r\n" + //
                "        <form class=\"student-form\">\r\n" + //
                "          <div class=\"form-group\">\r\n" + //
                "            <label for=\"name\">Name</label>\r\n" + //
                "            <input type=\"text\" class=\"form-control name\" id=\"name\" placeholder=\"Enter your name...\">\r\n" + //
                "          </div>\r\n" + //
                "\r\n" + //
                "          <div class=\"form-group\">\r\n" + //
                "            <label for=\"age\">Age</label>\r\n" + //
                "            <input type=\"text\" class=\"form-control age\" id=\"age\" placeholder=\"Enter your age...\">\r\n" + //
                "          </div>\r\n" + //
                "\r\n" + //
                "          <div class=\"form-group\">\r\n" + //
                "            <label for=\"address\">Address</label>\r\n" + //
                "            <input type=\"text\" class=\"form-control address\" id=\"address\" placeholder=\"Enter your address...\">\r\n" + //
                "          </div>\r\n" + //
                "\r\n" + //
                "          <div class=\"form-group\">\r\n" + //
                "            <label for=\"phone\">Phone</label>\r\n" + //
                "            <input type=\"text\" class=\"form-control phone\" id=\"phone\" placeholder=\"Enter your phone...\">\r\n" + //
                "          </div>\r\n" + //
                "          <button type=\"button\" class=\"btn btn-primary w-100 createStudent\" onClick=\"onClickCreateStudent()\">CREATE</button>\r\n" + //
                "        </form>\r\n" + //
                "      </div>\r\n" + //
                "      <div class=\"col-md-8\">\r\n" + //
                "        <div class=\"row\" id=\"student-list\">\r\n" + //
                "          <!-- list student -->\r\n" + //
                "        </div>\r\n" + //
                "      </div>\r\n" + //
                "    </div>\r\n" + //
                "  </div>\r\n" + //
                "  <script src=\"assets/js/main.js\"></script>");
        
    }
}

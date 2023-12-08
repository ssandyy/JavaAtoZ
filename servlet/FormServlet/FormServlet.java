package servlet.FormServlet;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

public class FormServlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        ServletOutputStream out = res.getOutputStream();
        res.setContentType("text/html");
        out.println("<html><head><title>Basic Form Processor Output</title></head>");
        out.println("<body>");
        out.println("<h1>Welcome to FormServlet..!</h1>");
        //extract the form data here
        String title = req.getParameter("title");
        String name = req.getParameter("name");
        String city = req.getParameter("city");
        String country = req.getParameter("country");
        String tel = req.getParameter("tel");
        String age = req.getParameter("age");

        //extracting data from the checkbox field
        String[] interests = req.getParameterValues("interests");

        //output the data into webpage
        out.println("Title: "+title);
        out.println("Name: "+name);
        out.println("City: "+city);
        out.println("Country: "+country);
        out.println("Telephone: "+tel);
        // out.println("Age: "+age);
        out.println("Interests: <ul>");
        for(int i=0;i<interests.length;i++){
            out.println(interests[i]);
        }
        out.println("</ul>");
        out.println("<br> your age is: "+age);
        out.println("</body></html>");
    }
}
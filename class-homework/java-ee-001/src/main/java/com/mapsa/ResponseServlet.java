package main.java.com.mapsa;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ResponseServlet" , urlPatterns = "/response")
public class ResponseServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String first_name = request.getParameter("username");
//        String last_name = req.getParameter("password");

        PrintWriter out = response.getWriter();
        out.write("<!DOCTYPE html>");
        out.write("<html lang=\"en\">");
        out.write("<body>");
        out.write("<p>"+ first_name + " Well Come" + "</p>");
        out.write("</body>");
        out.write("</html>");
        out.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

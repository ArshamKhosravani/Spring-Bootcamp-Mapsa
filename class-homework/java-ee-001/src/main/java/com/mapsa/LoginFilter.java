package main.java.com.mapsa;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(filterName = "LoginFilter", urlPatterns = "/hello")
public class LoginFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req,
                         ServletResponse resp,
                         FilterChain chain) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if(username.equals("ali") && password.equals("12345")){
            chain.doFilter(req,resp);
        } else {
            out.write("<p>Error</p>");
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("index.html");
            requestDispatcher.include(req,resp);
        }

    }

    public void init(FilterConfig config) throws ServletException {
    }

}

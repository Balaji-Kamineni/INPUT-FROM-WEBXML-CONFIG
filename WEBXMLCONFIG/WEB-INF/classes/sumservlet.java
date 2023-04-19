import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class sumservlet extends HttpServlet{
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        ServletConfig config=getServletConfig();
        int a=Integer.parseInt(config.getInitParameter("a"));
        int b=Integer.parseInt(config.getInitParameter("b"));
        int c=a+b;
        out.print("<h1 align=center> Sum is: "+c+" </h1>");
        out.close();
    }
}
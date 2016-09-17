import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class HelloYou extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res)
          throws ServletException, IOException  {
		String nome = req.getParameter("nome");
      	res.setContentType("text/html");
      	PrintWriter out = res.getWriter();
      	out.println("<HTML>");
      	out.println("<HEAD>");
      	out.println("<TITLE>Hello World Sample Servlet</TITLE>");
      	out.println("</HEAD>");
      	out.println("<BODY>");
      	out.println("<CENTER><H1>Hello "+nome+"</H1></CENTER>");
      	out.println("</BODY>");
      	out.println("</HTML>");
      	out.close();
   }
}

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import javax.xml.ws.Response;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(name = "HomeServlet", value = "/Home")
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String  a = request.getParameter("name");
//        PrintWriter wt = response.getWriter();
//        wt.println("<html>");
//        wt.println("xin chao" +" "+ a);
//        wt.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String tk = request.getParameter("name");
        String mk = request.getParameter("pass");
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
        if(tk.equals("admin")&&mk.equals("admin")){
            requestDispatcher = request.getRequestDispatcher("admin.jsp");
            request.setAttribute("ten", tk);
        }
        requestDispatcher.forward(request, response);
    }
}

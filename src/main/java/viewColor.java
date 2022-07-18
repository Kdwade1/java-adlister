import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ViewColor", urlPatterns = "/viewcolor")
public class viewColor extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String color = request.getParameter("color");
        request.setAttribute("color",color);
        request.getRequestDispatcher("/viewColor.jsp").forward(request, response);
    }

    public void goPost(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        String color = request.getParameter("color");
        request.setAttribute("color",color);

        request.getRequestDispatcher("/viewColor.jsp").forward(request, response);
    }

}




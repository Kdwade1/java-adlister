import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="ColorPage", urlPatterns = "/pickcolor")
public class ColorPage extends HttpServlet {
    public void  doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

request.getRequestDispatcher("/pickColor.jsp").forward(request,response);
    }
    public void goPost(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        String color = request.getParameter("color");
        request.setAttribute("color",color);
        request.getRequestDispatcher("/viewColor?color ="+color).forward(request,response);
    }

}

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name= "correct", urlPatterns ="/correct" )
public class correct extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String message = "CORRECT!";
        request.setAttribute("message",message);
        request.getRequestDispatcher("/Answer.jsp").forward(request,response);
    }


}
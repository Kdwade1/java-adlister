import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name= "GuessingGame",urlPatterns = "/guess")
public class GuessingGame extends HttpServlet {
   public void  doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//       guessingGame(request.getParameter("number"),response);
       request.getRequestDispatcher("guessing.jsp").forward(request,response);


   }

   public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
//       int correctNum = (int) Math.floor(Math.random()*2+1);
       if (Integer.parseInt(request.getParameter("number")) == checking()) {
           response.sendRedirect("/correct");
       } else {
           response.sendRedirect("/incorrect");
       }
   }
   public int checking(){
     return  (int) Math.floor(Math.random()*3+1);


   }

}

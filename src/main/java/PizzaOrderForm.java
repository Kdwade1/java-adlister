import org.w3c.dom.ls.LSOutput;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebServlet(name = "PizzaOrderForm", urlPatterns = "/pizza-order")
public class PizzaOrderForm extends HttpServlet {
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
//        System.out.println(request.getAttribute("pizza"));
        request.getRequestDispatcher("/pizza-order.jsp").forward(request,response);

    }
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException {
//        request.getParameterMap().forEach((key, val) -> System.out.println(key));

        String [] pizzaOrder={request.getParameter("size"),request.getParameter("crust"),request.getParameter("sauce"),request.getParameter("topping"),request.getParameter("toppings"),request.getParameter("topps"),request.getParameter("delivery")};
        System.out.println(Arrays.toString(pizzaOrder));
        for(int i = 0; i< pizzaOrder.length;i++){
            if (pizzaOrder[i] == null){
                continue;
            }
            System.out.println(pizzaOrder[i]);

        }
        request.setAttribute("pizza", pizzaOrder);

        request.getRequestDispatcher("/pizza-order.jsp").forward(request,response);

    }

}

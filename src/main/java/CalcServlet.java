import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/calc")
public class CalcServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/calc.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        var op = req.getParameter("operation");
        var num1 = Double.parseDouble(req.getParameter("num1"));
        var num2 = Double.parseDouble(req.getParameter("num2"));
        Double result = switch (op) {
            case "SUM" -> num1 + num2;
            case "SUB" -> num1 - num2;
            case "MUL" -> num1 * num2;
            case "DIV" -> num1 / num2;
            default -> throw new IllegalArgumentException("Unknown operation type");
        };
        String message = "%.2f".formatted(result);
        req.setAttribute("message", message);
        getServletContext().getRequestDispatcher("/calc.jsp").forward(req, resp);


    }
}

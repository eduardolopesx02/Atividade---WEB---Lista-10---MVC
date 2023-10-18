import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalculadoraServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));
        int num3 = Integer.parseInt(request.getParameter("num3"));

        int soma = num1 + num2 + num3;
        int subtracao = num1 - num2 - num3;
        int multiplicacao = num1 * num2 * num3;
        int divisao = num1 / num2 / num3;
        int resto = num1 % num2 % num3;

        request.setAttribute("soma", soma);
        request.setAttribute("subtracao", subtracao);
        request.setAttribute("multiplicacao", multiplicacao);
        request.setAttribute("divisao", divisao);
        request.setAttribute("resto", resto);

        request.getRequestDispatcher("resultado.jsp").forward(request, response);
    }
}

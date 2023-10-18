import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PalindromasServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String palavra1 = request.getParameter("palavra1");
        String palavra2 = request.getParameter("palavra2");

        Palavra palavraObj1 = new Palavra(palavra1);
        Palavra palavraObj2 = new Palavra(palavra2);

        boolean isPalindromo1 = palavraObj1.isPalindromo();
        boolean isPalindromo2 = palavraObj2.isPalindromo();

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Resultado</h1>");
        out.println("<p>Palavra 1: " + palavra1 + " é palíndromo? " + isPalindromo1 + "</p>");
        out.println("<p>Palavra 2: " + palavra2 + " é palíndromo? " + isPalindromo2 + "</p>");
        out.println("</body></html>");
    }
}

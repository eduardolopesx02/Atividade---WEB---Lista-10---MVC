import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IdadeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nome = request.getParameter("nome");
        String endereco = request.getParameter("endereco");
        int anoNascimento = Integer.parseInt(request.getParameter("anoNascimento"));
        String fezAniversarioStr = request.getParameter("fezAniversario");

        boolean fezAniversario = "sim".equals(fezAniversarioStr);

        Pessoa pessoa = new Pessoa(nome, endereco, anoNascimento);
        int idade = pessoa.getIdadeAtual(fezAniversario);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Resultado</h1>");
        out.println("<p>Nome: " + nome + "</p>");
        out.println("<p>Endereço: " + endereco + "</p>");
        out.println("<p>Idade Atual: " + idade + " anos</p>");
        out.println("</body></html>");
    }
}

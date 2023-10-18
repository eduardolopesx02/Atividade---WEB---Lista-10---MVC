<!DOCTYPE html>
<html>
<head>
    <title>Calculadora de Idade</title>
</head>
<body>
    <form action="IdadeServlet" method="get">
        <label for="anoNascimento">Ano de Nascimento:</label>
        <input type="text" name="anoNascimento" id="anoNascimento"><br>

        <label for="fezAniversario">Já fez aniversário este ano?</label>
        <input type="radio" name="fezAniversario" value="sim">Sim
        <input type="radio" name="fezAniversario" value="nao">Não<br>

        <label for="nome">Nome:</label>
        <input type="text" name="nome" id="nome"><br>

        <label for="endereco">Endereço:</label>
        <input type="text" name="endereco" id="endereco"><br>

        <input type="submit" value="Calcular Idade">
    </form>
</body>
</html>

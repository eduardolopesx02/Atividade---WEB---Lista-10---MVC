public class Palavra {
    private String palavra;

    public Palavra(String palavra) {
        this.palavra = palavra;
    }

    public boolean isPalindromo() {
        // Remova espaços em branco e transforme tudo em letras minúsculas
        String palavraFormatada = palavra.replaceAll("\\s", "").toLowerCase();
        
        int inicio = 0;
        int fim = palavraFormatada.length() - 1;
        
        while (inicio < fim) {
            if (palavraFormatada.charAt(inicio) != palavraFormatada.charAt(fim)) {
                return false;
            }
            inicio++;
            fim--;
        }
        
        return true;
    }
}

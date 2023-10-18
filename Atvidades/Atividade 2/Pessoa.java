import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private String endereco;
    private int anoNascimento;

    public Pessoa(String nome, String endereco, int anoNascimento) {
        this.nome = nome;
        this.endereco = endereco;
        this.anoNascimento = anoNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getIdadeAtual(boolean fezAniversario) {
        int anoAtual = LocalDate.now().getYear();
        if (fezAniversario) {
            return anoAtual - anoNascimento;
        } else {
            return anoAtual - anoNascimento - 1;
        }
    }
}

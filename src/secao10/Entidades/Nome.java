package secao10.Entidades;

public class Nome {
    private String nome;
    private int idade;


    public Nome(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
}

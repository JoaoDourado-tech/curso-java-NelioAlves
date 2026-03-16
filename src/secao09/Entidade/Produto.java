package secao09.Entidade;

public class Produto {
    private String nome; //Alterado para PRIVATE, para impedir que se altere livremente os Atributos
    private double preco;
    private int quantidade;


    //Construtor gerado AUTOMATICAMENTE:
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //Sobrecarga gerada AUTOMATICAMENTE a partir do Construtor:
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }


    //Getters e Setters AUTOMATICAMENTE:
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    // Mostrador de Dados:
    public String toString(){
        return String.format("DADOS DO PRODUTO:%n Nome: %s%n Preço: %.2f%n Quantidade: %d%n", nome, preco, quantidade);
    }
}

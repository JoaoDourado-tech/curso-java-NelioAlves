package secao09.Entidade;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade;

    //Construtor:
    public Produto (String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        // Dessa forma, esse construtor receberá nos parâmetros os atributos diretamente para que se verifique se todos os dados foram preenchidos adequandamente...
    }
    public String toString(){
        return String.format("DADOS DO PRODUTO:%n Nome: %s%n Preço: %.2f%n Quantidade: %d%n", nome, preco, quantidade);
    }
}

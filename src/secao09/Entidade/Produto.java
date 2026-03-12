package secao09.Entidade;

public class Produto {
    private String nome; //Alterado para PRIVATE, para impedir que se altere livremente os Atributos
    private double preco;
    private int quantidade;

    //Construtor:
    public Produto (String nome, double preco, int quantidade) {
        this.nome = nome; //this foca na referência do próprio Objeto
        this.preco = preco;
        this.quantidade = quantidade;
        // Dessa forma, esse construtor receberá nos parâmetros os atributos diretamente para que se verifique se todos os dados foram preenchidos adequandamente...
    }

    // Sobrecarga:
    public Produto (String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }


    // Metodo para permitir ALTERAR o valor do Atributo NOME
    public void setNome(String nome){
        this.nome = nome; //Atributo nome recebe o parâmetro nome
    }

    // Metodo usado para ALTERAR o valor do Atributo PRECO
    public void setPreco(double preco){
        this.preco = preco; //Atributo preco recebe o parâmetro preco
    }


    // Metodo usado para PEGAR do Atributo NOME
    public String getNome(){
        return nome;
    }

    // Metodo usado para PEGAR do Atributo PRECO
    public double getPreco(){
        return preco;
    }

    public int getQuantidade(){
        return quantidade;
    }





    // Mostrador de Dados:
    public String toString(){
        return String.format("DADOS DO PRODUTO:%n Nome: %s%n Preço: %.2f%n Quantidade: %d%n", nome, preco, quantidade);
    }
}

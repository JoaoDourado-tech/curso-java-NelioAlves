package secao08.Entities;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade;

    public double calcularValorTotal() {
        return preco * quantidade;
    }

    public void adicionarEstoque(int quantAdd) {
        this.quantidade += quantAdd;
    }
    public void removerEstoque(int quantRemove){
         this.quantidade -= quantRemove;
    }
    public String toString() {
        return "Produto Nome: "+ nome + ", Preço: R$" + String.format("%.2f", preco) + ", Quantidade: "+ quantidade +
                " unidades, Valor Total: " + String.format("%.2f", calcularValorTotal());
    }
}

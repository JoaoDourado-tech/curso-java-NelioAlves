package secao09;

public class Aula86 {

    //APRENDENDO A USAR GETTERS e SETTERS
        //Usados no caso de Atributos PRIVATE

    private String nome; //Private - Atributos NÃO podem ser acessados por outras Classes
    private double preco;

    public String getNome(){ //Como o Atributo nome é PRIVADO, usa-se o getNome para PEGAR o valor da string nome
        return nome;
    }

    public void setNome(String nome) { // setNome é usado para ALTERAR o valor da variável nome
        this.nome = nome;               //No caso void, pois não retorna nada, apenas edita o valor
    }
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}

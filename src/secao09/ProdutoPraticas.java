package secao09;

import secao09.Entidade.Produto;

import java.util.Locale;
import java.util.Scanner;

public class ProdutoPraticas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

// Necessário declarar as variáveis antes da Instanciação
        // Acredito que aqui seja onde mais tenha mudado do meu entendimento
        // Antes eu era acostumado a fazer a Instanciação e só depois atribuia os valores aos Atributos.
        // Agora, na verdade, ocorre o caminho inverso. Atribuo valor a uma variável e depois insiro ela nos parâmetros do meu construtor.
        System.out.println("Digite o nome do produto: ");
        String nome = sc.nextLine();

        System.out.println("Digite o valor do produto: ");
        double preco = sc.nextDouble();

        System.out.println("Digite a quantidade do produto: ");
        int quantidade = sc.nextInt();

        sc.nextLine(); //Limpar o Buffer

        Produto p1 = new Produto(nome, preco, quantidade); //Construtor p1

        p1.setNome("Computador"); // Permite alterar o valor do Atributo NOME para "Computador"
        System.out.println("Nome Atualizado: " + p1.getNome()); // Permite PEGAR o valor do atributo nome e printar na tela

        p1.setPreco(1200.00);
        System.out.println("Preço Atualizado: "+ p1.getPreco());

        System.out.println("Quantidade Real: " + p1.getQuantidade());

        System.out.println(p1);

        //Produto p2 - SEM ESTOQUE
        System.out.println("Digite o nome do produto: ");
        String nome2 = sc.nextLine();

        System.out.println("Digite o valor do produto: ");
        double preco2 = sc.nextDouble();

        Produto p2 = new Produto(nome2, preco2);  //Sobrecarga p2

        System.out.println(p2);







        sc.close();
    }
}

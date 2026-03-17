package secao10;

import secao10.Entidades.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Aula97Produto {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de Produtos:");
        int quantProd = sc.nextInt();

        Produto[] vetorProduto = new Produto[quantProd];
        Produto p1;

        double somaPreco = 0;

        for(int i =0; i<quantProd; i++){
            System.out.println("Digite o nome do Produto: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("Digite o Preço do Produto: ");
            double preco = sc.nextDouble();
            p1 = new Produto(nome, preco);
            vetorProduto[i] = p1;
            somaPreco += p1.getPreco();
        }
        double mediaPreco = somaPreco/quantProd;
        System.out.printf("Preço Médios dos %d Produtos: %.2f%n",quantProd,mediaPreco);







        sc.close();
    }
}

package secao08;

import secao08.Entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Aula73 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Produto item = new Produto();

        // MOSTRANDO DADOS DO PRODUTO:

        System.out.println("Digite o nome do produto: ");
        item.nome = sc.nextLine();
        System.out.printf("Nome do Produto: %s%n", item.nome);

        System.out.printf("%n%n");
        System.out.println("Digite o valor do produto: ");
        item.preco = sc.nextDouble();
        System.out.printf("Preço do Produto: R$ %.2f%n", item.preco);

        System.out.printf("%n%n");
        System.out.println("Digite o quantidade do produto: ");
        item.quantidade = sc.nextInt();
        System.out.printf("Quantidade do Produto: %d%n", item.quantidade);

        System.out.printf("%n%n");
        System.out.printf("Valor Total em Estoque: R$ %.2f%n", item.calcularValorTotal());
        System.out.printf("%n%n");

        // ENTRADA DE ESTOQUE:
        System.out.println("Sistema de ENTRADA de Produto:");
        System.out.println("Digite [ADICIONAR] para inserir ou [EXIT] para sair do Menu ADICIONAR");
        String sistema = sc.next();

        while (!sistema.equals("EXIT")){
            if (sistema.equals("ADICIONAR")) {
                System.out.println("Informe a QUANTIDADE ADICIONADA:");
                int quantAdd = sc.nextInt();

                item.adicionarEstoque(quantAdd);
                System.out.println("Quantidade do Produto: "+item.quantidade);

                System.out.println("Novo Valor Total em Estoque: " + item.calcularValorTotal());
            } else {
                System.out.println("[ERROR] DIGITE UM COMANDO CORRETO: [ADICIONAR] ou [SAIR]");
            }
            System.out.println("[ADICIONAR] para mais itens ou [EXIT] para sair do Menu ADICIONAR");
            sistema = sc.next();
        }
        System.out.println("Menu ADICIONAR finalizado...");

        // SAÍDA DE ESTOQUE:
        System.out.println("Sistema de SAÍDA de Produto:");
        System.out.println("Digite [REMOVER] para Retirar ou [EXIT] para sair do Menu REMOVER:");
        sistema = sc.next();

        while(!sistema.equals("EXIT")){
            if (sistema.equals("REMOVER")){
                System.out.println("Informe a QUANTIDADE a REMOVER:");
                int quantRemove = sc.nextInt();
                item.removerEstoque(quantRemove);
                System.out.println("Quantidade do Produto: " + item.quantidade);

                System.out.println("Novo Valor Total em Estoque: " + item.calcularValorTotal());
            } else {
                System.out.println("[ERROR] DIGITE UM COMANDO CORRETO: [REMOVER] ou [EXIT]");
            }
            System.out.println("[REMOVER] ou [EXIT] para sair do Menu REMOVER");
            sistema = sc.next();
        }


        System.out.println("Dados do Produto: " + item);


        System.out.println("Menu REMOVER finalizado...");
        sc.close();
    }
}
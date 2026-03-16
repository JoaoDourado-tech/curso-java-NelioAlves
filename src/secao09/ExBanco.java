package secao09;

import java.util.Locale;
import java.util.Scanner;

import secao09.Entidade.Conta;

public class ExBanco {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("------------------------------SISTEMA DE CADASTRO BANCÁRIO--------------------------");

        System.out.println("Cadastrar nome: ");
        String nome = sc.nextLine();

        System.out.println("Insira o Número de Conta (PERMANENTE): ");
        int numConta = sc.nextInt();

        System.out.println("CADASTRO CONCLUÍDO:");
        System.out.println("Número de Conta: " + numConta);
        System.out.println("Nome da Conta:" + nome);

        System.out.println("Haverá Depósito Inicial? Responda [SIM/NÃO]");
        String resp = sc.next();

        Conta user1;
        if (resp.equalsIgnoreCase("SIM")) {
            System.out.println("Informe o valor a ser Depositado Inicialmente:");
            double saldo = sc.nextDouble();
            user1 = new Conta(numConta, nome, saldo);

        } else {
            System.out.println("Deposito Inicial rejeitado");
            user1 = new Conta(numConta, nome, 0);
        }

        System.out.println("------------------------------MENU DE AÇÕES--------------------------");
        System.out.println("Digite o número da Ação:");
        System.out.println("1 - Alterar Nome");
        System.out.println("2 - Depósitar Saldo");
        System.out.println("3 - Retirar Saldo");
        System.out.println("4 - Sair");
        int opcao = sc.nextInt();

        switch(opcao){
            case 1:
                System.out.println("Digite o NOVO NOME:");
                sc.nextLine();
                String novoNome = sc.nextLine();
                user1.setNome(novoNome);
                break;
            case 2:
                System.out.println("Digite o VALOR da depositar:");
                double valorDepositado = sc.nextDouble();
                user1.depositar(valorDepositado);
                System.out.println("Depósito Realizado: "+ user1.getSaldo());
                break;
            case 3:
                System.out.println("Digite o VALOR da retirada:");
                System.out.println("Taxa de Retirada [5.00 R$]");
                double valorRetirado = sc.nextDouble();
                user1.retirar(valorRetirado);
                break;
            case 4:
                System.out.println("Ações Finalizadas");
                System.out.println("Dados do Usuário:");
                System.out.println(user1);
                break;
        }


        sc.close();

    }
}

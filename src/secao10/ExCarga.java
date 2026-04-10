package secao10;

import secao10.Entidades.Carga;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ExCarga {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a QUANTIDADE DE CARGA: ");
        int quantidade = sc.nextInt();

        List<Carga> listCarga = new ArrayList<>();

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Informe o CÓDIGO da Carga:");
            int codigo = sc.nextInt();
            System.out.println("Informe a DESCRICAO da Carga:");
            sc.nextLine();
            String descricao = sc.nextLine();
            System.out.println("Informe a PESO da Carga:");
            double peso = sc.nextDouble();

            Carga x = new Carga(codigo, descricao, peso); //Instanciação usando os dadods fornecidos pelo usuário

            listCarga.add(x); //Adiciona cada dado inserido pelo usuário na listCarga
        }

        System.out.println("RELATÓRIO DE CARGA:");
        for (Carga x : listCarga) {
            System.out.println(x);
        }

        System.out.println("RADAR DE BUSCA: ");
        System.out.println("Informe o CÓDIGO a ser buscado: ");
        int codigoBusca = sc.nextInt();

        Carga cargaBuscada = listCarga.stream().filter(x -> x.getCodigo() == codigoBusca).findFirst().orElse(null);

        if (cargaBuscada == null) {
            System.out.println("Carga NÃO encontrada. (DIGITE UM CÓDIGO VÁLIDO)");
            for (Carga x : listCarga){
                System.out.println(x);
            }
        } else {
            System.out.println("CARGA LOCALIZADA: ");
            System.out.println("Código: " + cargaBuscada.getCodigo());
            System.out.println("Descrição: " + cargaBuscada.getDescricao());
            System.out.println("Peso: " + cargaBuscada.getPeso() + "Kg");
        }


        sc.close();
    }
}

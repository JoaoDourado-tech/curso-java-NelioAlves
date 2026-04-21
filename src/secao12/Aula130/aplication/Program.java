package secao12.Aula130.aplication;

import secao12.Aula130.entities.Departamento;
import secao12.Aula130.entities.HoraContrato;
import secao12.Aula130.entities.Worker;
import secao12.Aula130.entities.enums.WorkerLevel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o NOME do departamento: ");
        String nomeDepartamento = sc.nextLine();

        Departamento departamento = new Departamento(nomeDepartamento); // Instanciei o OBJ departamento recebendo como parâmetro a variável nomeDepartamento

        /*
        OU SIMPLESMENTE INSTANCIAR com sc.nextLine de parâmetro:

        System.out.print("Digite o NOME do departamento: ");
        Departamento departamento = new Departamento(sc.nextLine);

        Mais CleanCode e mais prático...
         */

        System.out.println();
        System.out.println("Informe os DADOS do TRABALHADOR: ");

        System.out.print("Nome: ");
        // AQUI cometi um erro de colocar um sc.nextLine() solto para evitar o bug, mas aconteceu exatamente isso KKKKK
        //SOMENTE uso esse bizu quando tiver usado um sc.nextDouble() ou sc.nextInt() ANTERIORMENTE, mas só havia usado outro sc.nextLine()
        //Então meu Buffer já estava limpo, quando chegou no sc.nextLine() solto, ele parou o programa do nada esperando o ENTER do usuário...
        String nome = sc.nextLine();

        System.out.print("Level: (JUNIOR / MID_LEVEL / SENIOR) ");
        WorkerLevel level = WorkerLevel.valueOf(sc.nextLine().toUpperCase());
        //Para eu conseguir usar o NextLine no tipo WorkerLevel precisei usar esse .valueOf, consegui devido uma sacada e auxílio do IntelliJ

        System.out.print("Salário Base: ");
        Double salarioBase = sc.nextDouble();
        System.out.println();

        System.out.println("Informe a QUANTIDADE DE CONTRATOS do Funcionário: ");
        int quantContrato = sc.nextInt(); //Agora, sim, o Buffer está sujo
        System.out.println();

        Worker trabalhador = new Worker(nome,level,salarioBase,departamento); //Instanciei o Objeto trabalhador para armazenar os dados dele

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //Formatação que converte o Padrão BR para o Padrão ISO
        for (int i = 0; i < quantContrato; i++) {
            System.out.printf("Dados do %dº Contrato: ", i + 1);
            System.out.print("DATA (DD/MM/YYYY): ");
            sc.nextLine();
            LocalDate data = LocalDate.parse(sc.nextLine(), fmt1); //Forma para usar o sc.nextLine junto do tipo LocalDate e fmt1 converte para o padrão
            System.out.print("VALOR POR HORA do Contrato: ");
            Double valorPorHora = sc.nextDouble();
            System.out.print("DURAÇÃO: ");
            Integer horas = sc.nextInt();

            HoraContrato contrato = new HoraContrato(data,valorPorHora,horas);//Instanciação do Contrato
            trabalhador.addContrato(contrato); //Adiciona o contrato na List no Objeto Worker
        }

        System.out.println("Informe a DATA para calcular o LUCRO TOTAL: (DD/MM/YYYY) ");
        sc.nextLine();
        LocalDate dataContrato = LocalDate.parse(sc.nextLine(), fmt1); //Data filtro dos contratos desse período
        int ano = dataContrato.getYear();
        int mes = dataContrato.getMonthValue();
        double lucro = trabalhador.lucroWorker(ano,mes);

        System.out.println();

        System.out.println("Nome: " + trabalhador.getNome());
        System.out.println("Departamento: " + trabalhador.getDepartamento().getNome());
            //.getDepartamento() pega o Obj Departamento inteiro
            //.getNome() acessa somente o parâmetro NOME do Departamento
        System.out.printf("Lucro no período %d/%d: %.2f%n", mes, ano, lucro);
















        sc.close();
    }


}

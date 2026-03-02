package secao07;

public class ExStringsBanco {
    public static void main(String[] args) {

        // O pacote de dados recebido do servidor (completamente bagunçado)
        // Padrão esperado: CPF ; NOME ; SALDO
        String linhaSuja = "   084.555.999-12; JOaO DoURaDo ; 2500,50   ";

        System.out.println("--- DADOS RECEBIDOS ---");
        System.out.println("Linha original: [" + linhaSuja + "]\n");

        // 1. Tática do Trim: Removendo os espaços inúteis das pontas
        String linhaLimpa = linhaSuja.trim();

        // 2. Tática do Split: Explodindo a linha onde tem o Ponto e Vírgula (;)
        // Isso vai gerar um Array de 3 gavetas: [0] CPF, [1] Nome, [2] Saldo
        String[] dados = linhaLimpa.split(";");

        // 3. Tratamento Individual (O Bisturi)

        // Pegamos o CPF (gaveta 0), limpamos espaços acidentais e trocamos . e - por vazio
        String cpfFormatado = dados[0].trim().replace(".", "").replace("-", "");

        // Pegamos o Nome (gaveta 1), limpamos espaços e padronizamos tudo para Maiúsculo
        String nomeFormatado = dados[1].trim().toUpperCase();

        // Pegamos o Saldo (gaveta 2), limpamos espaços e trocamos a vírgula por ponto (padrão americano)
        String saldoFormatado = dados[2].trim().replace(",", ".");

        System.out.println("--- DADOS PROCESSADOS E PRONTOS PARA O BANCO DE DADOS ---");
        System.out.println("CPF: " + cpfFormatado);
        System.out.println("Cliente: " + nomeFormatado);
        System.out.println("Saldo: R$ " + saldoFormatado);

        // Curiosidade: Agora que o saldo tem ponto no lugar da vírgula,
        // o Java consegue transformar esse texto em número real para fazer contas!
        double saldoReal = Double.parseDouble(saldoFormatado);
        System.out.println("Saldo final com rendimento: R$ " + (saldoReal + 100.00));
    }
}
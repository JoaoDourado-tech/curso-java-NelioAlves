package secao09.Entidade;

public class Conta {
    private final int numConta;
    private String nome;
    private double saldo;

//                              CONSTRUTORES e SOBRECARGAS:

//Construtor Principal:
    public Conta(int numConta, String nome, double saldo){
        this.numConta = numConta;
        this.nome = nome;
        this.saldo = saldo;
    }

//Sobrecarga:
    public Conta(int numConta, String nome){ //NÃO é necessário fornecer um Depósito Inicial
        this.numConta = numConta;
        this.nome = nome;
    }


//                                   GETTERS e SETTERS

    public int getNumConta(){ return this.numConta;}
    //setNumConta não será criado para não permitir a alteração do numConta

    public String getNome(){return this.nome;}
    public void setNome(String nome){this.nome = nome;}

    public double getSaldo(){return this.saldo;}
    //Setter NÃO será criado para não permitir alterar no meio do programa o Depósito Inicial


//                                            MÉTODOS / FUNÇÕES

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void retirar(double valor) {
        this.saldo -= (valor + 5);
    }
    public String toString() {
        return String.format("Nome: %s | Número de Conta: %d | Saldo: %.2f", nome, numConta, saldo);
    }
}

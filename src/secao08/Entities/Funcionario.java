package secao08.Entities;

public class Funcionario {
    public String nome;
    public double salBruto;
    public double imposto;

    public String toString(){
        return String.format("Funcionário: %s, R$ %.2f%n", nome, salLiquido());
    }

    public double salLiquido(){
        return salBruto - imposto;
    }

    public void salAumento(double percent) {
        salBruto += (salBruto * percent/100);

    }


}

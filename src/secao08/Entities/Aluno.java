package secao08.Entities;

public class Aluno {
    public String nome;
    public double n1; //1ºTrimestre vale 30
    public double n2; //2ºTrimestre vale 35
    public double n3; //3ºTrimestre vale 35

    public double nFinal(){
        return (n1 + n2 + n3);
    }
    public String resultado(){
        if (nFinal() >= 60.00) {
            return "PASS";
        } else {
            return String.format("FAILED (Pontos faltando para aprovação: %.2f%n)", 60 - nFinal());
        }
    }

}

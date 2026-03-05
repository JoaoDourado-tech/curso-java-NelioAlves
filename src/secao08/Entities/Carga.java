package secao08.Entities;

public class Carga {
    public int codigo;
    public String destino;
    public double peso;


    public double calcularCustoVoo() {
        return (25.50 * peso);
    }
}

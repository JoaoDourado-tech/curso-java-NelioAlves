package secao08.Entities;

public class Conversor {
    public static double valorIOF = (0.06);
    public static double valorDolar;
    public static double cotacaoDolar;


    public static double valorReais(){
        return ((valorIOF*valorDolar)+valorDolar)*cotacaoDolar;
    }
}

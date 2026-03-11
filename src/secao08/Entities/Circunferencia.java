package secao08.Entities;

public class Circunferencia {
    public double raio;

    public double perimetro(){
        return (2*Math.PI*raio);
    }

    public double volume() {
        return (((double) 4 / 3) * (Math.PI * (Math.pow(raio, 3))));
    }
}

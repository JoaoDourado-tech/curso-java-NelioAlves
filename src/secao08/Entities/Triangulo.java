package secao08.Entities;

public class Triangulo {
    public double a;
    public double b;
    public double c;

    //Passando as Funções do Main para se tornarem Métodos no Class Triangulo
    public double areaTriangulo() {
        double p = ((a + b + c) / 2);
        return (Math.sqrt(p * (p - a) * (p - b) * (p - c)));
    }

    public double compararArea(Triangulo outro) {
        return Math.max(this.areaTriangulo(), outro.areaTriangulo());
    }
    }

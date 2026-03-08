package secao08.Entities;

public class Retangulo {
    public double largura;
    public double altura;

    public double areaRetangulo(){
        return largura * altura;
    }

    public double perimetroRetangulo(){
        return (2 * largura) + (2 * altura);
    }

    public double diagonalRetangulo(){
        return Math.sqrt(Math.pow(largura,2) + Math.pow(altura,2)); // Fórmula da Hipotenusa
        // Por formar um Triângulo 3,4,5 daria para identificar a diagonal como 5 rapidamente...
    }

    public String toString(){
        return String.format("Dados do Retângulo:%n ÁREA = %.2f%n PERIMETRO = %.2f%n DIAGONAL = %.2f%n", areaRetangulo(), perimetroRetangulo(), diagonalRetangulo());
    }
}

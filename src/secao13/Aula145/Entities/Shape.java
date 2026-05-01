package secao13.Aula145.Entities;

public abstract class Shape { // Classe Abstrata
    private Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract Double area(); // Metodo Abstrato

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(area());
        return sb.toString();
    }
}


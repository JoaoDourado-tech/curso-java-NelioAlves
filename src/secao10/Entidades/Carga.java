package secao10.Entidades;

public class Carga {
    private int codigo;
    private String descricao;
    private double peso;


    public Carga(int codigo, String descricao, double peso) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.peso = peso;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Carga{" +
                "codigo=" + codigo +
                ", descricao='" + descricao + '\'' +
                ", peso=" + peso +
                '}';
    }
}

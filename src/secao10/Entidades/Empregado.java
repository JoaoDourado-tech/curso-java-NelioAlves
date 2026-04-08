package secao10.Entidades;

public class Empregado {
    private int id;
    private String nome;
    private double salario;

    public Empregado(int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Empregado{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    public void aumentarSalario(double porcentagem){
        salario += (salario * (porcentagem/100));
    }


}

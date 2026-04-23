package secao12.Aula130.entities;

import secao12.Aula130.entities.enums.WorkerLevel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Worker {
    private String nome;
    private WorkerLevel level;
    private Double salarioBase;

    // COMPOSIÇÃO entre Worker, HoraContrato e Departamento
    private Departamento departamento;
    private List<HoraContrato> contratos = new ArrayList<>();

    public Worker(String nome, WorkerLevel level, Double salarioBase, Departamento departamento) {
        this.nome = nome;
        this.level = level;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
        //Na criação do obj Worker, ele ainda NÃO possui contrato, ao longo do tempo que ele irá assinar contratos
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<HoraContrato> getContratos() {
        return contratos;
    }
    //Não há setter para a List, já que isso poderia permitir inserir/apagar elementos da List sem .add() ou .remove()


    // Métodos:

    public void addContrato(HoraContrato contrato){
        contratos.add(contrato);
    }

    public void removeContrato(HoraContrato contrato) {
        contratos.remove(contrato);
    }

    public Double lucroWorker(int ano, int mes){
        double somaSalario = salarioBase;
        for (HoraContrato contrato : contratos){
            if(ano == contrato.getData().getYear() && mes == contrato.getData().getMonthValue()){
                somaSalario += contrato.valorTotal();
            }
        }
        return somaSalario;
    }


}

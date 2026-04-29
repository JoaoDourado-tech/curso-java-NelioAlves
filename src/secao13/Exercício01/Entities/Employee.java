package secao13.Exercício01.Entities;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private Integer hour;
    private Double valuePerHour;


    public Employee(){
    }
    public Employee(String name, Integer hour, Double valuePerHour) {
        this.name = name;
        this.hour = hour;
        this.valuePerHour = valuePerHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Double payment(){
        return valuePerHour*hour;
    }


    public String toString(){
        StringBuilder sb = new StringBuilder();
            sb.append("Name: ").append(getName()).append(" - $").append(String.format("%.2f",payment()));
        return sb.toString();
    }
}

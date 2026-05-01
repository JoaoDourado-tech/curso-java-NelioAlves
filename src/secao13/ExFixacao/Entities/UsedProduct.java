package secao13.ExFixacao.Entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product {
    private LocalDate manufactureDate;

    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public UsedProduct(String name, Double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
    @Override
    public String priceTag(){
        StringBuilder sb = new StringBuilder();
        sb.append(getName()).append(" (USED) $").append(getPrice()).append("(Manufacture Date: ").append(getManufactureDate().format(fmt)).append(")");
        return sb.toString();
    }
}

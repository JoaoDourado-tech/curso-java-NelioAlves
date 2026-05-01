package secao13.ExFixacao.Entities;

public class ImportedProduct extends Product {
    private Double customsFee;

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }
    @Override
    public String priceTag(){
        StringBuilder sb = new StringBuilder();
        sb.append(getName()).append(" $").append(totalPrice()).append("(Customs Fee: $").append(getCustomsFee()).append(")");
        return sb.toString();
    }

    public Double totalPrice(){
        return customsFee+getPrice();
    }
}

package secao12.Aula130.Exercicio03.entities;

import secao12.Aula130.Exercicio03.entities.enums.OrderStatus;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private LocalDateTime moment;
    private OrderStatus status;
    private Client client;

    private List<OrderItem> listItens = new ArrayList<>();

    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public Order(LocalDateTime moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getListItens() {
        return listItens;
    }

    //Métodos
    public void addItem(OrderItem item) {
        listItens.add(item);
    }
    public void removeItem(OrderItem item){
        listItens.remove(item);
    }
    public Double total(){
        Double sum = 0.0;
        for(OrderItem item :listItens){
            sum += item.subTotal();
        }
        return sum;
    }

    public String toString() {
        StringBuilder sb =  new StringBuilder();
        sb.append("ORDER SUMARY: \n");
        sb.append("Order Moment: ").append(moment.format(fmt)).append("\n");
        sb.append("Order Status: ").append(getStatus()).append("\n");
        sb.append(client.toString()).append("\n");
        sb.append("\n");
        sb.append("Order Items: \n");
        for(OrderItem item : listItens){
            sb.append(item.getProduct().getName()).append(", $").append(item.getProduct().getPrice()).append(", ").append(item.getQuantity()).append(", $").append(item.subTotal()).append("\n");
        }
        sb.append("Total Price: ").append(total()).append("\n");
        return sb.toString();
    }

}

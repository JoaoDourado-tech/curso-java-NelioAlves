package secao12.Aula130.Exercicio03.aplication;

import secao12.Aula130.Exercicio03.entities.Client;
import secao12.Aula130.Exercicio03.entities.Order;
import secao12.Aula130.Exercicio03.entities.OrderItem;
import secao12.Aula130.Exercicio03.entities.Product;
import secao12.Aula130.Exercicio03.entities.enums.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Client Data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth Date: (DD/MM/YYYY) ");
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birthDate = LocalDate.parse(sc.next(), fmt);
        System.out.println();

        Client client = new Client(name, email, birthDate); //Instanciação do Cliente

        System.out.println("Enter Order Data: ");
        System.out.print("""
                Status: (PENDING_PAYMENT,
                    PROCESSING,
                    SHIPPED,
                    DELIVERED""");
        OrderStatus status = OrderStatus.valueOf(sc.next().toUpperCase());
        LocalDateTime moment = LocalDateTime.now();
        Order order = new Order(moment, status, client);

        System.out.print("How many items to this Order? ");
        int quantity = sc.nextInt();

        for (int i = 0; i < quantity; i++) {
            System.out.printf("Enter %dºItem Data: ", i + 1);
            System.out.print("Name: ");
            sc.nextLine();
            String itemName = sc.nextLine();
            System.out.print("Product Price: ");
            Double itemPrice = sc.nextDouble();
            System.out.println("Quantity: ");
            Integer itemQuantity = sc.nextInt();

            OrderItem item = new OrderItem(itemQuantity,itemPrice,new Product(itemName, itemPrice));

            order.addItem(item);
            //Sendo bem sincero, dei uma baita bugada nesse trecho de instanciar os Objetos OrderItem e Product, acabei me perdendo no exercício e sem saber quem é o que... Mas acho que deu certo, com a ajuda do IntelliJ OBVIAMENTE
        }

        System.out.println(order);






        sc.close();
    }
}

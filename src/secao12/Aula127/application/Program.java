package secao12.Aula127.application;

import secao12.Aula127.entities.Order;
import secao12.Aula127.entities.enums.OrderStatus;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);









        sc.close();
    }
}

package secao13.ExFixacao.Aplication;

import secao13.ExFixacao.Entities.ImportedProduct;
import secao13.ExFixacao.Entities.Product;
import secao13.ExFixacao.Entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Products: ");
        int n = sc.nextInt();

        List<Product> products = new ArrayList<>();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        for (int i = 0; i < n; i++) {
            System.out.printf("PRODUCT #%d DATA: ", i + 1);
            System.out.println("Commom, Used or Imported? (C / U / I)");
            char type = sc.next().charAt(0);

            if (type == 'C') {
                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Price: ");
                Double price = sc.nextDouble();
                products.add(new Product(name,price));

            } else if (type == 'U') {
                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Price: ");
                Double price = sc.nextDouble();
                System.out.println("Manufacture Date: (DD/MM/YYYY)");
                sc.nextLine();
                LocalDate date = LocalDate.parse(sc.nextLine(), fmt);
                products.add(new UsedProduct(name,price,date));

            } else if (type == 'I') {
                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Price: ");
                Double price = sc.nextDouble();
                System.out.println("Customs Fee: ");
                Double customsFee = sc.nextDouble();
                products.add(new ImportedProduct(name, price, customsFee));
            }


        }
        for(Product p : products){
            System.out.println("PRICE TAGS: ");
            System.out.println(p.priceTag());
        }




        sc.close();
    }
}

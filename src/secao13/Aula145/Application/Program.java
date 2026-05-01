package secao13.Aula145.Application;

import secao13.Aula145.Entities.Circle;
import secao13.Aula145.Entities.Color;
import secao13.Aula145.Entities.Rectangle;
import secao13.Aula145.Entities.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Shapes:");
        int n = sc.nextInt();

        List<Shape> listShapes = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.printf("Shape #%d Data: ", i + 1);
            System.out.print("Rectangle or Circle? (R / C)");
            char Shape = sc.next().charAt(0);
            if (Shape == 'R') {
                System.out.print("Color: (BLACK / BLUE / RED)");
                Color color = Color.valueOf(sc.next().toUpperCase(Locale.US));

                System.out.print("Width: ");
                Double width = sc.nextDouble();

                System.out.print("Height: ");
                Double height = sc.nextDouble();
                Rectangle rectangle = new Rectangle(color, width, height);
                listShapes.add(rectangle);
                System.out.println();

            } else if (Shape == 'C') {
                System.out.print("Color: (BLACK / BLUE / RED)");
                Color color = Color.valueOf(sc.next().toUpperCase(Locale.US));
                System.out.print("Radius: ");
                Double radius = sc.nextDouble();
                Circle circle = new Circle(color, radius);
                listShapes.add(circle);
            }
        }
        System.out.println("SHAPE AREAS: \n");

        for (Shape s : listShapes) {
            System.out.println(s.toString());
        }



        sc.close();
    }
}

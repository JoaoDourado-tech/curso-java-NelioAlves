package secao10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Aula105 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(); // Instanciação
        // NÃO ACEITA TIPOS PRIMITIVOS, apenas WRAPPER CLASSES

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Ana");
        list.add(2, "Marco");

        System.out.println(list.size());

        for(String x : list){ // Estrutura "FOR-EACH"
            System.out.println(x);
        }

        System.out.println("---------------------------------");

        list.removeIf(x -> x.charAt(0) == 'M'); // Função Lambda para remover termos específicos

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("-----------------------------------");

        System.out.println("Index of Bob:" + list.indexOf("Bob")); // Retornar a posição do Elemento
        System.out.println("Index of Marco:" + list.indexOf("Marco")); //Se retornar -1 NÃO ENCONTROU o elemento

        System.out.println("-----------------------------------------------");

        //Mostrar somente Elementos com a 1ªletra A:
        List<String> resultado = list.stream().filter(x->x.charAt(0) == 'A').collect(Collectors.toList());
        for (String x : resultado) {
            System.out.println(x);
        }
        //.stream() transforma a list
        //.strem permite usar o comando .filter(função lambda)
        //.collector retornar o .strem para .list
        System.out.println("-------------------------------------------");

        String name = list.stream().filter(x -> x.charAt(0) == 'D').findFirst().orElse(null);
        System.out.println(name);

    }
}

package secao10;

public class Aula103 {
    public static void main(String[] args) {

        // CONCEITO DE BOXING:
//Forma de transformar uma variável do Tipo Valor (Que recebe um valor direto na sua caixinha e não um endereço como o Tipo Referência)

        int x = 20; // Var do Tipo Valor

        Object obj = x; // Var do Tipo Referência que retoma o endereço do valor 20;

        System.out.println(obj); //Imprime 20, usando-se de Boxing

        // CONCEITO DE UNBOXING:
// Forma de retornar ao Tipo Valor

        int y = (int) obj; // Torna o Tipo Referência obj num Tipo Valor INT
        System.out.println(y);


        // CONCEITO DE WRAPPER CLASSES:
// Transforma os Tipos Primitivos em Tipos Objetos
        // Short, Long, Boolean, Float, Double, Integer, Character, Bite (Sempre 1ªletra MAIÚSCULA)
        // Permite o Boxing/Unboxing de forma mais rápida e natural

        Integer obj2 = x; //Wrapper Class
        int z = obj2 * 2; //Permite operações rápidas semelhantes aos Tipos Primitivos
        System.out.println(z); //Mas com a vantagem de permitir ações de objetos e POO

        //Vatangens de Wrapper Classes:
            // Permitem usar valores Primitivos em Listas
            // Permite usar valores NULL
    }



}

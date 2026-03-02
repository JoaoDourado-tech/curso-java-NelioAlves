package secao07;

public class ExVetString {
    public static void main(String[] args) {


        String s = "potato apple lemon";

        String[] vect = s.split(" ");
// Função Split é usada para separar palavras em cada Variável:
        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);

    }
}

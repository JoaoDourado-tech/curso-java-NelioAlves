package secao07;

public class ExBitwise {
    public static void main(String[] args) {
        int n1 = 89;
        int n2 = 60;

        System.out.println(n1 & n2); // Operador & = "e" lógico
        System.out.println(n1 | n2); // Operador | = "ou" lógico
        System.out.println(n1 ^ n2); // Operador ^ (XOR) = "ou" Exclusivo (V.L. iguais dá False)
    }
}

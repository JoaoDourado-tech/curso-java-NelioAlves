package secao07;

public class ExFuncStrings {
    public static void main(String[] args) {
        String original = "abcde FGHIJ ABC abc DEFG";

        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(2, 9); //Recorta iniciando do char 2 e terminando no char 9
        String s06 = original.replace('a', 'x'); //Troca o 'a' por 'x'

        System.out.println("Original: " + original);
        System.out.println("toLowerCase: " + s01);
        System.out.println("toUpperCase: " + s02);
        System.out.println("trim: " + s03);
        System.out.println("substring: " + s04);
    }
}

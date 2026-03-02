package secao03;

public class Aula32 {
    public static void main(String[] args) {
        //Aprendendo CASTING
        int x = 21;
        double y = 3.5;

        //Widening
        double newX = (double) x;
        //Não necessita do (double), pois o Java consegue fazer essa conversão IMPLICITAMENTE
        System.out.println(newX);
            //Transformei o VALOR CÓPIA da VAR em tipo Double, mas como a mesma era INT não houve risco de perda de dados

        //Narrowing
        int newY = (int) y;
        //Forcei o VALOR da var double Y a ser COPIADO e levado a um INT, mas havendo a perda de 0.5 nos dados
        System.out.println(newY);

    }
}

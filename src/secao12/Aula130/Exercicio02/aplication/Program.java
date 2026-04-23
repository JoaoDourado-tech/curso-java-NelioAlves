package secao12.Aula130.Exercicio02.aplication;

import secao12.Aula130.Exercicio02.entities.Comment;
import secao12.Aula130.Exercicio02.entities.Post;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"); //Usei o DTF.ofPattern para transformar o Padrão ISO no Padrão BR
        LocalDateTime moment = LocalDateTime.parse("21/06/2018 13:05:44", fmt);
        //LocalDateTime moment = LocalDateTime.now(); //Entidimento final - Aprendi que o .now() pega o horário do servidor em que a aplicação roda, ou seja, pegaria o horário exato do comment
        //Mas nesse exercício o professor pede apenas que se escreva a data exemplo na UML
        //Fiquei na dúvida de como realmente capturar o tempo no momento do comentário
        //Usei o .now() mas fiquei na dúvida se ele pegará o MEU tempo agora ou o tempo do usuário

        System.out.println("Type the TITLE of the Post: ");
        String title = "Travelling to New Zealand";
        System.out.println("Type the CONTENT of the Post: ");
        String content = "I'm going to visit this wonderful country!";
        Integer likes = 12;
        Post post1 = new Post(likes, content, title, moment);

        String text11 = "Have a nice trip";
        String text12 = "Wow that's awesome!";

        Comment comment11 = new Comment(text11); //Instanciei comentário 1
        Comment comment12 = new Comment(text12); //Instanciei comentário 2
        //Adicionando na List de comentários:
        post1.addComment(comment11);
        post1.addComment(comment12);

        LocalDateTime moment2 = LocalDateTime.parse("28/07/2018 23:14:19", fmt);
        String title2 = "Good night guys";
        String content2 = "See you tomorrow!";
        Integer likes2 = 5;

        Post post2 = new Post(likes2, content2, title2, moment2);

        String text21 = "Good night";
        String text22 = "May the force be with you";

        Comment comment21 = new Comment(text21);
        Comment comment22 = new Comment(text22);

        post2.addComment(comment21);
        post2.addComment(comment22);

        System.out.println(post1.toString());
        System.out.println(post2.toString());









        sc.close();
    }
}

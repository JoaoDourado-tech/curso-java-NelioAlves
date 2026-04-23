package secao12.Aula130.Exercicio02.entities;

import java.util.ArrayList;
import java.util.List;

public class Comment {
    private String text;


    public Comment(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
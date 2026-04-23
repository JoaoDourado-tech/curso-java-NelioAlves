package secao12.Aula130.Exercicio02.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {
    private LocalDateTime moment;
    private String title;
    private String content;
    private Integer likes;

    public Post(Integer likes, String content, String title, LocalDateTime moment) {
        this.likes = likes;
        this.content = content;
        this.title = title;
        this.moment = moment;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    private List<Comment> listComments = new ArrayList<>(); //List que irá armazenar todos os diversos comments do Post

    public void addComment(Comment comment){
        listComments.add(comment);
    }
    public void removeComment(Comment comment){
        listComments.remove(comment);
    }

    public List<Comment> getListComments() { //SOMENTE GETTER da List, pois o SET será feito pelo AddComment
        return listComments;
    }

    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Moment: " + moment.format(fmt) + "\n");
        sb.append("Title: " + title + "\n");
        sb.append("Content: " + content + "\n");
        sb.append("Likes: " + likes + "\n");

        sb.append("Coments: ").append("\n");

        for (Comment c : listComments) {
            sb.append(c.getText()).append("\n");
        }
        return sb.toString();
    }
}

package quotes;

import java.util.ArrayList;
import java.util.List;

public class Quote {
    List<String> tags;
    private String author;
    private  String likes;
    private String text;

    public Quote(List<String> tags, String author, String likes, String text) {
        this.tags = new ArrayList<>();
        this.author = author;
        this.likes = likes;
        this.text = text;
    }

    public Quote(String text) {
        this.text=text;
    }

    public List<String> getTags() {
        return tags;
    }

    public String getAuthor() {
        return author;
    }

    public String getLikes() {
        return likes;
    }

    public String getText() {
        return text;
    }
}

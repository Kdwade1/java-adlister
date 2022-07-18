package Beans;

import java.io.Serializable;

public class Quotes implements Serializable {
    private long id;
    private String content;
    private Author author;
    public Quotes() {

    }
    public long getQuotes() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Author getAuthor() {
        return author;
    }



    public Quotes(long id, String content, Author author) {
        this.id = id;
        this.content = content;
        this.author=author;
    }
}

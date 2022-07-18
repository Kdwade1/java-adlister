package Beans;

import java.io.Serializable;

public class Author implements Serializable {
    public Author(int id, String firstname, String lastname, int authorID) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.authorID = authorID;
    }

    private int id;
    private String firstname;
    private String lastname;
    private int authorID;

    public Author() { }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAuthorID() {
        return authorID;
    }

    public void setAuthorID(int authorID) {
        this.authorID = authorID;
    }
}

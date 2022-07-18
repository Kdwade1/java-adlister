package Beans;

import java.io.Serializable;
import java.util.Date;

public class Album implements Serializable {
    private long id;
    private Artist artist;
    private String name;
    private Date releaseDate;
    private double sales;
    private String genre;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setAlbum(String album) {
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getReleasedate() {
        return releaseDate;
    }

    public void setReleasedate(Date releasedate) {
        this.releaseDate = releasedate;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(long sales) {
        this.sales = sales;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Album (){  }
}


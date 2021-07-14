/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *///make new class (comic) boolean ||(string artist, string genre)
package library;

public class Comic extends Book {

    private String artist, genre;
    private boolean colour;

    public Comic() {
    }

    ;
    
    public Comic(String type, String topic) {
        super();
        this.artist = artist;
        this.genre = genre;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String type) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String topic) {
        this.genre = genre;
    }

    public boolean getColour() {
        return colour;
    }

    public void setColour(boolean colour) {
        this.colour = colour;
    }
}
/**
 *
 * @author London
 */

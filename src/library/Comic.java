/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *///make new class (comic) boolean ||(string artist, string genre)
package library;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Comic extends Book implements BookInterface {

    private String artist, genre, type;
    private boolean colour;
    private List<Comic> comics;

    public Comic() {
        comics = new ArrayList<>();
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

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void getBook() {
        for (Comic c : comics) {
            System.out.println("Book's Name : " + c.getName());
            System.out.println("Book's Writer : " + c.getWriter());
            System.out.println("Number of Pages : " + c.getPages());
            System.out.println("Comic Genre : " + c.getGenre());
            System.out.println("Comic Artist : " + c.getArtist());
            if (c.getColour()) {
                System.out.println("Comic is Colored : ");
            } else {
                System.out.println("Comic is not Colored : ");
            }
        }

    }

    @Override
    public void addBook(Scanner scanner) {
        Comic sTemp1 = new Comic();
        System.out.println("insert Book Name : ");
        sTemp1.setName(scanner.next());
        System.out.println("insert Book's Writer : ");
        sTemp1.setWriter(scanner.next());
        System.out.println("insert Science Artist : ");
        sTemp1.setArtist(scanner.next());
        System.out.println("insert Science Genre : ");
        sTemp1.setGenre(scanner.next());
        System.out.println("1, true");
        System.out.println("2 false");
        if (scanner.nextInt() == 1) {
            sTemp1.setColour(true);
        } else {
            sTemp1.setColour(true);
        }
        comics.add(sTemp1);

    }
}

/**
 *
 * @author London
 */

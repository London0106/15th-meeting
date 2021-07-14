/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import java.util.Scanner;
//4 Menu that can input science book, input comic book, show science book, and show comic book.
//name of writer, pages, type, genre, colour

/**
 *
 * @author London
 */
public class Library {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Science menjadi list dengan comic
        // TODO code application logic here
        List<Science> sciences = new ArrayList<>();
        List<Comic> comics = new ArrayList<>();

        Comic comic = new Comic();
        Scanner scanner = new Scanner(System.in);
        int menu;

        do {
            System.out.println("----menu-----");
            System.out.println("1. Input Science Book");
            System.out.println("2. Input Comic Book");
            System.out.println("3. Show Science Book");
            System.out.println("4. Show Comic Book");
            System.out.println("0. exit");
            menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    Science sTemp = new Science();
                    System.out.println("insert Book Name : ");
                    sTemp.setName(scanner.next());
                    System.out.println("insert Book's Writer : ");
                    sTemp.setWriter(scanner.next());
                    System.out.println("Number of _ages : ");
                    sTemp.setPages(scanner.nextInt());
                    System.out.println("insert Science type : ");
                    sTemp.setType(scanner.next());
                    System.out.println("insert Science Topic : ");
                    sTemp.setTopic(scanner.next());

                    sciences.add(sTemp);
                    break;
                case 2:
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
                        comic.setColour(true);
                    } else {
                        comic.setColour(true);
                    }
                    comics.add(sTemp1);
                    break;
                case 3:
                    for (Science s : sciences) {
                        System.out.println("Book's Name : " + s.getName());
                        System.out.println("Book's Writer : " + s.getWriter());
                        System.out.println("Number of Pages : " + s.getPages());
                        System.out.println("Science Type : " + s.getType());
                        System.out.println("Science Topic : " + s.getTopic());
                    }

                    break;
                case 4:
                    for (Comic c : comics) {
                        System.out.println("Book's Name : " + c.getName());
                        System.out.println("Book's Writer : " + c.getWriter());
                        System.out.println("Number of Pages : " + c.getPages());
                        System.out.println("Comic Genre : " + c.getGenre());
                        System.out.println("Comic Artist : " + c.getArtist());
                        if (comic.getColour()) {
                            System.out.println("Comic is Colored : ");
                        } else {
                            System.out.println("Comic is not Colored : " );
                        }
                    }

                    break;
            }

        } while (menu != 0);
    }
}

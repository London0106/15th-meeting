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

        Science science = new Science();
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
                    science.addBook(scanner);
                    break;
                case 2:
                    comic.addBook(scanner);
                    break;
                case 3:
                    science.getBook();

                    break;
                case 4:
                    comic.getBook();
                    break;
            }

        } while (menu != 0);
    }
}

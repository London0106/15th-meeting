/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;
public class Book {
    protected String name, writer;
    protected int pages;
   
    public Book(){}

    public Book(String name, int pages, String writer) {
        this.name = name;
        this.pages = pages;
        this.writer = writer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }
   
   
   
   
   
}

/**
 *
 * @author London
 */


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Science extends Book implements BookInterface{
    private String type, topic;
    List<Science> sciences;
   
    public Science(){
        sciences = new ArrayList<>();
    };

    public Science(String type, String topic) {
        super();
        this.type = type;
        this.topic = topic;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Override
    public void getBook() {
        for (Science s : sciences) {
            System.out.println("Book's Name : " + s.getName());
            System.out.println("Book's Writer : " + s.getWriter());
            System.out.println("Number of Pages : " + s.getPages());
            System.out.println("Science Type : " + s.getType());
            System.out.println("Science Topic : " + s.getTopic());
        }
    }

    @Override
    public void addBook(Scanner scanner) {
        Science sTemp = new Science();
        System.out.println("insert Book Name : ");
        sTemp.setName(scanner.next());
        System.out.println("insert Book's Writer : ");
        sTemp.setWriter(scanner.next());
        System.out.println("Number of pages : ");
        sTemp.setPages(scanner.nextInt());
        System.out.println("insert Science type : ");
        sTemp.setType(scanner.next());
        System.out.println("insert Science Topic : ");
        sTemp.setTopic(scanner.next());

        sciences.add(sTemp);
    }
   
}
/**
 *
 * @author London
 */


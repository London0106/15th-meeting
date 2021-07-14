/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package library;
public class Science extends Book{
    private String type, topic;
   
    public Science(){};

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
   
   
   
   
   
}
/**
 *
 * @author London
 */


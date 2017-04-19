/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente.bean;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;



public class ChatMessage implements Serializable {
    private String name;
    private String text;
    private String nameReserved;
    private Set<String> setOnlines = new HashSet<String>();

    public String getName() {
        return name;
    }

    public String getText() {
        return text;
    }

    public String getNameReserved() {
        return nameReserved;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setNameReserved(String nameReserved) {
        this.nameReserved = nameReserved;
    }

    public void setSetOnlines(Set<String> setOnlines) {
        this.setOnlines = setOnlines;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public Set<String> getSetOnlines() {
        return setOnlines;
    }

    public Action getAction() {
        return action;
    }
    private Action action;
    
    public enum Action{
        CONNECT,DISCONNECT,SEND_ONE,SEND_ALL, USERS_ONLINE
    }
}


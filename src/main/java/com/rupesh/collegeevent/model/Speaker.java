package com.rupesh.collegeevent.model;

public class Speaker {

    private int id;
    private String name;
    private String designation;
    private String topic;

    public Speaker() {
    }

    public Speaker(int id, String name, String designation, String topic) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.topic = topic;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
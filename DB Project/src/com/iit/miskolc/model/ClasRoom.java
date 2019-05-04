package com.iit.miskolc.model;

public class ClasRoom extends Ressource{
    private String id;
    private long capacity;

    public void setId(String idd) {
        this.id= idd;
    }
    public String getId() {
        return id;
    }
    public void setCapacity(long cp) {
        this.capacity = cp;

    }
    public long getCapacity() {
        return capacity;

    }

}
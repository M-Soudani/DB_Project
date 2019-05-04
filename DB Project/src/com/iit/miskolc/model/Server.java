package com.iit.miskolc.model;


public class Server extends Ressource{
        private String id;
        private String config;
        private String type;

    public void setId(String idd) {
        this.id = idd;

    }
    public String getId() {
        return id;
    }
    public void setConfig(String conf) {
        this.config = conf;
    }
    public String getConfig() {
        return config;
    }
    public void setType(String tp) {
        this.type = tp;
    }
    public String getType() {
        return type;

    }

        }


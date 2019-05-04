package com.iit.miskolc.model;

public class Printer extends Ressource{
        private String id;
        private String type;
        private boolean state;

        public void setId(String idd) {
                this.id= idd;
        }
        public String getId() {
                return id;
        }
        public void setType(String tp) {
                this.type = tp;
        }
        public String getType() {
                return type;
        }
        public void setState(boolean st) {
                this.state = st;
        }
        public boolean getState() {
                return state;
        }

        }

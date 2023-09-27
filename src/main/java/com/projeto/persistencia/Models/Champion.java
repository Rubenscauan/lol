package com.projeto.persistencia.Models;

public class Champion{
    private String name;
    private String creationDate;
    private String function;
    private String range;
    private String Q;
    private String W;
    private String E;
    private String ultimate;
    
    public Champion(String name, String creationDate, String function, String range, String q, String w, String e, String ultimate) {
        this.name = name;
        this.creationDate = creationDate;
        this.function = function;
        this.range = range;
        Q = q;
        W = w;
        E = e;
        this.ultimate = ultimate;
    }
    
    @Override
    public String toString() {
        return "Champion [name=" + name + ", function=" + function + ", Q=" + Q + ", W=" + W + ", E=" + E
                + ", ultimate=" + ultimate + "]";
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCreationDate() {
        return creationDate;
    }
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }
    public String getFunction() {
        return function;
    }
    public void setFunction(String function) {
        this.function = function;
    }
    public String getRange() {
        return range;
    }
    public void setRange(String range) {
        this.range = range;
    }
    public String getQ() {
        return Q;
    }
    public void setQ(String q) {
        Q = q;
    }
    public String getW() {
        return W;
    }
    public void setW(String w) {
        W = w;
    }
    public String getE() {
        return E;
    }
    public void setE(String e) {
        E = e;
    }
    public String getUltimate() {
        return ultimate;
    }
    public void setUltimate(String ultimate) {
        this.ultimate = ultimate;
    }


    

}
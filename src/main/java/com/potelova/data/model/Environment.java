package com.potelova.data.model;

import java.io.Serializable;

public class Environment implements Serializable {
    public String name;
    public double weight;
    public Limit limit;

    public Environment(String name, double weight, Limit limit) {
        this.name = name;
        this.weight = weight;
        this.limit = limit;
    }

    public Environment() {
    }
}
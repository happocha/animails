package com.potelova.ui.model;

import com.potelova.data.model.Environment;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Cell {

    private List<Environment> environments = new CopyOnWriteArrayList<>();
    private final int x;

    private final int y;

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public List<Environment> getEnvironments() {
        return environments;
    }

    public void setEnvironments(List<Environment> environments) {
        this.environments = environments;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

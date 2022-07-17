package com.potelova.ui.model;

import java.util.ArrayList;
import java.util.List;

public class GameMap {
    private final List<List<Cell>> cells = new ArrayList<>();

    public List<List<Cell>> getCells() {
        return cells;
    }
}

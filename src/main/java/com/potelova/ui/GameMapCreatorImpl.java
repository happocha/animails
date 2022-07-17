package com.potelova.ui;

import com.potelova.data.model.Setting;
import com.potelova.ui.model.Cell;
import com.potelova.ui.model.GameMap;

import java.util.ArrayList;

public class GameMapCreatorImpl implements GameMapCreator {
    @Override
    public GameMap create(Setting setting) {
        final GameMap gameMap = new GameMap();
        for (int i = 0; i < setting.getCols(); i++) {
            gameMap.getCells().add(new ArrayList<>());
            for (int j = 0; j < setting.getRows(); j++) {
                gameMap.getCells().get(i).add(new Cell(i, j));
            }
        }
        return gameMap;
    }
}

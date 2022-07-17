package com.potelova.ui;

import com.potelova.data.model.Environment;
import com.potelova.ui.model.GameMap;

import java.util.List;

public interface EnvironmentCreator {
    void create(GameMap gameMap, List<Environment> environments);
}

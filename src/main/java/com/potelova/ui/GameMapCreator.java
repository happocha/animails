package com.potelova.ui;

import com.potelova.data.model.Setting;
import com.potelova.ui.model.GameMap;

public interface GameMapCreator {
    GameMap create(Setting setting);
}

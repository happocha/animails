package com.potelova.domain;

import com.potelova.data.model.Animal;
import com.potelova.data.model.Setting;

import java.util.List;

public interface ConsoleRepository {
    List<Animal> getAnimals();

    Setting getSetting();
}

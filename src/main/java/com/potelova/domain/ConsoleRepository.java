package com.potelova.domain;

import com.potelova.data.model.Environment;
import com.potelova.data.model.Setting;

import java.util.List;

public interface ConsoleRepository {
    List<Environment> getEnvironment();

    Setting getSetting();
}

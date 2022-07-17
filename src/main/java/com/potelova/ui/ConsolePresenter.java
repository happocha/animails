package com.potelova.ui;

import com.potelova.data.model.Environment;
import com.potelova.data.model.Setting;
import com.potelova.domain.EnvironmentUseCase;
import com.potelova.domain.SettingUseCase;
import com.potelova.ui.model.GameMap;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConsolePresenter {
    private final EnvironmentUseCase environmentUseCase;
    private final SettingUseCase settingUseCase;
    private final GameMapCreator gameMapCreator;

    private final EnvironmentCreator environmentCreator;

    private final ExecutorService executor = Executors.newSingleThreadExecutor();
    private GameMap gameMap;
    private View view;

    public ConsolePresenter(
            final EnvironmentUseCase environmentUseCase,
            final SettingUseCase settingUseCase,
            final GameMapCreator gameMapCreator,
            final EnvironmentCreator environmentCreator
    ) {
        this.environmentUseCase = environmentUseCase;
        this.settingUseCase = settingUseCase;
        this.gameMapCreator = gameMapCreator;
        this.environmentCreator = environmentCreator;
    }

    public void onAttach(View consoleView) {
        view = consoleView;
    }

    public void init() {
        try {
            List<Environment> environments = environmentUseCase.execute().get();
            Setting setting = settingUseCase.execute().get();
            gameMap = gameMapCreator.create(setting);
            environmentCreator.create(gameMap, environments);
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}

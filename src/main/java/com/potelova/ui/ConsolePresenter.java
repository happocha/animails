package com.potelova.ui;

import com.potelova.data.model.Environment;
import com.potelova.data.model.Setting;
import com.potelova.domain.EnvironmentUseCase;
import com.potelova.domain.SettingUseCase;
import com.potelova.ui.model.Cell;
import com.potelova.ui.model.GameMap;

import java.util.List;
import java.util.concurrent.*;

public class ConsolePresenter {
    private final EnvironmentUseCase environmentUseCase;
    private final SettingUseCase settingUseCase;
    private final GameMapCreator gameMapCreator;
    private final EnvironmentCreator environmentCreator;
    private final ExecutorService executor = Executors.newSingleThreadExecutor();
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
            final List<Environment> environments = environmentUseCase.execute().get();
            final Setting setting = settingUseCase.execute().get();
            final GameMap gameMap = createMap(setting).get();
            fillMap(gameMap, environments).get();
            for (Cell cell : gameMap.getCells().get(0)) {
                System.out.println(cell.getEnvironments().get(0).name);
            }
            onCleared();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    private Future<GameMap> createMap(final Setting setting) {
        return executor.submit(new Callable<GameMap>() {
            @Override
            public GameMap call() throws Exception {
                return gameMapCreator.create(setting);
            }
        });
    }

    private Future<Void> fillMap(final GameMap gameMap, final List<Environment> environments) {
        return executor.submit(new Callable<Void>() {
            @Override
            public Void call() throws Exception {
                environmentCreator.create(gameMap, environments);
                return null;
            }
        });
    }

    private void onCleared() {
        settingUseCase.shutdown();
        environmentUseCase.shutdown();
        executor.shutdownNow();
    }
}

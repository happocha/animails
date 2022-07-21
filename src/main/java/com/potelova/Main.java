package com.potelova;

import com.potelova.data.ConsoleRepositoryImpl;
import com.potelova.domain.ConsoleRepository;
import com.potelova.domain.EnvironmentUseCase;
import com.potelova.domain.SettingUseCase;
import com.potelova.ui.*;

public class Main {
    public static void main(String[] args) {
        final ConsoleRepository repository = new ConsoleRepositoryImpl();
        final EnvironmentUseCase environmentUseCase = new EnvironmentUseCase(repository);
        final SettingUseCase settingUseCase = new SettingUseCase(repository);
        final GameMapCreator gameMapCreator = new GameMapCreatorImpl();
        final EnvironmentCreator environmentCreator = new EnvironmentCreatorImpl();
        final SimulationService simulationService = new SimulationServiceImpl();
        final ConsolePresenter presenter = new ConsolePresenter(environmentUseCase, settingUseCase, gameMapCreator, environmentCreator, simulationService);
        final ConsoleView consoleView = new ConsoleView(presenter);
        consoleView.start();
    }
}

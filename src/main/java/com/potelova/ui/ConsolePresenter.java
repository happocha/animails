package com.potelova.ui;

import com.potelova.data.model.Animal;
import com.potelova.data.model.Setting;
import com.potelova.domain.AnimalUseCase;
import com.potelova.domain.SettingUseCase;

import java.util.List;
import java.util.concurrent.ExecutionException;

public class ConsolePresenter {
    private final AnimalUseCase animalUseCase;

    private final SettingUseCase settingUseCase;
    private View view;

    public ConsolePresenter(AnimalUseCase animalUseCase, SettingUseCase settingUseCase) {
        this.animalUseCase = animalUseCase;
        this.settingUseCase = settingUseCase;
    }

    public void onAttach(View consoleView) {
        view = consoleView;
    }

    public void getAnimals() {
        try {
            List<Animal> result = animalUseCase.execute().get();
            System.out.println(result.get(1).name);
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    public void getSettings() {
        try {
            Setting setting = settingUseCase.execute().get();
            System.out.println(setting.getPeriod());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}

package com.potelova;

import com.potelova.data.ConsoleRepositoryImpl;
import com.potelova.domain.AnimalUseCase;
import com.potelova.domain.ConsoleRepository;
import com.potelova.domain.SettingUseCase;
import com.potelova.ui.ConsolePresenter;
import com.potelova.ui.ConsoleView;
import com.potelova.ui.View;

public class Main {
    public static void main(String[] args) {
        final ConsoleRepository repository = new ConsoleRepositoryImpl();
        final AnimalUseCase animalUseCase = new AnimalUseCase(repository);
        final SettingUseCase settingUseCase = new SettingUseCase(repository);
        final ConsolePresenter presenter = new ConsolePresenter(animalUseCase, settingUseCase);
        final View view = new ConsoleView(presenter);
    }
}

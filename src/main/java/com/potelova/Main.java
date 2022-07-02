package com.potelova;

import com.potelova.data.ConsoleRepositoryImpl;
import com.potelova.domain.ConsoleRepository;
import com.potelova.domain.ConsoleUseCase;
import com.potelova.ui.ConsolePresenter;
import com.potelova.ui.ConsoleView;
import com.potelova.ui.View;

public class Main {

    public static void main(String[] args) {
        final ConsoleRepository repository = new ConsoleRepositoryImpl();
        final ConsoleUseCase useCase = new ConsoleUseCase(repository);
        final ConsolePresenter presenter = new ConsolePresenter(useCase);
        final View view = new ConsoleView(presenter);
    }
}

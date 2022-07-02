package com.potelova.ui;

import com.potelova.domain.ConsoleUseCase;

public class ConsolePresenter {
    private final ConsoleUseCase consoleUseCase;
    private View view;

    public ConsolePresenter(ConsoleUseCase consoleUseCase) {
        this.consoleUseCase = consoleUseCase;
    }

    public void onAttach(View consoleView) {
        view = consoleView;
    }

    public void init() {
        String result = consoleUseCase.execute();
        view.showStatistics(result);
    }
}

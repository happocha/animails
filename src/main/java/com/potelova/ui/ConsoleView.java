package com.potelova.ui;

public class ConsoleView implements View {

    private final ConsolePresenter presenter;

    public ConsoleView(ConsolePresenter presenter) {
        this.presenter = presenter;
        setUp();
    }

    @Override
    public void showStatistics(String statistics) {
        System.out.println(statistics);
    }

    private void setUp() {
        presenter.onAttach(this);
        presenter.init();
    }
}

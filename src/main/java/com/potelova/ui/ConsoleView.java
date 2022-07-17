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

    public void start() {
        presenter.init();
    }

    private void setUp() {
        presenter.onAttach(this);
    }
}

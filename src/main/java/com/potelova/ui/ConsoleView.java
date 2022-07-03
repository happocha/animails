package com.potelova.ui;

public class ConsoleView implements View {

    private final ConsolePresenter presenter;

    public ConsoleView(ConsolePresenter presenter) {
        this.presenter = presenter;
        setUp();
        getSettings();
        getAnimals();
    }

    @Override
    public void showStatistics(String statistics) {
        System.out.println(statistics);
    }

    private void getAnimals() {
        presenter.getAnimals();
    }

    private void getSettings() {
        presenter.getSettings();
    }

    private void setUp() {
        presenter.onAttach(this);
    }
}

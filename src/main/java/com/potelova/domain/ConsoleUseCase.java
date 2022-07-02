package com.potelova.domain;

public class ConsoleUseCase {
    private final ConsoleRepository consoleRepository;

    public ConsoleUseCase(ConsoleRepository consoleRepository) {
        this.consoleRepository = consoleRepository;
    }
    public String execute() {
        return consoleRepository.getTestData();
    }
}

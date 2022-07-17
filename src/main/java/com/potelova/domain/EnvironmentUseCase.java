package com.potelova.domain;

import com.potelova.data.model.Environment;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class EnvironmentUseCase {
    private final ConsoleRepository consoleRepository;

    private final ExecutorService executor = Executors.newSingleThreadExecutor();

    public EnvironmentUseCase(ConsoleRepository consoleRepository) {
        this.consoleRepository = consoleRepository;
    }
    public Future<List<Environment>>execute() {
        return executor.submit(consoleRepository::getEnvironment);
    }
}

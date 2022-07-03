package com.potelova.domain;

import com.potelova.data.model.Animal;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class AnimalUseCase {
    private final ConsoleRepository consoleRepository;

    private final ExecutorService executor = Executors.newSingleThreadExecutor();

    public AnimalUseCase(ConsoleRepository consoleRepository) {
        this.consoleRepository = consoleRepository;
    }
    public Future<List<Animal>>execute() {
        return executor.submit(consoleRepository::getAnimals);
    }
}

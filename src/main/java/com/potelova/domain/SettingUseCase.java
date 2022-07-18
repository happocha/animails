package com.potelova.domain;

import com.potelova.data.model.Setting;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SettingUseCase {
    private final ConsoleRepository consoleRepository;
    private final ExecutorService executor = Executors.newSingleThreadExecutor();

    public SettingUseCase(ConsoleRepository consoleRepository) {
        this.consoleRepository = consoleRepository;
    }

    public Future<Setting> execute() {
        return executor.submit(consoleRepository::getSetting);
    }

    public void shutdown() {
        if (!executor.isShutdown()) {
            executor.shutdownNow();
        }
    }
}

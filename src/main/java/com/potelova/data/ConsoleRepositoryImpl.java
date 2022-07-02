package com.potelova.data;

import com.potelova.domain.ConsoleRepository;

public class ConsoleRepositoryImpl implements ConsoleRepository {
    @Override
    public String getTestData() {
        return "say hello";
    }
}

package com.potelova.ui;

import com.potelova.data.model.Environment;
import com.potelova.ui.model.Cell;
import com.potelova.ui.model.GameMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class EnvironmentCreatorImpl implements EnvironmentCreator {

    private final ThreadLocalRandom random = ThreadLocalRandom.current();

    @Override
    public void create(GameMap gameMap, List<Environment> environments) {
        final int x = gameMap.getCells().size();
        final int y = gameMap.getCells().get(0).size();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                final Cell cell = gameMap.getCells().get(i).get(j);
                cell.getEnvironments().addAll(createItems(environments));
            }
        }
    }

    private List<Environment> createItems(final List<Environment> environments) {
        final List<Environment> items = new ArrayList<>();
        for (Environment environment : environments) {
            int randomCount = random.nextInt(0, environment.limit.maxCount);
            for (int j = 0; j < randomCount; j++) {
                items.add(new Environment(environment.name, environment.weight, environment.limit));
            }
        }
        Collections.shuffle(items);
        return items;
    }
}

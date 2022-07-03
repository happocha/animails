package com.potelova.data;

import com.potelova.data.model.Animal;
import com.potelova.data.model.Root;
import com.potelova.data.model.Setting;
import com.potelova.domain.ConsoleRepository;
import com.potelova.util.FileUtil;
import com.potelova.util.GsonUnmarshaller;

import java.io.IOException;
import java.util.List;

public class ConsoleRepositoryImpl implements ConsoleRepository {
    @Override
    public List<Animal> getAnimals() {
        try {
            final String json = FileUtil.readFileFromResources("animals.json");
            final Root root = GsonUnmarshaller.unmarshal(Root.class, json);
            return root.animals;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Setting getSetting() {
        try {
            final String json = FileUtil.readFileFromResources("settings.json");
            final Setting setting = GsonUnmarshaller.unmarshal(Setting.class, json);
            return setting;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}

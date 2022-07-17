package com.potelova.data;

import com.potelova.data.model.Environment;
import com.potelova.data.model.Root;
import com.potelova.data.model.Setting;
import com.potelova.domain.ConsoleRepository;
import com.potelova.util.FileUtil;
import com.potelova.util.GsonUnmarshaller;

import java.io.IOException;
import java.util.List;

public class ConsoleRepositoryImpl implements ConsoleRepository {

    private static final String ENVIRONMENT_JSON = "environment.json";
    private static final String SETTING_JSON = "settings.json";

    @Override
    public List<Environment> getEnvironment() {
        try {
            final String json = FileUtil.readFileFromResources(ENVIRONMENT_JSON);
            final Root root = GsonUnmarshaller.unmarshal(Root.class, json);
            return root.environments;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Setting getSetting() {
        try {
            final String json = FileUtil.readFileFromResources(SETTING_JSON);
            final Setting setting = GsonUnmarshaller.unmarshal(Setting.class, json);
            return setting;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}

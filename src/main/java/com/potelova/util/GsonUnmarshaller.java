package com.potelova.util;

import com.google.gson.Gson;

public final class GsonUnmarshaller {

    private GsonUnmarshaller() {
    }

    public static <T> T unmarshal(Class<T> clazz, String json) {
        return unmarshal(GsonUtil.getDefaultGson(), clazz, json);
    }

    public static <T> T unmarshal(Gson gson, Class<T> clazz, String json) {
        return gson.fromJson(json, clazz);
    }

}

package com.potelova.util;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public final class GsonUnmarshaller {

    private GsonUnmarshaller() {
    }

    public static <T> T unmarshal(Class<T> clazz, String json) {
        return unmarshal(GsonUtil.getDefaultGson(), clazz, json);
    }

    public static <T> T unmarshal(TypeToken<T> typeToken, String json) {
        return unmarshal(GsonUtil.getDefaultGson(), typeToken, json);
    }

    public static <T> T unmarshal(Gson gson, Class<T> clazz, String json) {
        return gson.fromJson(json, clazz);
    }

    public static <T> T unmarshal(Gson gson, TypeToken<T> typeToken, String json) {
        // From the manual: "Fairly hideous...  Unfortunately, no way to get around this in Java".
        return gson.fromJson(json, typeToken.getType());
    }
}

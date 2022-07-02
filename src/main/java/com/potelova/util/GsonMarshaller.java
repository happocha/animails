package com.potelova.util;

import com.google.gson.Gson;

public final class GsonMarshaller {

    private GsonMarshaller() {
    }

    public static String marshal(Object object) {
        return marshal(GsonUtil.getDefaultGson(), object);
    }

    public static String marshal(Gson gson, Object object) {
        return gson.toJson(object);
    }
}

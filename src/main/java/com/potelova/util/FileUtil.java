package com.potelova.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

public final class FileUtil {

    private FileUtil() {
    }

    public static String readFileFromResources(String fileName) throws IOException {
        URL resource = FileUtil.class.getClassLoader().getResource(fileName);

        if (resource == null) {
            throw new IllegalArgumentException("file is not found!");
        }

        StringBuilder fileContent = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader((resource.getFile())));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                fileContent.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return fileContent.toString();
    }
}

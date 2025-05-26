package com.javarush.task.jdk13.task53.task5307;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileManager {

    public String readFile(String filePath) throws IOException {
        // Логика чтения файла

        String readed = Files.readString(Path.of(filePath));
        return readed;
    }

    public void writeFile(String content, String filePath) throws IOException {
        // Логика записи файла
        Files.writeString(Path.of(filePath), content);
    }
}
package com.javarush.task.jdk13.task53.task5307;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

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


    public String entryFileLocation() {

        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        if (path == "") {
            return path;
        }

        try {
            String readed = Files.readString(Path.of(path));
        } catch (IOException e) {
            System.out.println("Укажи корректный путь к файлу: ");
            return entryFileLocation();
        }
        return path;
    }
}
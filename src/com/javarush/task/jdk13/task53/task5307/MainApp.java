package com.javarush.task.jdk13.task53.task5307;

import java.io.IOException;

import static javax.print.attribute.standard.MediaSizeName.D;

public class MainApp {
    public static void main(String[] args) throws IOException {
        // Логика для выбора режима работы, вызов соответствующих методов


        FileManager fm = new FileManager();

        String originalFile = fm.readFile("D:\\test\\file1.txt");

        String encryptedFile = Cipher.encrypt(originalFile, 3);

        fm.writeFile(encryptedFile, "D:\\test\\file2.txt");


        System.out.print("Original file: " + originalFile + '\n');

        System.out.print("Encrypted File: " + encryptedFile + '\n');

        System.out.print("Decrypted File: " + Cipher.decrypt(encryptedFile, 3) + '\n');





        //System.out.println(Cipher.encrypt("абв", 3));


        // Логика меню
        // 1. Шифрование
        // 2. Расшифровка с ключом
        // 3. Brute force
        // 4. Статистический анализ
        // 0. Выход

        // Пример вызова метода шифрования:
        // cipher.encrypt("input.txt", "output.txt", 3);


    }


}
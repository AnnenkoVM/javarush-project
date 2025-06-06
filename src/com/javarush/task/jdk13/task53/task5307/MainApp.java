package com.javarush.task.jdk13.task53.task5307;

import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.*;

import static com.javarush.task.jdk13.task53.task5307.Cipher.decryptByAnalyzer;

public class MainApp {
    public static void main(String[] args) throws IOException {

        while (true) {

            Scanner scanner = new Scanner(System.in);
            FileManager fileManager = new FileManager();
            Cipher cipher = new Cipher();

            System.out.println("*******************");
            System.out.println("Сделай выбор\n" +
                    "1. Шифрование\n" +
                    "2. Расшифровка с ключом\n" +
                    "3. Brute force\n" +
                    "4. Статистический анализ\n" +
                    "0. Выход");
            System.out.println("*******************");

            int choice = enterChoice(0, 4);


            switch (choice) {
                case 1 -> encryptFile(scanner, fileManager, cipher);
                case 2 -> decryptFile(scanner, fileManager, cipher);
                case 3 -> bruteForce(scanner, fileManager, cipher);
                case 4 -> statisticalAnalyzer(scanner, fileManager);
                case 0 -> System.exit(0);
            }
        }
    }


    public static void encryptFile(Scanner scanner, FileManager fileManager, Cipher cipher) throws IOException {

        System.out.println("Ты выбрал шифрование.");

        System.out.print("Укажи адрес файла для шифрования или нажми кнопку ввода: ");

        //String originalFilePath = scanner.nextLine();
        String originalFilePath = fileManager.entryFileLocation();

        if (originalFilePath == "") {
            originalFilePath = "D:\\test\\original.txt";
            System.out.println("В качестве источника будет использован файл " + originalFilePath);
            System.out.println();
        }


        System.out.print("Укажи адрес для зашифрованного файла или нажми кнопку ввода: ");
        //String filePathToEncrypt = scanner.nextLine();
        String filePathToEncrypt = fileManager.entryFileLocation();
        if (filePathToEncrypt == "") {
            filePathToEncrypt = "D:\\test\\encrypted.txt";
            System.out.println("В качестве файла назначения будет использован файл " + filePathToEncrypt);
            System.out.println();
        }

        System.out.println("Введи ключ со значением от 1 до " + Cipher.getAlphabet().length);
        int key = enterKey();

        try {
            String originalText = fileManager.readFile(originalFilePath);
            String encryptedText = cipher.encrypt(originalText, key);
            fileManager.writeFile(encryptedText, filePathToEncrypt);
        } catch (NoSuchFileException e) {
            System.err.println("Проверь наличие файла " + e.getMessage());
        }
    }


    public static void decryptFile(Scanner scanner, FileManager fileManager, Cipher cipher) throws IOException {

        System.out.println("Ты выбрал расшифроку.");

        System.out.print("Укажи адрес зашифрованного файла или нажми кнопку ввода: ");

        String encryptedFilePath = fileManager.entryFileLocation();


        if (encryptedFilePath == "") {
            encryptedFilePath = "D:\\test\\encrypted.txt";
            System.out.println("В качестве шифрованного файла будет использован файл " + encryptedFilePath);
            System.out.println();
        }


        System.out.print("Укажи адрес для сохранения резульата дешифрации или нажми кнопку ввода: ");
        String decryptedFilePath = fileManager.entryFileLocation();
        if (decryptedFilePath == "") {
            decryptedFilePath = "D:\\test\\decrypted.txt";
            System.out.println("В качестве файла с дешифрованным текстом будет использован файл " + encryptedFilePath);
            System.out.println();
        }

        System.out.println("Введи ключ с минимальным значением 1 и максимальным значением " + Cipher.getAlphabet().length);
        int key = enterKey();

        try {
            String encryptedText = fileManager.readFile(encryptedFilePath);
            String decryptedText = cipher.decrypt(encryptedText, key);
            fileManager.writeFile(decryptedText, decryptedFilePath);
        } catch (NoSuchFileException e) {
            System.err.println("Проверь наличие файла " + e.getMessage());
        }
    }


    public static void bruteForce(Scanner scanner, FileManager fileManager, Cipher cipher) throws IOException {
        System.out.println("Ты выбрал BruteForce.");
        int key = -1;
//
        System.out.print("Укажи адрес расшифрованного файла или нажми кнопку ввода: ");
        String decryptedFilePath = fileManager.entryFileLocation();

        if (decryptedFilePath == "") {
            decryptedFilePath = "D:\\test\\decrypted.txt";
            System.out.println("В качестве источника будет использован файл " + decryptedFilePath);
            System.out.println();
        }
        String originalText = fileManager.readFile(decryptedFilePath);
//
        System.out.print("Укажи адрес шифрованного файла или нажми кнопку ввода: ");
        String encryptedFilePath = fileManager.entryFileLocation();

        if (encryptedFilePath == "") {
            encryptedFilePath = "D:\\test\\encrypted.txt";
            System.out.println("В качестве файла назначения будет использован файл " + encryptedFilePath);
            System.out.println();
        }
        String encryptedText = fileManager.readFile(encryptedFilePath);
//
        for (int i = 0; i < Cipher.getAlphabet().length; i++) {

            String decryptedText = cipher.decrypt(encryptedText, i);

            if (originalText.equals(decryptedText)) {
                key = i;
                i = Cipher.getAlphabet().length;
            }
        }

        System.out.println("Ключ " + ((key != -1) ?
                "равен " + key + "\n" :
                "найти не удалось \n"));
    }


    static int enterKey() {
        Scanner sc = new Scanner(System.in);

        int key = 0;

        try {
            key = sc.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("Введенное значение не является цифрой: ");
            return enterKey();
        }


        if (key < 1 || key > Cipher.getAlphabet().length) {
            System.err.print("Введите корректный диапазон ключа: ");
            return enterKey();
        }

        return key;
    }


    static int enterChoice(int min, int max) {
        Scanner sc = new Scanner(System.in);

        int choice = -1;

        try {
            choice = sc.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("Некорректный ввод");
            return enterChoice(min, max);
        }

        if (choice < min || choice > max) {
            System.err.print("Сделайте корректный выбор ");
            return enterChoice(min, max);
        }

        return choice;
    }


    public static void statisticalAnalyzer(Scanner scanner, FileManager fileManager) throws IOException {


        System.out.print("Укажи адрес для зашифрованного файла или нажми кнопку ввода: ");
        //String encryptedFileLocation = scanner.nextLine();
        String encryptedFileLocation = fileManager.entryFileLocation();
        if (encryptedFileLocation == "") {
            encryptedFileLocation = "D:\\test\\encrypted.txt";
            System.out.println("В качестве файла назначения будет использован файл " + encryptedFileLocation);
            System.out.println();
        }

        char[] textArray = fileManager.readFile(encryptedFileLocation).toLowerCase().toCharArray();

        HashMap<Character, Integer> countByChar = new HashMap<>();

        TreeSet<Integer> top = new TreeSet<>();


        for (int v = 0; v < textArray.length; v++) {
            char c = textArray[v];
            int charCount = 1;

            if (countByChar.containsKey(c)) continue;

            for (int v1 = 0; v1 < textArray.length; v1++) {
                if (c == textArray[v1] && v != v1) {
                    countByChar.put(c, ++charCount);
                }
            }
            top.add(charCount);
        }


        ArrayList<Integer> list = new ArrayList<>(top);
        Collections.reverse(list);

        char space = getKeyByIntValue(countByChar, list.get(0));
        char o = getKeyByIntValue(countByChar, list.get(1));
        char i = getKeyByIntValue(countByChar, list.get(2));
        char e = getKeyByIntValue(countByChar, list.get(3));
        char n = getKeyByIntValue(countByChar, list.get(4));
        char t = getKeyByIntValue(countByChar, list.get(5));
        char a = getKeyByIntValue(countByChar, list.get(6));
        char s = getKeyByIntValue(countByChar, list.get(7));
        char r = getKeyByIntValue(countByChar, list.get(8));


        HashMap<Character, Character> topChar = new HashMap<>();

        topChar.put(space, ' ');
        topChar.put(o, 'О');
        topChar.put(i, 'И');
        topChar.put(e, 'Е');
        topChar.put(n, 'Н');
        topChar.put(t, 'Т');
        topChar.put(a, 'А');
        topChar.put(s, 'С');
        topChar.put(r, 'Р');


        System.out.println(decryptByAnalyzer(fileManager.readFile(encryptedFileLocation).toLowerCase(), topChar));

        while (true) {

            System.out.println("Наше сопоставление:");

            for (Character key : topChar.keySet()) {
                Character value = topChar.get(key);
                System.out.println(key + " -> " + value);
            }


            System.out.println("Будем ли делать поправку?");
            System.out.println("Нажми на 1 чтобы поправить и 0 чтобы выйти из приложения.");


            int choice = enterChoice(0, 1);

            if (choice == 1) {
                System.out.println("Какой символ меняем");
                char charToReplace = scanner.nextLine().charAt(0);
                System.out.println("На что меняем");
                char value = scanner.nextLine().charAt(0);

                if (getKeyByCharValue(topChar, charToReplace) != null ) {
                    charToReplace = getKeyByCharValue(topChar, charToReplace);
                    topChar.put(charToReplace, value);
                } else topChar.put(charToReplace, value);

            } else if (choice == 0) {
                //  System.exit(0);
                break;
            }

            System.out.println(decryptByAnalyzer(fileManager.readFile(encryptedFileLocation).toLowerCase(), topChar));

        }
    }

    public static Character getKeyByIntValue(Map<Character, Integer> map, int targetValue) {
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() != null && entry.getValue() == targetValue) {
                return entry.getKey();
            }
        }
        return null;
    }


    public static Character getKeyByCharValue(Map<Character, Character> map, char targetValue) {
        for (Map.Entry<Character, Character> entry : map.entrySet()) {
            if (entry.getValue() != null && entry.getValue() == targetValue) {
                return entry.getKey();
            }
        }
        return null;
    }

}
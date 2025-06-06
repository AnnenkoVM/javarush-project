package com.javarush.task.jdk13.task53.task5307;

import javax.crypto.spec.PSource;
import java.util.HashMap;

public class Cipher {


    //private static char[] alphabet;

    private static char[] alphabet = {
            // Русские строчные
            'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з',
            'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т',
            'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я',
            'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З',
            'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т',
            'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ъ', 'Ы', 'Ь', 'Э', 'Ю', 'Я',
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
            'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
            'u', 'v', 'w', 'x', 'y', 'z',
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
            'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
            'U', 'V', 'W', 'X', 'Y', 'Z',
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            '.', ',', '«', '»', '"', '\'', ':', '!', '?', '-','—', '(', ')', '[', ']', '{', '}', ';', '/',
            '\\', '@', '#', '$', '%', '^', '&', '*', '_', '+', '=', '<', '>', '|', '`', '~',
            ' ', '\r', '\n'
    };


    public Cipher(char[] alphabet) {
        this.alphabet = alphabet;
    }

    public Cipher() {

    }

    public static char[] getAlphabet() {
        return alphabet;
    }

    public static String encrypt(String text, int shift) {

        char[] textArray = text.toCharArray();

        int newArraySize = text.length();
        char[] newArray = new char[newArraySize];
        int indexGen = 0;

        for (int i = 0; i < textArray.length; i++) {

            for (int i1 = 0; i1 < alphabet.length; i1++) {

                if (textArray[i] == alphabet[i1]) {
                    if (i1 + shift < alphabet.length) {    // если со смещением не вышли за рамки массива
                        newArray[indexGen] = alphabet[i1 + shift];
                        indexGen++;
                    }  else  {
                        int destinationIndex = (i1 + shift) % alphabet.length; // задаем индекс равный числу которое превысило массив
                        newArray[indexGen] = alphabet[destinationIndex];
                        indexGen++;
                    }
                }
            }
        }
        return new String(newArray);
    }


    public static String decrypt(String text, int shift) {
        char[] textArray = text.toCharArray();

        int newArraySize = text.length();
        char[] newArray = new char[newArraySize];
        int indexGen = 0;

        for (int i = 0; i < textArray.length; i++) {
            for (int i1 = 0; i1 < alphabet.length; i1++) {

                if (textArray[i] == alphabet[i1]) {
                    int shiftedIndex;

                    if (i1 - shift >= 0) {     // если со смещением не в отрицательную сторону не вышли ниже нуля
                        shiftedIndex = i1 - shift;
                    } else {
                        shiftedIndex = (i1 - shift + alphabet.length) % alphabet.length;
                    }

                    newArray[indexGen] = alphabet[shiftedIndex];
                    indexGen++;
                }
            }
        }
        return new String(newArray);
    }


    public static String decryptByAnalyzer(String text, HashMap<Character, Character> map ) {

        char[] textArray = text.toCharArray();

        int newArraySize = text.length();
        char[] newArray = new char[newArraySize];

        for (int i = 0; i < textArray.length; i++) {

                if (map.containsKey(textArray[i])) {
                    newArray[i] = map.get(textArray[i]);
                } else newArray[i] = textArray[i];

        }
        return new String(newArray);
    }


}
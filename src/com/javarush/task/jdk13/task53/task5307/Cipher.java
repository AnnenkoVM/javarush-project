package com.javarush.task.jdk13.task53.task5307;

import javax.crypto.spec.PSource;

public class Cipher {


    //private static char[] alphabet;


    private static char[] alphabet = {'а', 'б', 'в', 'г', 'д', 'е', 'ж', 'з',
            'и', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ',
            'ъ', 'ы', 'ь', 'э', 'я', '.', ',', '«', '»', '"', '\'', ':', '!', '?', ' ','\r', '\n'};



    public Cipher(char[] alphabet) {
        this.alphabet = alphabet;
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
}

package com.javarush.task.pro.task09.task0913;

/* 
Поиск в строке
*/

public class Solution {
    public static void main(String[] args) {
        String string = "Чтобы стать программистом, нужно писать код. Чтобы писать код, нужно учиться. Чтобы учиться, нужно желание.";
        String word = "код";
        int indexFromFirstWord = getIndexFromFirstWord(string, word);
        int indexFromLastWord = getIndexFromLastWord(string, word);
        System.out.println("Индекс первого символа первого слова \"" + word + "\" равен - " + indexFromFirstWord);
        System.out.println("Индекс первого символа последнего слова \"" + word + "\" равен - " + indexFromLastWord);




//        System.out.println(Long.MIN_VALUE);
//        System.out.println(Long.MAX_VALUE);
//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(Integer.MAX_VALUE);


    }

    public static int getIndexFromFirstWord(String string, String word) {

        if (string.indexOf(word)>-1) {
            return string.indexOf(word);
        }

        return 0;
    }

    public static int getIndexFromLastWord(String string, String word) {
        if (string.lastIndexOf(word)>-1) {
            return string.lastIndexOf(word);
        }
        return 0;
    }
}

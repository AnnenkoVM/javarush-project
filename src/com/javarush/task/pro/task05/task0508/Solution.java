package com.javarush.task.pro.task05.task0508;

import java.util.Scanner;

/* 
Удаляем одинаковые строки
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        strings = new String[6];

        for (int i = 0; i < strings.length; i++) {
            strings[i] = sc.nextLine();
        }


        for (String string1 : strings) {
            int count = 0; // в каждой итерации обнуляем значение count

            for (int i = 0; i < strings.length; i++) {
                if (strings[i] == null) continue;  // null нас не интересует,
                                                   // переходим на следующую итерацию

                if (strings[i].equals(string1)) {
                    count++; // подсчитываем сколько раз переменная string1 повторялась в массие strings

                    if (count > 1) { // только если переменная string1 повторилась более раза заходим в цикл ниже
                        for (int i1 = 0; i1 < strings.length; i1++) {
                            if (strings[i1] == null) continue; // null нас не интересует

                            if (strings[i1].equals(string1)) {
                                strings[i1] = null;   //задаем null для переменной string1 которая повторялась
                            }
                        }
                    }
                }
            }
        }

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
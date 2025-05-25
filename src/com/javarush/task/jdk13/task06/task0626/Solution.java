package com.javarush.task.jdk13.task06.task0626;

import java.util.Arrays;
import java.util.Scanner;

/* 
Первая база данных
*/

public class Solution {
    public static String[][] array = new String[][]{{"123", "Иванов", "Богдан"},
            {"1425", "Петрова", "Марина"},
            {"37", "Богдан", "Андрей"},
            {"98", "Богданова", "Марина"},
            {"6285", "Прутко", "Сергей"},
            {"8", "Клочкова", "Елена"},
            {"754", "Котов", "Иван"}};

    public static void main(String[] args) {



        //System.out.println("Ввод:");
        Scanner sc = new Scanner(System.in);

        String data = sc.nextLine();

        studentFinder(data);

      //System.out.println(array[2][1]);
      //System.out.println(Arrays.deepToString(array));
    }

    static void studentFinder(String value) {

        //System.out.println("Вывод:");
        for (int i = 0; i < array.length; i++) {
            for (int i1 = 0; i1 < array[i].length; i1++) {

                if (array[i][i1].equals(value)) {

                    System.out.println(array[i][0] + " " + array[i][1] + " " + array[i][2]);
                }
            }
        }
    }
}

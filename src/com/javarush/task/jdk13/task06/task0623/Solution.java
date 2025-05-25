package com.javarush.task.jdk13.task06.task0623;

/* 
Знакомство с двумерным массивом
*/

import java.util.Arrays;

public class Solution {
    public static int[][] array;//напишите тут ваш код

    public static void main(String[] args) {
        array = new int[2][3];
        int n = 2;

        for (int i1 = 0; i1 < array.length; i1++) {
            for (int i2 = 0; i2 < array[i1].length; i2++) {
                array[i1][i2] = n;
                n += 2;
            }
        }

        for (int i1 = 0; i1 < array.length; i1++) {
            for (int i2 = 0; i2 < array[i1].length; i2++) {
                System.out.println(array[i1][i2]);
            }
        }

    }
}
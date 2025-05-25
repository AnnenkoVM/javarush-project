package com.javarush.task.jdk13.task06.task0632;

import java.util.Arrays;
import java.util.Scanner;

/* 
Пирамида
*/

public class Solution {
    public static char[][] array;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();

        array = new char[height][height * 2 - 1];

        for (int i1 = 0; i1 < array.length; i1++) {
            for (int i2 = 0; i2 < array[i1].length; i2++) {
                array[i1][i2] = ' ';
            }
        }

        for (int i1 = 0; i1 < array.length; i1++) {
            for (int i2 = height - i1 - 1; i2 < height + i1; i2++) {
                array[i1][i2] = '#';
            }
        }

        for (int i1 = 0; i1 < array.length; i1++) {
            for (int i2 = 0; i2 < array[i1].length; i2++) {
                System.out.print(array[i1][i2]);
            }
            System.out.println();
        }
    }
}
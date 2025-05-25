package com.javarush.task.jdk13.task06.task0627;

import java.util.Arrays;
import java.util.Scanner;

/* 
Вот это переворот!
*/

public class Solution {
    public static int[][] array = new int[3][3];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tmp;
        int length = array.length;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < length; i++) {

            for (int j = i ; j < length; j++) {
                tmp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = tmp;
            }
        }

        for (int i1 = 0; i1 < length; i1++) {
            for (int i2 = 0; i2 < length; i2++) {
                System.out.print(array[i1][i2] + " ");
            }
            System.out.println();
        }
    }
}
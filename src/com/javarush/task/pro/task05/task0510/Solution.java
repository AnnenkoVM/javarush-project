package com.javarush.task.pro.task05.task0510;

/* 
Треугольный массив
*/

import java.util.Arrays;

public class Solution {

    public static int[][] result = new int[10][];

    public static void main(String[] args) {
        result[0] = new int[1];
        result[1] = new int[2];
        result[2] = new int[3];
        result[3] = new int[4];
        result[4] = new int[5];
        result[5] = new int[6];
        result[6] = new int[7];
        result[7] = new int[8];
        result[8] = new int[9];
        result[9] = new int[10];

        for (int i1 = 0; i1 < result.length; i1++) {
            for (int i2 = 0; i2 < result[i1].length; i2++) {
                result[i1][i2] = i1 + i2;
            }
        }

        for (int i1 = 0; i1 < result.length; i1++) {
            for (int i2 = 0; i2 < result[i1].length; i2++) {
                System.out.print(result[i1][i2]+" ");
            }
            System.out.println();
        }
    }
}
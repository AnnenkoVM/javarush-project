package com.javarush.task.jdk13.task06.task0625;

import java.util.Scanner;

/* 
Минимальная сумма
*/

public class Solution {
    public static int[][] array = new int[3][3];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int minSum = Integer.MAX_VALUE;

        for (int i1 = 0; i1 < array.length; i1++) {
            for (int i2 = 0; i2 < array[i1].length; i2++) {
                array[i1][i2] = sc.nextInt();
            }
        }


        for (int i1 = 0; i1 < array.length; i1++) {
            int sum = 0;
            for (int i2 = 0; i2 < array[i1].length; i2++) {
                sum += array[i1][i2];
            }
            if (minSum > sum) {
                minSum = sum;
            }
        }


        for (int i1 = 0; i1 < 3; i1++) {
            int sum = 0;
            for (int i2 = 0; i2 < array.length; i2++) {
                sum += array[i2][i1];
            }
            if (minSum > sum) {
                minSum = sum;
            }
        }
        System.out.println(minSum);
    }
}
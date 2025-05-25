package com.javarush.task.pro.task05.task0511;

import java.util.Arrays;
import java.util.Scanner;

/* 
Создаем двумерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        multiArray = new int[m1][];


        for (int i = 0; i < multiArray.length; i++) {
            int m2 = sc.nextInt();
            multiArray[i] = new int[m2];
        }

        System.out.println(Arrays.deepToString(multiArray));
    }
}

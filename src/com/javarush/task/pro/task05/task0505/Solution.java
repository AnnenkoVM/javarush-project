package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] array = new int[N];


        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        if (N % 2 == 0) {
            for (int i = array.length - 1; i >= 0; i--) {
                System.out.println(array[i]);
            }
        }

        if (N % 2 != 0) {

            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }
    }
}
package com.javarush.task.pro.task04.task0405;

/* 
Незаполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {

        int l = 0;

        while (!(l == 10)) {

            l++;
            int r = 0;

            while (!(r == 20)) {

                r++;

                if (l == 1 || l == 10) {
                    System.out.print("Б");
                } else if (r == 1 || r == 20) {
                    System.out.print("Б");
                } else {
                    System.out.print(" ");
                    ;
                }
            }
            System.out.println();
        }
    }
}
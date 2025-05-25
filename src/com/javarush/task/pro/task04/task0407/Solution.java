package com.javarush.task.pro.task04.task0407;

/* 
Сумма чисел, не кратных 3
*/

public class Solution {
    public static void main(String[] args) {
        int sum = 0;
        int n = 0;

        while (!(n == 100)) {

            n++;

            if ((n % 3) == 0) {
                continue;
            }
            sum += n;

        }
        System.out.println(sum);
    }
}
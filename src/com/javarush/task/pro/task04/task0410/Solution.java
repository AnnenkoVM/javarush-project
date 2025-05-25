package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;


        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {

            int num = sc.nextInt();

            if (firstMin > num) {
                secondMin = firstMin;
                firstMin = num;

            } else if (secondMin > num && num != firstMin) {
                secondMin = num;
            }
        }

        System.out.println(secondMin);
    }
}
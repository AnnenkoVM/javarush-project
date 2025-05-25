package com.javarush.task.pro.task04.task0409;

import java.util.Scanner;

/* 
Минимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int min = Integer.MAX_VALUE;

        while (sc.hasNextInt()){
            int num = sc.nextInt();

            if (min > num){
                min = num;
            }

        }

        System.out.println(min);


    }
}
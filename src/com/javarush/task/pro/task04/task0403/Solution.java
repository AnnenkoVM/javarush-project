package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        boolean result = false;
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (!result) {

            String string = sc.next();
            result = string.equals("ENTER");

            if (!result) {
                sum = sum + Integer.parseInt(string);
            } else {
                System.out.println(sum);
            }
        }
    }
}
package com.javarush.task.pro.task04.task0401;

/* 
Я никогда не буду работать за копейки
*/

public class Solution {
    public static void main(String[] args) {
        String quote = "Я никогда не буду работать за копейки. Амиго";
        boolean result = false;
        int n = 1;
        while (!result) {
            System.out.println(quote);

            result = (n == 100);
            n++;
        }

    }
}
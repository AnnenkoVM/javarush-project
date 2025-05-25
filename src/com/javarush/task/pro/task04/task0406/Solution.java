package com.javarush.task.pro.task04.task0406;

import java.util.Scanner;

/* 
Показываем, что получаем
*/

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String check = sc.next();
            if (!check.equals("enough")) {
                System.out.println(check);
            } else {
                break;
            }
        }
    }
}
package com.javarush.task.pro.task04.task0414;

import java.util.Scanner;

/* 
Хорошего не бывает много
*/

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String string = sc.next();
        int number = sc.nextInt();


        do {
            System.out.println(string);
            number--;
        } while (number > 0 && number < 4);
    }
}
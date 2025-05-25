package com.javarush.task.pro.task09.task0905;

import java.util.regex.Pattern;

/* 
Восьмеричный конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = 21;
        System.out.println("Десятичное число " + decimalNumber + " равно восьмеричному числу " + toOctal(decimalNumber));
        int octalNumber = 25;
        System.out.println("Восьмеричное число " + octalNumber + " равно десятичному числу " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber) {

        int octal = 0;
        int i = 0;

        while (decimalNumber > 0) {
            int remainder = decimalNumber % 8;
            octal += remainder * Math.pow(10, i);
            decimalNumber = decimalNumber / 8;
            i++;
        }

        if (octal != 0) {
            return octal;
        }

        return 0;
    }

    public static int toDecimal(int octalNumber) {

        int decimal = 0;
        int i = 0;

        while (octalNumber > 0) {
            int remainder = octalNumber % 10;
            decimal += remainder * Math.pow(8, i);
            octalNumber = octalNumber / 10;
            i++;
        }

        if (decimal!=0) {
            return decimal;
        }
        return 0;
    }
}
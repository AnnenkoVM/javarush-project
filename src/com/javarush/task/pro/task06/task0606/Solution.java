package com.javarush.task.pro.task06.task0606;

/* 
Универсальный солдат
*/

public class Solution {

    public static void main(String[] args) {



    }

    public static void universalMethod(int age) {
        System.out.println(age);
    }

    public static void universalMethod(int num1, int num2) {
        int sum = num1 + num2;

        System.out.println("num1+num2=" + sum);
    }


    public static void universalMethod(int count, String world) {
        for (int i = 0; i < count; i++) {
            System.out.println(world);
        }

    }

    public static void universalMethod(String world, int count) {

        for (int i = 0; i < count; i++) {
            System.out.println(world);
        }
    }

    public static int universalMethod(int a, int b, int c) {

        return a + b + c;

    }

    public static void universalMethod(String word1) {
    }

    public static void universalMethod(String word1,String word2) {
    }

    public static void universalMethod(String word1,String word2,String word3) {
    }

    public static void universalMethod(String word1,String word2,String word3, String word4) {
    }

    public static void universalMethod(String word1,String word2,String word3, String word4,String word5) {
    }



}

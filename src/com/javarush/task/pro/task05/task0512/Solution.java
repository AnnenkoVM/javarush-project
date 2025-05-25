package com.javarush.task.pro.task05.task0512;

/* 
Создаем мультимассив
*/

public class Solution {

    public static int[][][] multiArray = new int[][][]{{{4, 8, 15}, {16}}, {{23, 42}, {}}, {{1}, {2}, {3}, {4, 5}}};

    public static void main(String[] args) {

        for (int i1 = 0; i1 < multiArray.length; i1++) {
            for (int i2 = 0; i2 < multiArray[i1].length; i2++) {
                for (int i3 = 0; i3 < multiArray[i1][i2].length; i3++) {
                    System.out.println(multiArray[i1][i2][i3]);
                }
            }
        }
    }
}
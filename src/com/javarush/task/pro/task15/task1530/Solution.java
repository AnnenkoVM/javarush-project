package com.javarush.task.pro.task15.task1530;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* 
Байты в символы
*/

public class Solution {

    public static void main(String[] args) {
        ByteArrayInputStream stream = new ByteArrayInputStream("O sole, o sole mio!\nSta 'nfronte a te!\n Sta 'nfronte a te!".getBytes(StandardCharsets.UTF_8));
        System.out.println(new String(bytesToChars(stream, 38)));
    }


    public static char[] bytesToChars(ByteArrayInputStream stream, int n) {

        byte[] oldArr = new byte[n];
        int read = stream.read(oldArr, 0, n);

        if (read == -1) {
            return new char[0];
        }

        char[] newArr = new char[read];
        for (int i = 0; i < read; i++) {
            newArr[i] = (char) oldArr[i];
        }

        return newArr;

    }

}

package com.javarush.task.pro.task15.task1524;

import java.io.*;
import java.util.Scanner;

/* 
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String file1Path = sc.nextLine();
        String file2Path = sc.nextLine();

        try (

                FileInputStream fileInputStream = new FileInputStream(file1Path);
        ) {

            byte[] bytes = fileInputStream.readAllBytes();

            for (int i = 0; i < bytes.length-1; i+=2) {
                byte tmp = bytes[i];
                bytes[i] = bytes[i+1];
                bytes[i+1]= tmp;
            }


            FileOutputStream fileOutputStream = new FileOutputStream(file2Path);
            fileOutputStream.write(bytes);
            fileOutputStream.close();



        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
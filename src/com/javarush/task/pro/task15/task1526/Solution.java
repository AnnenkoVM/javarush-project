package com.javarush.task.pro.task15.task1526;

import java.io.*;
import java.util.Scanner;

/* 
Фейсконтроль
*/

public class Solution {
    public static void main(String[] args) {

        try (
                Scanner scanner = new Scanner(System.in);
                FileReader reader = new FileReader(scanner.nextLine());
        ) {
            while (reader.ready()) {

                char c = (char)reader.read();

                if (c != '.' && c != ' ' && c != ',') {
                    System.out.print(c);
                }


            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
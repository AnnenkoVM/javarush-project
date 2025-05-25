package com.javarush.task.pro.task15.task1527;

import java.io.*;
import java.util.Scanner;

/* 
 Пропускаем не всех
*/

public class Solution {
    public static void main(String[] args) {

        try (Scanner cs = new Scanner(System.in);
             FileReader reader = new FileReader(cs.nextLine());
             BufferedReader bufferedReader = new BufferedReader(reader);
        ) {

            String line;
            boolean print = true;

            while ((line = bufferedReader.readLine()) != null) {
                if (print) {
                    System.out.println(line);
                }
                print = !print;
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
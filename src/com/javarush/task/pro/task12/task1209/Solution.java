package com.javarush.task.pro.task12.task1209;

import java.util.ArrayList;
import java.util.Arrays;

/* 
Бухгалтерия
*/

public class Solution {
    public static ArrayList<String> waitingEmployees = new ArrayList<>();
    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();

    public static void initEmployees() {
        waitingEmployees.add("Гвинно");
        waitingEmployees.add("Гунигерд");
        waitingEmployees.add("Боргелейф");
        waitingEmployees.add("Нифрод");
        waitingEmployees.add("Альбиуф");
        waitingEmployees.add("Иногрим");
        waitingEmployees.add("Фриле");
    }

    public static void main(String[] args) {
        initEmployees();

        System.out.println(waitingEmployees);
        System.out.println(alreadyGotSalaryEmployees);
        paySalary("Фриле");

        System.out.println(waitingEmployees);
        System.out.println(alreadyGotSalaryEmployees);

    }

    public static void paySalary(String name) {
        if (waitingEmployees.contains(name)) {

            for (int w = 0; w < waitingEmployees.size(); w++) {

                if (waitingEmployees.get(w) == name) {
                    alreadyGotSalaryEmployees.add(name);

                    for (int i = 0; i < waitingEmployees.size(); i++) {
                        if (waitingEmployees.get(i) == name) {
                            waitingEmployees.set(i, null);
                        }
                    }

                }
            }

        }
    }
}

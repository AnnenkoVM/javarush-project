package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("St1", 3.5);
        grades.put("St2", 4.5);
        grades.put("St3", 3.0);
        grades.put("St4", 5.0);
        grades.put("St5", 4.7);
    }
}

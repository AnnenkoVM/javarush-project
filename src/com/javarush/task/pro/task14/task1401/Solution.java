package com.javarush.task.pro.task14.task1401;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Поработай обработчиком
*/

public class Solution {

    public static final String INPUT_NAME = "\nВведите имя: ";
    public static final String INPUT_AGE = "Введите возраст пользователя '%s': ";

    public static final String CANNOT_BE_NULL = "Имя не может быть null.";
    public static final String CANNOT_BE_EMPTY = "Имя не может быть пустым.";
    public static final String CANNOT_CONTAIN_DIGIT = "Имя не может содержать цифры.";
    public static final String CANNOT_BE_NEGATIVE = "Возраст не может быть меньше 0.";
    public static final String CANNOT_BE_TOO_BIG = "Возраст не может быть больше 150.";
    public static final String UNKNOWN_ERROR = "Неизвестная ошибка.";

    public static final String FOUND = "\nПользователь '%s' найден под индексом %d.\n";
    public static final String NOT_FOUND = "\nПользователь '%s' не найден.\n";

    static List<User> users = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            addUser(new User());
        }

        User userToSearch = new User();
        userToSearch.setName("Рафаэль");

        findUserIndex(userToSearch);
    }

    static void addUser(User user) {
        System.out.print(INPUT_NAME);
        String name = scanner.nextLine();

        System.out.printf(INPUT_AGE, name);
        int age = Integer.parseInt(scanner.nextLine());

        switch (user.setName(name)){
            case -1: System.out.println("Имя не может быть null."); break;
            case -2: System.out.println("Имя не может быть пустым."); break;
            case -3: System.out.println("Имя не может содержать цифры."); break;
            case 0 : break;
            default: System.out.println("Неизвестная ошибка.");
        }

        switch (user.setAge(age)){
            case -1: System.out.println("Возраст не может быть меньше 0."); break;
            case -2: System.out.println("Возраст не может быть больше 150."); break;
            case 0 : break;
            default: System.out.println("Неизвестная ошибка.");
        }


        user.setName(name);

        user.setAge(age);

        users.add(user);
    }

    static void findUserIndex(User user) {

        if (users.indexOf(user)==-1) {
            System.out.println("Пользователь '" + user.getName() + "' не найден.");
        } else
           System.out.printf(FOUND, user.getName(), users.indexOf(user));
    }
}

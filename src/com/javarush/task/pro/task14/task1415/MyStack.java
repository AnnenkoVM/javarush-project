package com.javarush.task.pro.task14.task1415;

import java.util.LinkedList;
import java.util.List;

/* 
Стек в домашних условиях
*/

public class MyStack {

    private final List<String> storage = new LinkedList<>();

    public void push(String s) {

        storage.add(0, s);
    }

    public String pop() {

        String tmp = storage.get(0);
        storage.remove(0);
        return tmp;


    }

    public String peek() {
        return storage.get(0);

    }

    public boolean empty() {
        return (storage.size() > 0 ? false : true);

    }

    public int search(String s) {

        for (int i = 0; i < storage.size(); i++) {
            if (storage.get(i).equals(s)) {
                return i;
            }
        }
        return -1;
    }
}

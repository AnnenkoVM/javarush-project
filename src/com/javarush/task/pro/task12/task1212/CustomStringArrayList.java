package com.javarush.task.pro.task12.task1212;

/* 
Создаем свой список
*/

import java.util.Arrays;

public class CustomStringArrayList {

    private int size;
    private int capacity;
    private String[] elements;

    public CustomStringArrayList() {
        capacity = 10;
        size = 0;
        elements = new String[capacity];
    }

    public void add(String element) {
        if (size == capacity) {
            grow();
        }
        elements[size] = element;
        size++;
    }

    private void grow() {

        int capacityNew = (int) (capacity * 1.5);
        String[] elementsNew = new String[capacityNew];

        for (int i = 0; i < elements.length; i++) {
            elementsNew[i] = elements[i];
        }

        elements = elementsNew;

        capacity = capacityNew;

    }

    @Override
    public String toString() {
        return "CustomStringArrayList{" +
                "size=" + size +
                ", capacity=" + capacity +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }
}

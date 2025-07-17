package org.example.task2;

import com.sun.tools.javac.Main;

public class Task2 {
    public static void main(String[] args) {
        String row = "Hello";
        row = row.toLowerCase();
        for (int i = 0; i < row.length(); i++) {
            char c = row.charAt(i);
            for (int j = i + 1; j < row.length(); j++) {
                if (c == row.charAt(j)) {
                    System.out.println("Повторяющийся символ: " + c);
                    return;
                }
            }
        }
        System.out.println("Повторяющихся символов нет");
    }
    }


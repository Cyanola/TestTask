package org.example.task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BaseConverter converter = new BaseConverter();
        System.out.print("Введите температуру в градусах Цельсия: ");
        double celsius = scanner.nextDouble();
        System.out.print("Во что конвертировать? (K - Кельвины, F - Фаренгейты): ");
        String choice = scanner.next();
        double result = converter.convert(celsius, choice);
        System.out.println("Результат: " + result);
    }
}

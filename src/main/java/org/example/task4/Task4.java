package org.example.task4;

import java.util.Scanner;

public class Task4 {
    public static double getAngle(int hours, int minutes) {
        hours = hours % 12;
        double hourAngle = hours * 30 + minutes * 0.5;
        double minuteAngle = minutes * 6;
        double angle = Math.abs(hourAngle - minuteAngle);
        return Math.min(angle, 360 - angle);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = -1;
        int minutes = -1;
        while (true) {
            System.out.print("Введите часы (0–23): ");
            if (scanner.hasNextInt()) {
                hours = scanner.nextInt();
                if (hours >= 0 && hours <= 23) break;
            } else {
                scanner.next();
            }
            System.out.println("Неверный ввод. Попробуйте снова.");
        }
        while (true) {
            System.out.print("Введите минуты (0–59): ");
            if (scanner.hasNextInt()) {
                minutes = scanner.nextInt();
                if (minutes >= 0 && minutes <= 59) break;
            } else {
                scanner.next();
            }
            System.out.println("Неверный ввод. Попробуйте снова.");
        }
        double angle = getAngle(hours, minutes);
        System.out.println("Угол: " + angle + "°");
    }
}

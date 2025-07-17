package org.example.task3;

public class BaseConverter {

    public double convert(double celsius, String target) {
        if (target.equalsIgnoreCase("K")) {
            return celsius + 273.15;
        } else if (target.equalsIgnoreCase("F")) {
            return celsius * 9 / 5 + 32;
        } else {
            System.out.println("Неизвестная единица конвертации.");
            return celsius;
        }
    }
}

package org.example;

public class CircleCalculator {
    public static double calculateArea(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Радиус не может быть отрицательным");
        }
        return Math.PI * radius * radius;
    }
}
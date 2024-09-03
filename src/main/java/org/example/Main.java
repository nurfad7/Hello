package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        //#1
        int rectangleLength = 5;
        int rectangleWidth = 3;
        System.out.println(
                "Area for Rectangle with length = 5"
                        + " and width = 3"
                        + " is "
                        + findRectangleArea(rectangleLength, rectangleWidth)
        );
        //#2
        int circleRadius = 5;
        findDiameterCircumferenceAreaOfCircle(circleRadius);
        //#3
        int firstAngle = 80;
        int secondAngle = 65;
        findTheThirdAngleOfTriangle(firstAngle, secondAngle);
        //#4
        String firstDate = "2024-03-19";
        String secondDate = "2024-03-21";

        LocalDate startDate = LocalDate.parse(firstDate);
        LocalDate endDate = LocalDate.parse(secondDate);

        long dateDifference = ChronoUnit.DAYS.between(startDate, endDate);

        System.out.println("Difference between date = " + dateDifference);
        //#5
        String myName = "Nurul Fadilah";
        writeInitial(myName);
    }

    static int findRectangleArea(
            int rectangleLength,
            int rectangleWidth) {
        return rectangleWidth * rectangleLength;
    }

    static void findDiameterCircumferenceAreaOfCircle(int circleRadius) {
        System.out.println("The Circle with radius = " + circleRadius + " have:");
        int diameterCircle = circleRadius * 2;
        System.out.println("Diameter = " + diameterCircle);
        double circumferenceCircle = 2 * Math.PI * circleRadius;
        System.out.println("Circumference = " + String.format("%.4f", circumferenceCircle));
        double areaCircle = Math.PI * Math.pow(circleRadius, 2);
        System.out.println("Area = " + String.format("%.3f", areaCircle));
    }

    static void findTheThirdAngleOfTriangle(
            int firstAngle,
            int secondAngle) {
        int thirdAngle = 180 - (firstAngle + secondAngle);
        String outputString = "The third angle if first angle = " + firstAngle
                + " and second angle = " + secondAngle
                + " is " + thirdAngle;
        System.out.println(outputString);
    }

    static void writeInitial(String myName) {
        String[] nameParts = myName.trim().split("\\s+");
        StringBuilder initials = new StringBuilder();

        for (String part : nameParts) {
            if (!part.isEmpty()) {
                initials.append(part.charAt(0));
            }
        }
        System.out.println(initials.toString().toUpperCase());
    }
}
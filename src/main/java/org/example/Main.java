package org.example;

import org.example.second.Physics;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        //day 1 #1
        int rectangleLength = 5;
        int rectangleWidth = 3;
        System.out.println(
                "Area for Rectangle with length = 5"
                        + " and width = 3"
                        + " is "
                        + findRectangleArea(rectangleLength, rectangleWidth)
        );
        //day 1 #2
        int circleRadius = 5;
        findDiameterCircumferenceAreaOfCircle(circleRadius);
        //day 1 #3
        int firstAngle = 80;
        int secondAngle = 65;
        findTheThirdAngleOfTriangle(firstAngle, secondAngle);
        //day 1 #4
        String firstDate = "2024-03-19";
        String secondDate = "2024-03-21";

        LocalDate startDate = LocalDate.parse(firstDate);
        LocalDate endDate = LocalDate.parse(secondDate);

        long dateDifference = ChronoUnit.DAYS.between(startDate, endDate);

        System.out.println("Difference between date = " + dateDifference);
        //day 1 #5
        String myName = "Nurul Fadilah";
        writeInitial(myName);
        //day2 #1
        Physics physicsFormula = new Physics();
        float inFahrenheit = 132;
        physicsFormula.inputFahrenheit(inFahrenheit);
        float inCelcius = physicsFormula.getCelcius();
        System.out.println("Celcius = " + inCelcius);
        //day2 #2
        physicsFormula.inputCentimeter(1000);
        float inKilometer = physicsFormula.getKilometer();
        System.out.println(1000 + "cm = " + inKilometer + " km");
        //day2 #3
        int aNumber = 231;
        boolean isOdd = aNumber % 2 == 1;
        System.out.println(aNumber + " is Odd = " + isOdd);
        //day2 #4
        String stringToSearch = "Hello World";
        System.out.println(stringToSearch.replaceAll("ell",""));
        //day2 #5
        String aString = "madam";
        StringBuilder reversedString = new StringBuilder(aString).reverse();
        boolean isPalindrome = aString.equals(reversedString.toString());
        System.out.println(reversedString + " is " + (isPalindrome ? "Palindrome" : "not Palindrome"));
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
package com.practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int noOfTestcases = scanner.nextInt();

        noOfTestcases = Math.min(noOfTestcases, 200);

        for (int tcCount = 0; tcCount < noOfTestcases; tcCount++) {
            int radius = scanner.nextInt();
            int numberOfPeople = scanner.nextInt();
            int angleDegree = scanner.nextInt();
            int angleMinutes = scanner.nextInt();
            int angleSeconds = scanner.nextInt();

            MaxSliceCalculator maxSliceCalculator = new MaxSliceCalculator();

            maxSliceCalculator.printMaxPossibleSliceArea(radius, numberOfPeople, angleDegree, angleMinutes, angleSeconds);
        }
    }
}
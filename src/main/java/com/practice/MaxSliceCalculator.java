package com.practice;

import java.util.Collections;
import java.util.PriorityQueue;

public class MaxSliceCalculator {
    public void printMaxPossibleSliceArea(int radius, int numberOfPeople, int angleDegree, int angleMinutes, int angleSeconds) {

        int completeCircle = 360 * 60 * 60;
        int angleToCut = (angleDegree * 3600) + (angleMinutes * 60) + (angleSeconds);

        PriorityQueue<Integer> pizzaSlices = new PriorityQueue<>(Collections.reverseOrder());

        pizzaSlices.add(completeCircle);

        int currentAngleToCut = angleToCut;

        while (!pizzaSlices.isEmpty() && pizzaSlices.size() != numberOfPeople && currentAngleToCut != 0) {
            int currentBiggestSlice = pizzaSlices.poll();
            int remainingSlice = currentBiggestSlice - currentAngleToCut;
            pizzaSlices.add(remainingSlice);
            pizzaSlices.add(currentAngleToCut);
            if (remainingSlice <= currentAngleToCut) {
                currentAngleToCut = remainingSlice;
            }
        }

        int angleForBiggestSlice = pizzaSlices.isEmpty() ? 0 : pizzaSlices.poll();
        double biggestSliceArea = ((double) angleForBiggestSlice / completeCircle) * Math.PI * radius * radius;

        System.out.printf("%.6f%n", biggestSliceArea);

    }
}


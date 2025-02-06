package com.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxSliceCalculatorTest {
    @Test
    public void testBiggestSliceAreaCalculator() {

        double delta = 0.0001; // margin of tolerance
        MaxSliceCalculator maxSliceCalculator = new MaxSliceCalculator();

        double biggestSliceArea = maxSliceCalculator.getMaxPossibleSliceArea(20, 6, 60, 0, 0);
        assertEquals(209.439510, biggestSliceArea, delta);

        biggestSliceArea = maxSliceCalculator.getMaxPossibleSliceArea(20, 6, 59, 59, 59);
        assertEquals(209.444358, biggestSliceArea, delta);

        biggestSliceArea = maxSliceCalculator.getMaxPossibleSliceArea(30, 20, 33, 30, 0);
        assertEquals(263.108385, biggestSliceArea, delta);

        biggestSliceArea = maxSliceCalculator.getMaxPossibleSliceArea(40, 200, 120, 0, 0);
        assertEquals(1675.516082, biggestSliceArea, delta);
    }
}

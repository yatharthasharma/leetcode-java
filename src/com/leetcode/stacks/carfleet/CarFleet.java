package com.leetcode.stacks.carfleet;

import java.util.Arrays;

public class CarFleet {

    private static double time(int[] positionAndSpeed, int target) {
        return (double) (target - positionAndSpeed[0]) / positionAndSpeed[1];
    }

    public static int carFleet(int target, int[] position, int[] speed) {
        int[][] positionAndSpeed = new int[position.length][2];
        for (int i = 0; i < speed.length; i++) {
            positionAndSpeed[i] = new int[]{position[i], speed[i]};
        }
        Arrays.sort(positionAndSpeed, (o1, o2) -> o2[0] - o1[0]);
        int fleets = 1;
        double previousTimeTaken = time(positionAndSpeed[0], target);
        for (int i = 1; i < positionAndSpeed.length; i++) {
            if (time(positionAndSpeed[i], target) > previousTimeTaken) {
                fleets++;
                previousTimeTaken = time(positionAndSpeed[i], target);
            }
        }
        return fleets;
    }

    public static void main(String[] args) {
        System.out.println(carFleet(12, new int[]{10, 8, 0, 5, 3}, new int[]{2, 4, 1, 1, 3}));
    }
}

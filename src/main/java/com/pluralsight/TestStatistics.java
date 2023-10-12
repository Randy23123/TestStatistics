package com.pluralsight;

import java.util.Arrays;

public class TestStatistics {
    public static void main(String[] args) {
        int total = 0;
        int[] numbs = {75, 29, 65, 20, 38, 12, 47, 86};
        Arrays.sort(numbs);
        System.out.println(numbs);

        for(int i = 0; i < numbs.length; i++){
            System.out.println(numbs[i] + " ");
            total += numbs[i];
        }
        System.out.println(total);
        int average = total / numbs.length;
        System.out.println("Average is : " + average);
        int highScore = numbs[numbs.length - 1];
        System.out.println("Highest number: " + highScore);
        int lowestScore = numbs[0];
        System.out.println("Lowest number: " + lowestScore);
    }
}

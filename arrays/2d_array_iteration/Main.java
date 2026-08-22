package com.example;

public class Main {
    public static double[] calculateDailyAverages(int[][] temperatures) {
        int days = temperatures[0].length;
        int stations = temperatures.length;
        double[] dailyAverages = new double[days];

        // iterate over each day (column)
        for (int j = 0; j < days; j++) {
            int totalTemp = 0;
            // sum temperatures from all stations for day j
            for (int i = 0; i < stations; i++) {
                totalTemp += temperatures[i][j];
            }
            dailyAverages[j] = totalTemp / (double) stations;
        }

        return dailyAverages;
    }

    public static void main(String[] args) {
        int[][] temperatures = {
            {20, 22, 24, 19, 21, 23, 25},
            {18, 20, 22, 19, 20, 22, 24},
            {21, 23, 25, 22, 24, 26, 28},
            {19, 21, 23, 20, 22, 24, 26}
        };

        double[] averages = calculateDailyAverages(temperatures);
        for (int day = 0; day < averages.length; day++) {
            System.out.println("Average temperature on day " + (day + 1) + ": " + averages[day]);
        }
    }
}
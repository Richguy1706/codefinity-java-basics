package com.example;

public class Main {
    public static int sumNotDivisibleBy3Or5(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 != 0 && i % 5 != 0) {
                sum += i ;
            }
        }
        return sum;
    }
  
    public static void main(String[] args) {
        int n = 15;
        int sum = sumNotDivisibleBy3Or5(n);
        System.out.println("The sum of numbers from 1 to " + n + " that are not divisible by 3 or 5 is: " + sum);
    }
}
package com.example;

public class Main {
    public static boolean tryConnect(int successfulAttempt) {
        int retryCount = 0;
        do {
            retryCount = retryCount + 1; // Incrementing retryCount
            if (retryCount == successfulAttempt) { // Checking if this is the successful attempt
                System.out.println("Successfully connected to the server.");
                return true;
            }
            System.out.println("Server unavailable, retrying...");
        } while (retryCount < 5); // Looping up to 5 times
        return false;
    }
    public static void main(String[] args) {
        boolean connected = tryConnect(3);
        if (!connected) {
            System.out.println("Failed to connect to the server after 5 attempts.");
        }
    }
}
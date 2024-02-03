package com.main;

import java.util.Scanner;

public class MatrixOperations {

    private static final int MAX_SIZE = 20;
    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 100;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Input matrix dimensions
            System.out.print("Enter the number of rows (not more than 20): ");
            int rows = validateInput(scanner.nextInt());

            System.out.print("Enter the number of columns (not more than 20): ");
            int columns = validateInput(scanner.nextInt());

            // Create matrix
            int[][] matrix = createMatrix(rows, columns);

            // Display matrix
            System.out.println("Matrix:");
            printMatrix(matrix);

            // Calculate and display results
            System.out.println("Minimum Element: " + findMin(matrix));
            System.out.println("Maximum Element: " + findMax(matrix));
            System.out.println("Average: " + calculateAverage(matrix));
            System.out.println("Geometric Average: " + calculateGeometricAverage(matrix));
        }
    }

    private static int[][] createMatrix(int rows, int columns) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[][] matrix = new int[rows][columns];

            System.out.println("Choose matrix creation method:");
            System.out.println("1. Manual input");
            System.out.println("2. Randomly generated");

            int choice = validateInput(scanner.nextInt(), 1, 2);

            if (choice == 1) {
                // Manual input
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                        matrix[i][j] = scanner.nextInt();
                    }
                }
            } else {
                // Randomly generated
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        matrix[i][j] = (int) (Math.random() * (MAX_VALUE - MIN_VALUE + 1) + MIN_VALUE);
                    }
                }
            }

            return matrix;
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    private static int findMin(int[][] matrix) {
        int min = matrix[0][0];
        for (int[] row : matrix) {
            for (int element : row) {
                min = Math.min(min, element);
            }
        }
        return min;
    }

    private static int findMax(int[][] matrix) {
        int max = matrix[0][0];
        for (int[] row : matrix) {
            for (int element : row) {
                max = Math.max(max, element);
            }
        }
        return max;
    }

    private static double calculateAverage(int[][] matrix) {
        int sum = 0;
        int count = 0;
        for (int[] row : matrix) {
            for (int element : row) {
                sum += element;
                count++;
            }
        }
        return (double) sum / count;
    }

    private static double calculateGeometricAverage(int[][] matrix) {
        double product = 1.0;
        int count = 0;
        for (int[] row : matrix) {
            for (int element : row) {
                product *= element;
                count++;
            }
        }
        return Math.pow(product, 1.0 / count);
    }

    private static int validateInput(int input) {
        return validateInput(input, 1, MAX_SIZE);
    }

    private static int validateInput(int input, int minValue, int maxValue) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (input < minValue || input > maxValue) {
                System.out.print("Invalid input. Please enter a value between " + minValue + " and " + maxValue + ": ");
                input = scanner.nextInt();
            }
        }
        return input;
    }
}

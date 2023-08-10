package test2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PositiveNegativeSumCCE104 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        // Input 10 numbers from the user in a single line
        System.out.println("Enter 10 numbers separated by spaces:");
        String inputLine = scanner.nextLine();
        String[] inputNumbers = inputLine.split(" ");
        
        if (inputNumbers.length != 10) {
            System.out.println("Please enter exactly 10 numbers.");
            scanner.close();
            return;
        }
        
        for (int i = 0; i < 10; i++) {
            numbers[i] = Integer.parseInt(inputNumbers[i]);
        }

        int positiveSum = 0;
        int negativeSum = 0;

        // Open the output file for writing
        String outputFilePath = "inputs.txt";
        try (FileWriter writer = new FileWriter(outputFilePath)) {
            for (int num : numbers) {
                writer.write(num + "\n");

                if (num > 0) {
                    positiveSum += num;
                } else if (num < 0) {
                    negativeSum += num;
                }
            }
            
            System.out.println("Positive numbers sum: " + positiveSum);
            System.out.println("Negative numbers sum: " + negativeSum);
            System.out.println("Results written to " + outputFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }

        scanner.close();
    }
}

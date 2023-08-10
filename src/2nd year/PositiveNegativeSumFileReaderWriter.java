package test2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PositiveNegativeSumFileReaderWriter {
    public static void main(String[] args) {
        String inputFilePath = "inputs.txt";   // Update this with the actual input file path
        String outputFilePath = "outputs.txt"; // Update this with the desired output file path

        int positiveSum = 0;
        int negativeSum = 0;

        // Read numbers from the input text file
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                int number = Integer.parseInt(line);

                if (number > 0) {
                    positiveSum += number;
                } else if (number < 0) {
                    negativeSum += number;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        // Open the output file for writing
        try (FileWriter writer = new FileWriter(outputFilePath)) {
            // Read numbers from the input file again and write to output file
            try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    writer.write(line + "\n");
                }
            }
            System.out.println("Let's Analyze: Determine positive and negative numbers\n");
            System.out.println("Positive numbers sum: " + positiveSum);
            System.out.println("Negative numbers sum: " + negativeSum);
            
            System.out.println("\nResults written to " + outputFilePath);
            System.out.println(" -Ariel Sumalan Jr \n -Andre John Agon \n -Deyvis Furan \n -John Leonard Lopez \n -Qiim Yasser Sinsuat Cagalawan");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

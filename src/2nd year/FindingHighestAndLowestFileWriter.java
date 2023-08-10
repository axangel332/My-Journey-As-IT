package test1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class FindingHighestAndLowestFileWriter {
    public static void main(String[] args) {
        String filePath = "numbers.txt";  // Update this with the actual file path
        
        int[] numbers = new int[10];
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            // Read numbers from the file
            String line;
            int i = 0;
            while ((line = reader.readLine()) != null && i < 10) {
                numbers[i] = Integer.parseInt(line);
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        // Sort the numbers array in ascending order
        Arrays.sort(numbers);

        // Display the lowest, second lowest, highest, and second highest numbers
        System.out.println("Lowest: " + numbers[0]);
        System.out.println("Second Lowest: " + numbers[1]);
        System.out.println("Highest: " + numbers[9]);
        System.out.println("Second Highest: " + numbers[8]);
    }
}

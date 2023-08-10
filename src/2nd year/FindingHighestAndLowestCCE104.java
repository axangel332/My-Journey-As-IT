package test1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class FindingHighestAndLowestCCE104 {
	public static void main(String[] args) {
		String inputFilePath = "input.txt";
		String outputFilePath = "output.txt";

		int[] numbers = new int[10];

		try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath))) {
			String line = reader.readLine();
			String[] inputNumbers = line.split(" ");

			if (inputNumbers.length != 10) {
				System.out.println("The input file should contain exactly 10 numbers.");
				return;
			}

			for (int i = 0; i < 10; i++) {
				numbers[i] = Integer.parseInt(inputNumbers[i]);
			}
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}

		Arrays.sort(numbers);

		String outputContent = "Lowest: " + numbers[0] + "\n" + "Second Lowest: " + numbers[1] + "\n" + "Highest: "
				+ numbers[9] + "\n" + "Second Highest: " + numbers[8];

		try {
			FileWriter writer = new FileWriter(outputFilePath);
			writer.write(outputContent);
			writer.close();
			System.out.println("Input.txt");
			System.out.println("\nFirst Lowest: " + numbers[0] + "\n" + "Second Lowest: " + numbers[1] + "\n" + "First Highest: "
					+ numbers[9] + "\n" + "Second Highest: " + numbers[8] + "\n");
			System.out.println("Also Results written to " + outputFilePath);
			System.out.println(" -Ariel Sumalan Jr \n -Andre John Agon \n -Deyvis Furan \n -John Leonard Lopez \n -Qiim Yasser Sinsuat Cagalawan");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

package cce;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class House {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		
		String address;
		 
		String color;
		 
		double area;

		System.out.print("Enter the address of the house: ");
		address = scanner.nextLine();

		System.out.print("Enter the color of the house: ");
		color = scanner.nextLine();

		System.out.print("Enter the area of the house: ");
		area = scanner.nextDouble();

		FileWriter writer = new FileWriter("HouseInfo.txt", true);

		writer.write(address + " " + color + " " + area + "\n");

		writer.close();

		System.out.println("\n" + "Suceesss added");
		

	}

}

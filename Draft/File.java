package cce;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileReader;

public class File {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner reader = new Scanner(new FileReader("HouseInfo.txt"));

		String address;

		String color;

		double area;

		int counter = 1;

		while (reader.hasNext())

		{

			address = reader.next();

			color = reader.next();

			area = reader.nextDouble();

			System.out.println("\n-----House #" + counter + "------");

			System.out.println("Addres Name: " + address);

			System.out.println("Color Name: " + color);

			System.out.println("Area Size: " + area);

			counter++;

		}

		reader.close();
	}
}
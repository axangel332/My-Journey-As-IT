package cce;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JDialog;

//Start
public class FinalOutput {

	public static void main(String args[]) {
		// declare variables
		String id = null;
		String productName = null;
		int quantity = 0;
		double price = 0.0;
		double totalPrice = 0.0;
		double overAllPrice = 0.0;
		// Central Goods and Services Tax -cgst
		// State Goods and Service Tax -sgst
		double cgst, sgst, subtotal = 0.0, discount = 0.0;
		char choice = '\0';

		JDialog.setDefaultLookAndFeelDecorated(true);
		// display messagedialogue "hello, welcome to super mall"
		JOptionPane.showMessageDialog(null, "Hello, Welcome to Super Mall.");

		String first_name;
		first_name = JOptionPane.showInputDialog("First Name");
		String family_name;
		family_name = JOptionPane.showInputDialog("Family Name");
		String full_name;
		full_name = "Hello " + first_name + " " + family_name + ".";
		// Enter your first name and family name
		JOptionPane.showMessageDialog(null, full_name + " Welcome to our store!!	");

		String[] options = { "Super Market", "Theater Store", "Department Store" };
		// select 3 options. Option 1 Supermarket, Option 2 Theater, and Option 3
		// Department store
		var selection = JOptionPane.showOptionDialog(null, "Select one:", "Let's do some shopping!!", 0, 3, null,
				options, options[0]);
		// creating an ArrayList to store the product
		List<Product> product = new ArrayList<Product>();

		// Option 1 Supermarket
		if (selection == 0) {
			JOptionPane.showMessageDialog(null, "You've chosen Super Market!");

			do

			{

				System.out.println("-------SUPER MARKET MENU------");
				// declare the List, product ID and Prrice Variables
				String[] list1 = { "Hotdog", "Donut", "Eggpie", "Pizza", "Lasagna" };
				int[] productid = { 1110, 1120, 1130, 1140, 1150 };
				int[] price1 = { 40, 20, 120, 250, 180 };
				System.out.println("Product ID#" + "\t" + "Item" + "\t" + "\tPrice");
				for (int m = 0; m < list1.length; m++) {
					System.out.println(productid[m] + "\t" + "\t" + list1[m] + "\t" + "\t" + price1[m]);
				}
				// list them down
				// read input values
				id = JOptionPane.showInputDialog("Product ID:  ");
				productName = JOptionPane.showInputDialog("Product Name:  ");
				quantity = Integer.parseInt(JOptionPane.showInputDialog("Quantity:  "));
				price = Integer.parseInt(JOptionPane.showInputDialog("Price (Per Unit):  "));
				totalPrice = price * quantity;
				overAllPrice = overAllPrice + totalPrice;
				product.add(new Product(id, productName, quantity, price, totalPrice));
				String[] YesorNo = { "y", "n" };
				choice = (char) JOptionPane.showConfirmDialog(null, "Would you like to add more?", "Yes OR NO",
						JOptionPane.YES_NO_OPTION);

			} while (choice == JOptionPane.YES_OPTION);
			Product.displayFormat();
			// display all product with its properties
			for (Product p : product) {
				p.display();
			}

			// price calculation
			System.out.println("\n\t\t\t\t\t\t\t\t\t\tTotal Amount (Rs.) " + overAllPrice);
			// calculating discount
			discount = overAllPrice * 2 / 100;
			System.out.println("\n\t\t\t\t\t\t\t\t\t\t    Discount (Rs.) " + discount);
			// total amount after discount
			subtotal = overAllPrice - discount;
			System.out.println("\n\t\t\t\t\t\t\t\t\t\t          Subtotal " + subtotal);
			// calculating tax
			sgst = overAllPrice * 12 / 100;
			System.out.println("\n\t\t\t\t\t\t\t\t\t\t          SGST (%) " + sgst);
			cgst = overAllPrice * 12 / 100;
			System.out.println("\n\t\t\t\t\t\t\t\t\t\t          CGST (%) " + cgst);
			// calculating amount to be paid by buyer
			System.out.println("\n\t\t\t\t\t\t\t\t\t\t     Invoice Total " + (subtotal + cgst + sgst + "\n"));
			// Display Total
			System.out.println("\t\t\t\t----------------Thank You for Shopping!!-----------------");
			System.out.println("\t\t\t\t                     Visit Again");

		}

		// Option 2 Theater Store
		if (selection == 1) {
			JOptionPane.showMessageDialog(null, "You've chosen Theater Store.");
			do {

				System.out.println("-------THEATER MENU------");
				String[] list1 = { "Troll", "Mermaid", "Avatar", "Thor", "Titanic" };
				int[] productid = { 2210, 2220, 2230, 2240, 2250 };
				int[] price1 = { 1270, 920, 1120, 1300, 800 };
				System.out.println("Product ID#" + "\t" + "Item" + "\t" + "\tPrice");
				for (int m = 0; m < list1.length; m++) {
					System.out.println(productid[m] + "\t" + "\t" + list1[m] + "\t" + "\t" + price1[m]);
				}
				// read input values
				id = JOptionPane.showInputDialog("Product ID:  ");
				productName = JOptionPane.showInputDialog("Product Name:  ");
				quantity = Integer.parseInt(JOptionPane.showInputDialog("Quantity:  "));
				price = Integer.parseInt(JOptionPane.showInputDialog("Price (Per Unit):  "));
				// calculate total price for a particular product
				totalPrice = price * quantity;
				// calculates overall price
				overAllPrice = overAllPrice + totalPrice;
				// creates Product class object and add it to the List
				product.add(new Product(id, productName, quantity, price, totalPrice));
				// ask for continue shopping?
				choice = (char) JOptionPane.showConfirmDialog(null, "Would you like to add more?", "Yes OR NO",
						JOptionPane.YES_NO_OPTION);
				// reads a character Y or N

			} while (choice == JOptionPane.YES_OPTION);
			Product.displayFormat();
			for (Product p : product) {
				p.display();
			}
			System.out.println("\n\t\t\t\t\t\t\t\t\t\tTotal Amount (Rs.) " + overAllPrice);
			discount = overAllPrice * 2 / 100;
			System.out.println("\n\t\t\t\t\t\t\t\t\t\t    Discount (Rs.) " + discount);
			subtotal = overAllPrice - discount;
			System.out.println("\n\t\t\t\t\t\t\t\t\t\t          Subtotal " + subtotal);
			sgst = overAllPrice * 12 / 100;
			System.out.println("\n\t\t\t\t\t\t\t\t\t\t          SGST (%) " + sgst);
			cgst = overAllPrice * 12 / 100;
			System.out.println("\n\t\t\t\t\t\t\t\t\t\t          CGST (%) " + cgst);
			System.out.println("\n\t\t\t\t\t\t\t\t\t\t     Invoice Total " + (subtotal + cgst + sgst + "\n"));
			System.out.println("\t\t\t\t----------------Thank You for Shopping!!-----------------");
			System.out.println("\t\t\t\t                     Visit Again");

		}

		// Option 3 Department Store
		if (selection == 2) {
			JOptionPane.showMessageDialog(null, "You've chosen Department Store!");

			do {
				System.out.println("-------DEPARTMENT STORE MENU------");
				String[] list1 = { "Socks", "T-shirts", "Shorts", "Hats", "Shoes" };
				int[] productid = { 3310, 3320, 3330, 3340, 3350 };
				int[] price1 = { 75, 200, 165, 300, 2000 };
				System.out.println("Product ID#" + "\t" + "Item" + "\t" + "\tPrice");
				for (int m = 0; m < list1.length; m++) {
					System.out.println(productid[m] + "\t" + "\t" + list1[m] + "\t" + "\t" + price1[m]);
				}

				id = JOptionPane.showInputDialog("Product ID:  ");
				productName = JOptionPane.showInputDialog("Product Name:  ");
				quantity = Integer.parseInt(JOptionPane.showInputDialog("Quantity:  "));
				price = Integer.parseInt(JOptionPane.showInputDialog("Price (Per Unit):  "));
				totalPrice = price * quantity;
				overAllPrice = overAllPrice + totalPrice;
				product.add(new Product(id, productName, quantity, price, totalPrice));
				String[] YesorNo = { "y", "n" };
				choice = (char) JOptionPane.showConfirmDialog(null, "Would you like to add more?", "Yes OR NO",
						JOptionPane.YES_NO_OPTION);

			} while (choice == JOptionPane.YES_OPTION);
			Product.displayFormat();

			for (Product p : product) {
				p.display();
			}

			System.out.println("\n\t\t\t\t\t\t\t\t\t\tTotal Amount (Rs.) " + overAllPrice);
			discount = overAllPrice * 2 / 100;
			System.out.println("\n\t\t\t\t\t\t\t\t\t\t    Discount (Rs.) " + discount);
			subtotal = overAllPrice - discount;
			System.out.println("\n\t\t\t\t\t\t\t\t\t\t          Subtotal " + subtotal);
			sgst = overAllPrice * 12 / 100;
			System.out.println("\n\t\t\t\t\t\t\t\t\t\t          SGST (%) " + sgst);
			cgst = overAllPrice * 12 / 100;
			System.out.println("\n\t\t\t\t\t\t\t\t\t\t          CGST (%) " + cgst);
			System.out.println("\n\t\t\t\t\t\t\t\t\t\t     Invoice Total " + (subtotal + cgst + sgst + "\n"));
			System.out.println("\t\t\t\t----------------Thank You for Shopping!!-----------------");
			System.out.println("\t\t\t\t                     Visit Again");

		}
	}
}

class Product {
	// properties
	private String id;
	private String pname;
	private int qty;
	private double price;
	private double totalPrice;

	// constructor
	Product(String id, String pname, int qty, double price, double totalPrice) {
		this.id = id;
		this.pname = pname;
		this.qty = qty;
		this.price = price;
		this.totalPrice = totalPrice;
	}

	// getter methods
	public String getId() {
		return id;
	}

	public String getPname() {
		return pname;
	}

	public int getQty() {
		return qty;
	}

	public double getPrice() {
		return price;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	// displayFormat
	//display heading of recipts
	public static void displayFormat() {
		System.out.format(
				"-----------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("\nProduct ID \t\tName\t\tQuantity\t\tRate \t\t\t\tTotal Price\n");
		System.out.format(
				"-----------------------------------------------------------------------------------------------------------------------------------\n");
	}

	// display
	//total
	public void display() {
		System.out.format("   %-9s             %-9s      %5d               %9.2f                       %14.2f\n", id,
				pname, qty, price, totalPrice);
	}
}
//END
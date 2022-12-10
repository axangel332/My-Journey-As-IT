package cce;

import java.io.File;		
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class FujiwaraOnlineSelling {

	public static void main(String[] args) throws IOException {
	
		welcome();
		
			String option;
		
				do {
			
					String [] options = { "Sell Product", "Retrieve Product", "Update Product", "Delete Product", "Exit"};
			
						option = (String) (JOptionPane.showInputDialog(null, "What do you want to do?", "Fujiwara Online Selling", JOptionPane.PLAIN_MESSAGE, null, options, options[0]));
			
							switch (option) {
			
								case "Sell Product" : SellProduct();
														break;
				
								case "Retrieve Product" : RetrieveProduct();
														break;
				
								case "Update Product" : UpdateProduct();
														break;
				
								case "Delete Product" : DeleteProduct();
														break;
					
								case "Exit" : JOptionPane.showMessageDialog(null, "                              Thank you! ", "Fujiwara Online Selling", JOptionPane.PLAIN_MESSAGE);
													System.exit(0);
			
							}
							} while (!option.equals("Exit"));
							}

			//DELETE
			private static void DeleteProduct() throws IOException {
	
				PrintWriter tmp = new PrintWriter (new FileWriter("Delete.txt"));
		
					Scanner delete = new Scanner(new FileReader("Products.txt"));
		
						String deleteProduct = JOptionPane.showInputDialog(null, "Enter Order to delete", "Fujiwara Online Selling", JOptionPane.QUESTION_MESSAGE);
		
							boolean nakita = false;
		
								delete.useDelimiter(":");
								while(delete.hasNext())
								{
									String fProductName3 = delete.next();
									int fPrice3 = delete.nextInt();
									int fQuantity3 = delete.nextInt();
									delete.nextLine();
			
									if (fProductName3.equalsIgnoreCase(deleteProduct))
									{
										JOptionPane.showMessageDialog(null, "Product Deleted.", "Fujiwara Online Selling", JOptionPane.INFORMATION_MESSAGE);
																nakita = true;
																		continue;
									}
									tmp.println(fProductName3+":"+fPrice3+":"+fQuantity3+":");
									}
									if (!nakita)
										JOptionPane.showMessageDialog(null, "Product not found!", "Fujiwara Online Selling", JOptionPane.WARNING_MESSAGE);
		
									delete.close();
									tmp.close();
		
									File DeleteProducts = new File("Products.txt");
									File DeleteTemp = new File ("Delete.txt");
									DeleteProducts.delete();
									DeleteTemp.renameTo(DeleteProducts);
		}

			//UPDATE
			private static void UpdateProduct() throws IOException {
	
				PrintWriter UpdateProduct =new PrintWriter(new FileWriter("temp.txt",true));
		
					Scanner Update =new Scanner(new FileReader("Products.txt"));
					
						String UpdateProducts;
		
							UpdateProducts = JOptionPane.showInputDialog(null,"Enter Product Name to Update Price:","Fujiwara Online Selling",JOptionPane.INFORMATION_MESSAGE);
		
								Update.useDelimiter(":");
								while(Update.hasNext())
								{ 
									String fProductName2 = Update.next();
									int fPrice2 = Update.nextInt();
									int fQuantity2 = Update.nextInt();
									Update.nextLine();
			
									if(fProductName2.equalsIgnoreCase(UpdateProducts))
									{
										fPrice2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter new Price: ", "Fujiwara Online Selling", JOptionPane.QUESTION_MESSAGE));
										JOptionPane.showMessageDialog(null, "Product: " +fProductName2 + "\nPrice: " + fPrice2 + "\nQuantity: " + fQuantity2, "Fujiwara Online Selling", JOptionPane.QUESTION_MESSAGE);
									}UpdateProduct.println(fProductName2+":"+fPrice2+":"+fQuantity2+":");
					
									}
									Update.close();
									UpdateProduct.close();
		
									File OldProducts = new File("Products.txt");
									File Oldtemp=new File("temp.txt");
									OldProducts.delete();
									Oldtemp.renameTo(OldProducts);
								}
									

			//RETRIEVE
			private static void RetrieveProduct() throws IOException {
	
				Scanner Record = new Scanner (new FileReader("Products.txt"));
		
					Record.useDelimiter(":");
					while(Record.hasNext())
					{
						String fProductName = Record.next();
						int fPrice = Record.nextInt();
						int fQuantity = Record.nextInt();
						Record.nextLine();
					}
					Record.close();
					
					boolean nakita = false;
		
						Scanner Retrieve = new Scanner (new FileReader("Products.txt"));
						
							String RetrieveProduct;
		
								RetrieveProduct = JOptionPane.showInputDialog(null, "Enter Product Name to Retrieve:", "Fujiwara Online Selling", JOptionPane.QUESTION_MESSAGE);
		
									Retrieve.useDelimiter(":");
									while (Retrieve.hasNext()&&!nakita)
									{
										String fProductName1 = Retrieve.next();
										int fPrice1 = Retrieve.nextInt();
										int fQuantity1 = Retrieve.nextInt();
										Retrieve.nextLine();
			
										if (fProductName1.equalsIgnoreCase(RetrieveProduct))
											
										{
											JOptionPane.showMessageDialog(null,"Product Record Found"+"\nProduct Name: "+fProductName1+"\nPrice: "+fPrice1+"\nQuantity: "+fQuantity1, "Fujiwara Online Selling", JOptionPane.PLAIN_MESSAGE);
											
											nakita = true;	
										}
										}	
									
									Retrieve.close();
									
									if(!nakita){JOptionPane.showMessageDialog(null,"Product not listed!",  "Fujiwara Online Selling", JOptionPane.WARNING_MESSAGE);
									}
									}
	

			//CREATE
			private static void SellProduct() throws IOException {
					
				PrintWriter Product = new PrintWriter (new FileWriter("Products.txt", true));
		
					String ProductName;
						int Price;
							int Quantity;
		
								do {
			
										ProductName = JOptionPane.showInputDialog(null, "Enter Product Name:", "Fujiwara Online Selling", JOptionPane.QUESTION_MESSAGE);
										
										Price = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Product Price:", "Fujiwara Online Selling", JOptionPane.QUESTION_MESSAGE));
										
										Quantity = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Product Quantity:", "Fujiwara Online Selling", JOptionPane.QUESTION_MESSAGE));
			
										JOptionPane.showMessageDialog(null, "Product Added.", "Fujiwara Online Selling", JOptionPane.INFORMATION_MESSAGE);
			
										Product.println(ProductName+":"+Price+":"+Quantity+":");
			
								} while (JOptionPane.showConfirmDialog(null, "Any more Product?")==0);
									
								Product.close();

								}
		
			//WELCOME
			private static void welcome() {
		
				JOptionPane.showMessageDialog(null,"       Welcome to Fujiwara Online Selling", "Fujiwara Online Selling", JOptionPane.PLAIN_MESSAGE);
				}
				}

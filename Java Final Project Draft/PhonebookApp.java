package oop;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class PhonebookApp extends JFrame {
	private JTextField nameField, ageField, phoneField, addressField, zipcodeField;
	private JButton addButton, editButton, deleteButton;
	private JTable table;
	private DefaultTableModel model;
	private JLabel Age;
	private JLabel txtfileloc = new JLabel("");
	private JPanel paneledit = new JPanel();
	private JLabel textChoice = new JLabel(" ");
	private JTextField textField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PhonebookApp frame = new PhonebookApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();

				}
			}
		});
	}

	public PhonebookApp() {
		getContentPane().setBackground(new Color(33, 35, 35));
		setUndecorated(true);
		// Set up the JFrame
		setTitle("Phonebook");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 500);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);

		// Set up the JTable
		
		int counter = 1;
		model = new DefaultTableModel();
		model.addColumn("Name");
		model.addColumn("Age");
		model.addColumn("Phone");
		model.addColumn("Address");
		model.addColumn("Zipcode");
		getContentPane().setLayout(null);
		table = new JTable(model);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(330, 113, 560, 275);
		getContentPane().add(scrollPane);

		JPanel PanelTop = new JPanel();
		PanelTop.setBorder(null);
		PanelTop.setLayout(null);
		PanelTop.setBackground(new Color(23, 26, 33));
		PanelTop.setBounds(0, 0, 900, 72);
		getContentPane().add(PanelTop);

		JLabel DateandTime = new JLabel("");
		DateandTime.setForeground(Color.WHITE);
		DateandTime.setFont(new Font("Tahoma", Font.BOLD, 12));
		DateandTime.setBounds(668, 47, 193, 14);
		PanelTop.add(DateandTime);

		JLabel lblXBotton = new JLabel("X");
		lblXBotton.setHorizontalAlignment(SwingConstants.CENTER);
		lblXBotton.setForeground(Color.WHITE);
		lblXBotton.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblXBotton.setBackground(Color.WHITE);
		lblXBotton.setBounds(871, 0, 29, 29);
		PanelTop.add(lblXBotton);
		
		JLabel lblPhonebookTable = new JLabel("PHONEBOOK TABLE");
		lblPhonebookTable.setForeground(Color.WHITE);
		lblPhonebookTable.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPhonebookTable.setBounds(10, 22, 508, 50);
		PanelTop.add(lblPhonebookTable);
		lblXBotton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				JDialog.setDefaultLookAndFeelDecorated(true);
				if (JOptionPane.showConfirmDialog(null, "Are you sure you want to close this application",
						"Confirmation", JOptionPane.YES_NO_OPTION) == 0)
					;
				PhonebookApp.this.dispose();
			}

			public void mouseEntered(MouseEvent e) {
				lblXBotton.setForeground(Color.RED);
			}

			public void mouseExited(MouseEvent e) {
				lblXBotton.setForeground(Color.WHITE);
			}

		});

		// Set up the input fields and buttons
		JPanel PanelInput = new JPanel();
		PanelInput.setBackground(new Color(43, 46, 55));
		PanelInput.setBounds(0, 0, 308, 500);
		PanelInput.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		PanelInput.setLayout(null);

		JLabel Name = new JLabel("Name:");
		Name.setForeground(Color.WHITE);
		Name.setFont(new Font("Tahoma", Font.BOLD, 12));
		Name.setBounds(10, 138, 166, 20);
		PanelInput.add(Name);
		nameField = new JTextField();
		nameField.setFont(new Font("Tahoma", Font.BOLD, 12));
		nameField.setBounds(81, 138, 208, 20);
		PanelInput.add(nameField);
		nameField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char character = e.getKeyChar();
				if (Character.isDigit(character)) {
					e.consume(); // Consumes the event to prevent the integer input
				}
			}

			public void keyPressed(KeyEvent e) {
			}

			public void keyReleased(KeyEvent e) {
			}
		});

		Age = new JLabel("Age:");
		Age.setForeground(Color.WHITE);
		Age.setFont(new Font("Tahoma", Font.BOLD, 12));
		Age.setBounds(10, 178, 166, 20);
		PanelInput.add(Age);
		
		ageField = new JTextField();
		ageField.setFont(new Font("Tahoma", Font.BOLD, 12));
		ageField.setBounds(81, 178, 208, 20);
		PanelInput.add(ageField);
		ageField.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char character = e.getKeyChar();
				if (!Character.isDigit(character)) {
					e.consume(); // Consumes the event to prevent the non-integer input
				}
			}

			public void keyPressed(KeyEvent e) {
			}

			public void keyReleased(KeyEvent e) {
			}
		});

		JLabel Phone = new JLabel("Phone:");
		Phone.setForeground(Color.WHITE);
		Phone.setFont(new Font("Tahoma", Font.BOLD, 12));
		Phone.setBounds(10, 218, 166, 20);
		PanelInput.add(Phone);
		phoneField = new JTextField();
		phoneField.setFont(new Font("Tahoma", Font.BOLD, 12));
		phoneField.setBounds(81, 218, 208, 20);
		PanelInput.add(phoneField);
		phoneField.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char character = e.getKeyChar();
				if (!Character.isDigit(character)) {
					e.consume(); // Consumes the event to prevent the non-integer input
				}
			}

			public void keyPressed(KeyEvent e) {
			}

			public void keyReleased(KeyEvent e) {
			}
		});
		

		JLabel Address = new JLabel("Address:");
		Address.setForeground(Color.WHITE);
		Address.setFont(new Font("Tahoma", Font.BOLD, 12));
		Address.setBounds(10, 258, 166, 20);
		PanelInput.add(Address);
		addressField = new JTextField();
		addressField.setFont(new Font("Tahoma", Font.BOLD, 12));
		addressField.setBounds(81, 258, 208, 20);
		PanelInput.add(addressField);

		JLabel Zipcode = new JLabel("Zipcode:");
		Zipcode.setForeground(Color.WHITE);
		Zipcode.setFont(new Font("Tahoma", Font.BOLD, 12));
		Zipcode.setBounds(10, 298, 208, 20);
		PanelInput.add(Zipcode);
		
		paneledit.setBorder(null);
		paneledit.setBackground(new Color(33, 35, 35));
		paneledit.setBounds(374, 447, 465, 42);
		getContentPane().add(paneledit);
		paneledit.setLayout(null);
		paneledit.setVisible(false);
		
		textChoice.setBounds(10, 16, 142, 15);
		paneledit.add(textChoice);
		textChoice.setForeground(Color.WHITE);
		textChoice.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField.setBounds(162, 14, 208, 20);
		paneledit.add(textField);
		
		JButton btnGo = new JButton("Go");
		btnGo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean found = false;
				try (BufferedReader br = new BufferedReader(new FileReader("PhoneBook.txt"))) {
					String line;
					while ((line = br.readLine()) != null) {
						String[] fields = line.split("\\|");
						if (fields[0].equals(nameField.getText())) {
							nameField.setText(fields[0]);
							ageField.setText(fields[1]);
							phoneField.setText(fields[2]);
							addressField.setText(fields[4]);
							zipcodeField.setText(fields[5]);
							found = true;
							
							break;
						}
					}
					if (!found) {
						JOptionPane.showMessageDialog(null, "Data not found!", "Bus Ticket System",
								JOptionPane.ERROR_MESSAGE);
					}
				} catch (FileNotFoundException e1) {
					JOptionPane.showMessageDialog(null, "File not found!", "Bus Ticket System",
							JOptionPane.ERROR_MESSAGE);
				} catch (IOException e2) {
					JOptionPane.showMessageDialog(null, "Error reading file!", "Bus Ticket System",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnGo.setForeground(Color.WHITE);
		btnGo.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGo.setBackground(new Color(0, 128, 255));
		btnGo.setBounds(380, 11, 50, 25);
		paneledit.add(btnGo);
		
		
		
		zipcodeField = new JTextField();
		zipcodeField.setFont(new Font("Tahoma", Font.BOLD, 12));
		zipcodeField.setBounds(81, 298, 208, 20);
		PanelInput.add(zipcodeField);
		getContentPane().add(PanelInput);
		zipcodeField.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char character = e.getKeyChar();
				if (!Character.isDigit(character)) {
					e.consume(); // Consumes the event to prevent the non-integer input
				}
			}

			public void keyPressed(KeyEvent e) {
			}

			public void keyReleased(KeyEvent e) {
			}
		});
		addButton = new JButton("Add");
		addButton.setForeground(Color.WHITE);
		addButton.setBounds(119, 343, 99, 37);
		PanelInput.add(addButton);
		addButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		addButton.setBackground(new Color(0, 128, 255));	
				txtfileloc.setBounds(10, 402, 279, 29);
				PanelInput.add(txtfileloc);
		
				txtfileloc.setForeground(Color.WHITE);
				txtfileloc.setFont(new Font("Tahoma", Font.BOLD, 12));
				txtfileloc.setHorizontalAlignment(SwingConstants.CENTER);
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] row = new String[5];
				row[0] = nameField.getText();
				row[1] = ageField.getText();
				row[2] = phoneField.getText();
				row[3] = addressField.getText();
				row[4] = zipcodeField.getText();
				model.addRow(row);
				int counter = 1;
				try {
					FileWriter writer = new FileWriter("PhoneBook.txt");
					writer.write("\n-----People #" + counter + "------" + "\n");
					writer.write("Name : " + nameField.getText() + "\n");
					writer.write("Age : " + ageField.getText() + "\n");
					writer.write("Address : " + phoneField.getText() + "\n");
					writer.write("Mobile : " + addressField.getText() + "\n");
					writer.write("Email : " + zipcodeField.getText() + "\n");
					counter++;
					writer.close();
					txtfileloc.setText("Info Added At PhoneBook.txt ");
				} catch (IOException ex) {
					JOptionPane.showMessageDialog(null, "Error writing user information to file.");
				}
			}
		});


		editButton = new JButton("Edit");
		editButton.setBounds(487, 399, 99, 37);
		getContentPane().add(editButton);
		editButton.setForeground(Color.WHITE);
		editButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		editButton.setBackground(new Color(0, 128, 255));
		editButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				paneledit.setVisible(true);
					int row = table.getSelectedRow();
					textChoice.setText("Enter Name to Edit     :");
					if (row >= 0) {
						model.setValueAt(nameField.getText(), row, 0);
						model.setValueAt(ageField.getText(), row, 1);
						model.setValueAt(phoneField.getText(), row, 2);
						model.setValueAt(addressField.getText(), row, 3);
						model.setValueAt(zipcodeField.getText(), row, 4);
				}
			}
			});
		
		deleteButton = new JButton("Delete");
		deleteButton.setBounds(643, 399, 99, 37);
		getContentPane().add(deleteButton);
		deleteButton.setForeground(Color.WHITE);
		deleteButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		deleteButton.setBackground(new Color(0, 128, 255));
		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textChoice.setText("Enter Name to Delete :");
				int row = table.getSelectedRow();
				if (row >= 0) {
					model.removeRow(row);
				}
			}
		});
		// Set the JFrame size and make it visible
		setVisible(true);
	}
}

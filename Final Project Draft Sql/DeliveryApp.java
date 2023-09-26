package sheesh;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class DeliveryApp extends JFrame {
	private JTextField nameField, ageField, phoneField, addressField, zipcodeField, DateField;
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
					DeliveryApp frame = new DeliveryApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();

				}
			}
		});
	}

	public DeliveryApp() {
		getContentPane().setBackground(new Color(33, 35, 35));
		setUndecorated(true);
		// Set up the JFrame
		setTitle("Phonebook");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 700);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);

		// Set up the JTable

		int counter = 1;
		model = new DefaultTableModel();
		model.addColumn("Cust_Id");
		model.addColumn("Cust_Name");
		model.addColumn("Phone_Num");
		model.addColumn("Email");
		model.addColumn("Cust_Address");
		model.addColumn("Date");
		getContentPane().setLayout(null);
		table = new JTable(model);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(330, 113, 660, 435);
		getContentPane().add(scrollPane);
		
		Object[][] data = {
	            {1001, 1, 101, 2, 1.98, "2023-09-26"},
	            {1002, 2, 102, 3, 2.25, "2023-09-27"},
	            {1003, 3, 103, 1, 1.25, "2023-09-28"}
	        };

	        for (Object[] row : data) {
	            model.addRow(row);
	        }

		JPanel PanelTop = new JPanel();
		PanelTop.setBorder(null);
		PanelTop.setLayout(null);
		PanelTop.setBackground(new Color(23, 26, 33));
		PanelTop.setBounds(0, 0, 1000, 72);
		getContentPane().add(PanelTop);

		JLabel DateandTime = new JLabel("");
		DateandTime.setForeground(Color.WHITE);
		DateandTime.setFont(new Font("Tahoma", Font.BOLD, 12));
		DateandTime.setBounds(668, 47, 193, 14);
		PanelTop.add(DateandTime);
		int delay = 100;
		Timer timer = new Timer(delay, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				LocalDateTime now = LocalDateTime.now();
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E, MMM dd yyyy \n HH:mm:ss");
				String formattedDateTime = now.format(formatter);
				DateandTime.setText(formattedDateTime);
			}
			
		});
		timer.start();

		JLabel lblXBotton = new JLabel("X");
		lblXBotton.setHorizontalAlignment(SwingConstants.CENTER);
		lblXBotton.setForeground(Color.WHITE);
		lblXBotton.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblXBotton.setBackground(Color.WHITE);
		lblXBotton.setBounds(961, 0, 29, 29);
		PanelTop.add(lblXBotton);

		JLabel lblPhonebookTable = new JLabel("Delivery");
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
				DeliveryApp.this.dispose();
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
		PanelInput.setBounds(0, 0, 308, 700);
		PanelInput.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		PanelInput.setLayout(null);

		JLabel Name = new JLabel("Trans_ID:");
		Name.setForeground(Color.WHITE);
		Name.setFont(new Font("Tahoma", Font.BOLD, 12));
		Name.setBounds(10, 138, 166, 20);
		PanelInput.add(Name);
		nameField = new JTextField();
		nameField.setFont(new Font("Tahoma", Font.BOLD, 12));
		nameField.setBounds(81, 138, 208, 20);
		PanelInput.add(nameField);

		Age = new JLabel("Cust_Id:");
		Age.setForeground(Color.WHITE);
		Age.setFont(new Font("Tahoma", Font.BOLD, 12));
		Age.setBounds(10, 178, 166, 20);
		PanelInput.add(Age);

		ageField = new JTextField();
		ageField.setFont(new Font("Tahoma", Font.BOLD, 12));
		ageField.setBounds(81, 178, 208, 20);
		PanelInput.add(ageField);

		JLabel Phone = new JLabel("Cust_Name");
		Phone.setForeground(Color.WHITE);
		Phone.setFont(new Font("Tahoma", Font.BOLD, 12));
		Phone.setBounds(10, 218, 166, 20);
		PanelInput.add(Phone);
		phoneField = new JTextField();
		phoneField.setFont(new Font("Tahoma", Font.BOLD, 12));
		phoneField.setBounds(81, 218, 208, 20);
		PanelInput.add(phoneField);


		JLabel Address = new JLabel("Cust_Num:");
		Address.setForeground(Color.WHITE);
		Address.setFont(new Font("Tahoma", Font.BOLD, 12));
		Address.setBounds(10, 258, 166, 20);
		PanelInput.add(Address);
		addressField = new JTextField();
		addressField.setFont(new Font("Tahoma", Font.BOLD, 12));
		addressField.setBounds(81, 258, 208, 20);
		PanelInput.add(addressField);

		JLabel Zipcode = new JLabel("Cust_Add:");
		Zipcode.setForeground(Color.WHITE);
		Zipcode.setFont(new Font("Tahoma", Font.BOLD, 12));
		Zipcode.setBounds(10, 298, 208, 20);
		PanelInput.add(Zipcode);

		paneledit.setBorder(null);
		paneledit.setBackground(new Color(33, 35, 35));
		paneledit.setBounds(410, 608, 465, 42);
		getContentPane().add(paneledit);
		paneledit.setLayout(null);
		paneledit.setVisible(false);
		textChoice.setHorizontalAlignment(SwingConstants.CENTER);

		textChoice.setBounds(10, 11, 445, 20);
		paneledit.add(textChoice);
		textChoice.setForeground(Color.WHITE);
		textChoice.setFont(new Font("Tahoma", Font.BOLD, 12));

		zipcodeField = new JTextField();
		zipcodeField.setFont(new Font("Tahoma", Font.BOLD, 12));
		zipcodeField.setBounds(81, 298, 208, 20);
		PanelInput.add(zipcodeField);
		getContentPane().add(PanelInput);

		addButton = new JButton("Add");
		addButton.setForeground(Color.WHITE);
		addButton.setBounds(51, 498, 99, 37);
		PanelInput.add(addButton);
		addButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		addButton.setBackground(new Color(0, 128, 255));
		txtfileloc.setBounds(10, 402, 279, 29);
		PanelInput.add(txtfileloc);

		txtfileloc.setForeground(Color.WHITE);
		txtfileloc.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtfileloc.setHorizontalAlignment(SwingConstants.CENTER);
		
	
		
		JButton btnGoBack = new JButton("Go Back");
		btnGoBack.setForeground(Color.WHITE);
		btnGoBack.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGoBack.setBackground(new Color(0, 128, 255));
		btnGoBack.setBounds(10, 615, 87, 29);
		PanelInput.add(btnGoBack);
		btnGoBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				oopconcept MenuLogin = new oopconcept();
				MenuLogin.setVisible(true);
				DeliveryApp.this.dispose();
			}
		});
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nameField.setText(" ");
				ageField.setText(" ");
				phoneField.setText(" ");
				addressField.setText(" ");
				zipcodeField.setText(" ");
				DateField.setText(" ");
				paneledit.setVisible(false);
				txtfileloc.setVisible(false);
			}
		});
		btnClear.setForeground(Color.WHITE);
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnClear.setBackground(new Color(0, 128, 255));
		btnClear.setBounds(171, 498, 99, 37);
		PanelInput.add(btnClear);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField.setBounds(81, 339, 208, 20);
		PanelInput.add(textField);
		
		JLabel lblDate = new JLabel("Date:");
		lblDate.setForeground(Color.WHITE);
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDate.setBounds(10, 339, 208, 20);
		PanelInput.add(lblDate);
		
		
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] row = new String[5];
				row[0] = nameField.getText();
				row[1] = ageField.getText();
				row[2] = phoneField.getText();
				row[3] = addressField.getText();
				row[4] = zipcodeField.getText();
				row[5] = DateField.getText();
				
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
					writer.write("Date : " + DateField.getText() + "\n");
					counter++;
					writer.close();
					txtfileloc.setText("Info Added At PhoneBook.txt ");
				} catch (IOException ex) {
					JOptionPane.showMessageDialog(null, "Error writing user information to file.");
				}
			}
		});

		editButton = new JButton("Edit");
		editButton.setBounds(535, 559, 99, 37);
		getContentPane().add(editButton);
		editButton.setForeground(Color.WHITE);
		editButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		editButton.setBackground(new Color(0, 128, 255));
		editButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				paneledit.setVisible(true);
				int row = table.getSelectedRow();
				textChoice.setText("Please Select a Row to Edit");
				if (row >= 0) {
					model.setValueAt(nameField.getText(), row, 0);
					model.setValueAt(ageField.getText(), row, 1);
					model.setValueAt(phoneField.getText(), row, 2);
					model.setValueAt(addressField.getText(), row, 3);
					model.setValueAt(zipcodeField.getText(), row, 4);
					model.setValueAt(DateField.getText(), row, 5);
					
				}
			}
		});

		deleteButton = new JButton("Delete");
		deleteButton.setBounds(684, 560, 99, 37);
		getContentPane().add(deleteButton);
		deleteButton.setForeground(Color.WHITE);
		deleteButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		deleteButton.setBackground(new Color(0, 128, 255));
		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				paneledit.setVisible(true);
				textChoice.setText("Please Select a Row to Delete");
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
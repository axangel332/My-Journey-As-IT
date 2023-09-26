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
import javax.swing.GroupLayout.Alignment;

public class FoodSupplyApp extends JFrame {
	private JTextField nameField, ageField, phoneField;
	private JButton addButton, editButton, deleteButton;
	private JTable table;
	private DefaultTableModel model;
	private JLabel Age;
	private JLabel txtfileloc = new JLabel("");
	private JPanel paneledit = new JPanel();
	private JLabel textChoice = new JLabel(" ");

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FoodSupplyApp frame = new FoodSupplyApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();

				}
			}
		});
	}

	public FoodSupplyApp() {
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
		model.addColumn("Food_Id");
		model.addColumn("Food_Name");
		model.addColumn("Stocks");

		Object[][] data = { { 1, "Apples", 100 }, { 2, "Bananas", 150 }, { 3, "Carrots", 75 } };

		for (Object[] row : data) {
			model.addRow(row);
		}

		getContentPane().setLayout(null);
		table = new JTable(model);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(330, 113, 660, 435);
		getContentPane().add(scrollPane);

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

		JLabel lblPhonebookTable = new JLabel("Customer");
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
				FoodSupplyApp.this.dispose();
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

		JLabel Name = new JLabel("Food_ID:");
		Name.setForeground(Color.WHITE);
		Name.setFont(new Font("Tahoma", Font.BOLD, 12));
		nameField = new JTextField();
		nameField.setFont(new Font("Tahoma", Font.BOLD, 12));

		Age = new JLabel("Food_Name");
		Age.setForeground(Color.WHITE);
		Age.setFont(new Font("Tahoma", Font.BOLD, 12));

		ageField = new JTextField();
		ageField.setFont(new Font("Tahoma", Font.BOLD, 12));

		JLabel Phone = new JLabel("Stocks:");
		Phone.setForeground(Color.WHITE);
		Phone.setFont(new Font("Tahoma", Font.BOLD, 12));
		phoneField = new JTextField();
		phoneField.setFont(new Font("Tahoma", Font.BOLD, 12));


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
		getContentPane().add(PanelInput);
		addButton = new JButton("Add");
		addButton.setForeground(Color.WHITE);
		addButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		addButton.setBackground(new Color(0, 128, 255));

		txtfileloc.setForeground(Color.WHITE);
		txtfileloc.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtfileloc.setHorizontalAlignment(SwingConstants.CENTER);

		JButton btnGoBack = new JButton("Go Back");
		btnGoBack.setForeground(Color.WHITE);
		btnGoBack.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGoBack.setBackground(new Color(0, 128, 255));
		btnGoBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				oopconcept MenuLogin = new oopconcept();
				MenuLogin.setVisible(true);
				FoodSupplyApp.this.dispose();
			}
		});

		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nameField.setText(" ");
				ageField.setText(" ");
				phoneField.setText(" ");

				paneledit.setVisible(false);
				txtfileloc.setVisible(false);
			}
		});
		btnClear.setForeground(Color.WHITE);
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnClear.setBackground(new Color(0, 128, 255));
		GroupLayout groupLayout = new GroupLayout(PanelInput);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup()
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup().addGap(71).addComponent(nameField,
								GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE))
						.addComponent(Name, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
						.addComponent(Phone, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtfileloc, GroupLayout.PREFERRED_SIZE, 279, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup().addGap(41)
								.addComponent(addButton, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
								.addGap(21)
								.addComponent(btnClear, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnGoBack, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
						.addComponent(Age)
						.addGroup(groupLayout.createSequentialGroup().addGap(71)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(ageField, GroupLayout.PREFERRED_SIZE, 208,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(phoneField, GroupLayout.PREFERRED_SIZE, 208,
												GroupLayout.PREFERRED_SIZE))))
				.addContainerGap(9, Short.MAX_VALUE)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addGap(128)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(nameField, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(Name, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addGap(20)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(Age, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(ageField, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addGap(20)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(Phone, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(phoneField, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addGap(164)
						.addComponent(txtfileloc, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE).addGap(67)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(addButton, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnClear, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
						.addGap(80).addComponent(btnGoBack, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addGap(46)));
		PanelInput.setLayout(groupLayout);

		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] row = new String[5];
				row[0] = nameField.getText();
				row[1] = ageField.getText();
				row[2] = phoneField.getText();

				model.addRow(row);
				int counter = 1;
				try {
					FileWriter writer = new FileWriter("PhoneBook.txt");
					writer.write("\n-----People #" + counter + "------" + "\n");
					writer.write("Name : " + nameField.getText() + "\n");
					writer.write("Age : " + ageField.getText() + "\n");
					writer.write("Address : " + phoneField.getText() + "\n");

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
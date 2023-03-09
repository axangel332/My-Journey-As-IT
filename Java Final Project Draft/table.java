package oop;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.awt.ScrollPane;
import java.awt.Component;

public class table extends JFrame {

	private JPanel PanelColor;
	private JTextField textZip;
	private JTextField textAdrress;
	private JTextField textAge;
	private JTextField textPhone;
	private JTextField textName;
	private DefaultTableModel model;
	private JButton addButton, editButton, deleteButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					table frame = new table();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public table() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 500);
		PanelColor = new JPanel();
		PanelColor.setBackground(new Color(33, 35, 35));
		PanelColor.setBorder(new EmptyBorder(5, 5, 5, 5));
		PanelColor.setLayout(null);

		setContentPane(PanelColor);
		PanelColor.setLayout(null);

		JPanel SteamPanel = new JPanel();
		SteamPanel.setLayout(null);
		SteamPanel.setBackground(new Color(23, 26, 33));
		SteamPanel.setBounds(0, 0, 900, 72);
		PanelColor.add(SteamPanel);

		JLabel DateandTime = new JLabel("");
		DateandTime.setForeground(Color.WHITE);
		DateandTime.setFont(new Font("Tahoma", Font.BOLD, 12));
		DateandTime.setBounds(668, 47, 193, 14);
		SteamPanel.add(DateandTime);

		JLabel lblXBotton = new JLabel("X");
		lblXBotton.setHorizontalAlignment(SwingConstants.CENTER);
		lblXBotton.setForeground(Color.WHITE);
		lblXBotton.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblXBotton.setBackground(Color.WHITE);

		lblXBotton.setBounds(871, 0, 29, 29);
		SteamPanel.add(lblXBotton);
		lblXBotton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				JDialog.setDefaultLookAndFeelDecorated(true);
				if (JOptionPane.showConfirmDialog(null, "Are you sure you want to close this application",
						"Confirmation", JOptionPane.YES_NO_OPTION) == 0)
					;
				table.this.dispose();
			}

			public void mouseEntered(MouseEvent e) {
				lblXBotton.setForeground(Color.RED);
			}

			public void mouseExited(MouseEvent e) {
				lblXBotton.setForeground(Color.WHITE);
			}

		});
		lblXBotton.setForeground(new Color(255, 255, 255));
		lblXBotton.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblXBotton.setHorizontalAlignment(SwingConstants.CENTER);
		lblXBotton.setBackground(new Color(255, 255, 255));

		JLabel txtName = new JLabel("Name : ");
		txtName.setForeground(Color.WHITE);
		txtName.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtName.setBounds(20, 133, 61, 29);
		getContentPane().add(txtName);

		textName = new JTextField();
		textName.setColumns(10);
		textName.setBounds(81, 138, 208, 20);
		PanelColor.add(textName);

		JLabel lblPhone = new JLabel("Phone # :");
		lblPhone.setForeground(Color.WHITE);
		lblPhone.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPhone.setBounds(10, 173, 61, 29);
		getContentPane().add(lblPhone);

		textPhone = new JTextField();
		textPhone.setColumns(10);
		textPhone.setBounds(81, 178, 208, 20);
		PanelColor.add(textPhone);

		JLabel txtAge = new JLabel("Age :");
		txtAge.setForeground(Color.WHITE);
		txtAge.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtAge.setBounds(21, 213, 61, 29);
		getContentPane().add(txtAge);

		textAge = new JTextField();
		textAge.setColumns(10);
		textAge.setBounds(81, 218, 208, 20);
		PanelColor.add(textAge);

		JLabel txtAddres = new JLabel("Address :");
		txtAddres.setForeground(Color.WHITE);
		txtAddres.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtAddres.setBounds(10, 253, 61, 29);
		getContentPane().add(txtAddres);

		textAdrress = new JTextField();
		textAdrress.setColumns(10);
		textAdrress.setBounds(81, 258, 208, 20);
		PanelColor.add(textAdrress);

		JLabel lblZip = new JLabel("Zip Code :");
		lblZip.setForeground(Color.WHITE);
		lblZip.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblZip.setBounds(10, 293, 61, 29);
		getContentPane().add(lblZip);

		textZip = new JTextField();
		textZip.setColumns(10);
		textZip.setBounds(81, 298, 208, 20);
		PanelColor.add(textZip);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(330, 113, 560, 264);
		PanelColor.add(scrollPane);

		model = new DefaultTableModel();
		model.addColumn("Name");
		model.addColumn("Age");
		model.addColumn("Phone");
		model.addColumn("Address");
		model.addColumn("Zipcode");

		model = new DefaultTableModel();

		addButton = new JButton("Add");
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] row = new String[5];
				row[0] = textName.getText();
				row[1] = textPhone.getText();
				row[2] = textAge.getText();
				row[3] = textAdrress.getText();
				row[4] = textZip.getText();
				model.addRow(row);
			}
		});

		editButton = new JButton("Edit");
		editButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int row = table.getSelectedRow();
				if (row >= 0) {
					model.setValueAt(textName.getText(), row, 0);
					model.setValueAt(textPhone.getText(), row, 1);
					model.setValueAt(textAge.getText(), row, 2);
					model.setValueAt(textAdrress.getText(), row, 3);
					model.setValueAt(textZip.getText(), row, 4);
				}
			}
		});

		deleteButton = new JButton("Delete");
		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int row = table.getSelectedRow();
				if (row >= 0) {
					model.removeRow(row);
				}
			}
		});

		JPanel buttonPanel = new JPanel();
		buttonPanel.add(addButton);
		buttonPanel.add(editButton);
		buttonPanel.add(deleteButton);
		add(buttonPanel, BorderLayout.SOUTH);

		// Set the JFrame size and make it visible
		setSize(600, 400);
		setVisible(true);
	}
}
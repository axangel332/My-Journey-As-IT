package Razonable_Alido;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ticket_Help_Edit_Delete extends JFrame {

	private JPanel contentPane;
	private JTextField ENTETI;
	private JTextField TFPname;
	private JTextField TFPCname;
	private JTextField TFPCnum;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ticket_Help_Edit_Delete frame = new Ticket_Help_Edit_Delete();
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
	public Ticket_Help_Edit_Delete() {
		setResizable(false);
		setTitle("Bus Ticket Help System");
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource(("/Buslogo.jpg"))));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				// display a JOptionPane with a confirmation message
				int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Confirm Exit",
						JOptionPane.YES_NO_OPTION);

				if (result == JOptionPane.YES_OPTION) {
					// if the user confirms, exit the application
					System.exit(0);
				} else {
					// if the user selects "No", do something else, like hide the window
					setVisible(false);
				}
			}
		});

		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 51, 0));
		panel.setBounds(0, 0, 434, 261);
		panel.setBorder(new LineBorder(new Color(255, 255, 0), 2));
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblEcolandBusTerminal = new JLabel(" Ecoland Bus Terminal Station");
		lblEcolandBusTerminal.setBounds(92, 7, 257, 23);
		lblEcolandBusTerminal.setForeground(Color.WHITE);
		lblEcolandBusTerminal.setFont(new Font("SimSun", Font.BOLD, 16));
		lblEcolandBusTerminal.setBorder(new LineBorder(new Color(255, 255, 0), 2));
		panel.add(lblEcolandBusTerminal);

		JLabel lblEnterNameTo = new JLabel("Enter name to Edit Ticket Information");
		lblEnterNameTo.setForeground(Color.WHITE);
		lblEnterNameTo.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblEnterNameTo.setBounds(10, 44, 233, 14);
		panel.add(lblEnterNameTo);

		ENTETI = new JTextField(15);
		ENTETI.addKeyListener(new KeyAdapter() {
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

		ENTETI.setFont(new Font("SansSerif", Font.PLAIN, 12));
		ENTETI.setBounds(238, 41, 126, 20);
		panel.add(ENTETI);

		JLabel FamilyContName = new JLabel("Family Contact Name");
		FamilyContName.setForeground(Color.WHITE);
		FamilyContName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		FamilyContName.setBounds(25, 120, 131, 14);
		panel.add(FamilyContName);

		TFPname = new JTextField(15);
		TFPname.addKeyListener(new KeyAdapter() {
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

		TFPname.setFont(new Font("SansSerif", Font.PLAIN, 12));
		TFPname.setBounds(156, 117, 170, 20);
		panel.add(TFPname);

		JLabel Name = new JLabel("Name");
		Name.setForeground(Color.WHITE);
		Name.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		Name.setBounds(113, 95, 38, 14);
		panel.add(Name);

		TFPCname = new JTextField(15);
		TFPCname.addKeyListener(new KeyAdapter() {
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

		TFPCname.setFont(new Font("SansSerif", Font.PLAIN, 12));
		TFPCname.setBounds(156, 89, 170, 20);
		panel.add(TFPCname);

		JLabel FamilyContNum = new JLabel("Family Contact Number");
		FamilyContNum.setForeground(Color.WHITE);
		FamilyContNum.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		FamilyContNum.setBounds(10, 147, 170, 14);
		panel.add(FamilyContNum);

		TFPCnum = new JTextField(15);
		TFPCnum.addKeyListener(new KeyAdapter() {
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

		TFPCnum.setFont(new Font("SansSerif", Font.PLAIN, 12));
		TFPCnum.setBounds(156, 145, 170, 20);
		panel.add(TFPCnum);

		JButton saveButton = new JButton("Save Ticket");
		saveButton.setVerticalAlignment(SwingConstants.TOP);
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (!ENTETI.getText().isEmpty()) {
						File file = new File("tickets.txt");
						BufferedReader reader = new BufferedReader(new FileReader(file));
						String line;
						String input = "";
						boolean found = false;
						while ((line = reader.readLine()) != null) {
							String[] fields = line.split("\\|");
							if (fields[0].equals(ENTETI.getText())) {
								found = true;
								fields[0] = TFPCname.getText();
								fields[1] = TFPname.getText();
								fields[2] = TFPCnum.getText();

								input += fields[0] + "|" + fields[1] + "|" + fields[2] + "\n";
							} else {
								input += line + "\n";
							}
						}
						reader.close();
						if (found) {
							FileWriter writer = new FileWriter(file);
							writer.write(input);
							writer.close();

							ENTETI.setText("");
							TFPCname.setText("");
							TFPname.setText("");
							TFPCnum.setText("");

							JOptionPane.showMessageDialog(null, "Data edited successfully", "Bus Ticket System",
									JOptionPane.INFORMATION_MESSAGE);
						} else {
							JOptionPane.showMessageDialog(null, "Data not found!", "Bus Ticket System",
									JOptionPane.ERROR_MESSAGE);
						}
					} else {
						JOptionPane.showMessageDialog(null, "Error! Please enter a name.", "Bus Ticket System",
								JOptionPane.ERROR_MESSAGE);
					}
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Error! Unable to edit data", "Bus Ticket System",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		saveButton.setVerticalAlignment(SwingConstants.TOP);
		saveButton.setFont(new Font("Sitka Text", Font.PLAIN, 12));
		saveButton.setBackground(Color.WHITE);
		saveButton.setBounds(125, 175, 117, 20);
		panel.add(saveButton);

		JButton deleteButton = new JButton("Delete Ticket");
		deleteButton.setVerticalAlignment(SwingConstants.TOP);
		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (!ENTETI.getText().isEmpty()) {
						File file = new File("tickets.txt");
						BufferedReader reader = new BufferedReader(new FileReader(file));
						String line;
						String input = "";
						boolean found = false;
						while ((line = reader.readLine()) != null) {
							String[] fields = line.split("\\|");
							if (fields[0].equals(ENTETI.getText())) {
								found = true;
							} else {
								input += line + "\n";
							}
						}
						reader.close();
						if (found) {
							FileWriter writer = new FileWriter(file);
							writer.write(input);
							writer.close();

							ENTETI.setText("");
							TFPCname.setText("");
							TFPname.setText("");
							TFPCnum.setText("");

							JOptionPane.showMessageDialog(null, "Data deleted successfully", "Bus Ticket System",
									JOptionPane.INFORMATION_MESSAGE);
						} else {
							JOptionPane.showMessageDialog(null, "Data not found!", "Bus Ticket System",
									JOptionPane.ERROR_MESSAGE);
						}
					} else {
						JOptionPane.showMessageDialog(null, "Error! Please enter a name.", "Bus Ticket System",
								JOptionPane.ERROR_MESSAGE);
					}
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Error! Unable to delete data", "Bus Ticket System",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		deleteButton.setVerticalAlignment(SwingConstants.TOP);
		deleteButton.setFont(new Font("Sitka Text", Font.PLAIN, 12));
		deleteButton.setBackground(Color.WHITE);
		deleteButton.setBounds(250, 175, 117, 20);
		panel.add(deleteButton);

		JButton btnEnter = new JButton("Ok");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean found = false;
				try (BufferedReader br = new BufferedReader(new FileReader("tickets.txt"))) {
					String line;
					while ((line = br.readLine()) != null) {
						String[] fields = line.split("\\|");
						if (fields[0].equals(ENTETI.getText())) {
							TFPCname.setText(fields[0]);
							TFPname.setText(fields[1]);
							TFPCnum.setText(fields[2]);
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

		btnEnter.setVerticalAlignment(SwingConstants.TOP);
		btnEnter.setFont(new Font("Sitka Text", Font.PLAIN, 12));
		btnEnter.setBackground(Color.WHITE);
		btnEnter.setBounds(370, 40, 54, 20);
		panel.add(btnEnter);

		JButton BackButton = new JButton("Back");
		BackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Ticket_Help_Edit_Delete.this.dispose();
				MainMenu MainB = new MainMenu();
				MainB.setVisible(true);
			}
		});
		BackButton.setVerticalAlignment(SwingConstants.TOP);
		BackButton.setFont(new Font("Sitka Text", Font.PLAIN, 11));
		BackButton.setBackground(Color.WHITE);
		BackButton.setBounds(364, 227, 60, 23);
		panel.add(BackButton);

	}
}

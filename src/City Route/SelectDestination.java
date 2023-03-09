package Razonable_Alido;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileWriter;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class SelectDestination extends JFrame {

	private JPanel contentPane;
	private double fare = 0;
	private JTextField TFfare;
	private JTextField TFAmount;
	private JTextField TFChange;
	private static String finalSelectedItem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelectDestination frame = new SelectDestination();
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
	public SelectDestination() {
		setResizable(false);
		setTitle("Bus Ticket System");
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource(("/Buslogo.jpg"))));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 210);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 51, 0));
		panel.setBounds(0, 0, 434, 171);
		panel.setBorder(new LineBorder(new Color(255, 255, 0), 2));
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel PurchaseATicket = new JLabel("  Ecoland Bus Terminal Station");
		PurchaseATicket.setForeground(Color.WHITE);
		PurchaseATicket.setFont(new Font("SimSun", Font.BOLD, 16));
		PurchaseATicket.setBorder(new LineBorder(new Color(255, 255, 0), 2));
		PurchaseATicket.setBounds(64, 10, 285, 25);
		panel.add(PurchaseATicket);

		JLabel SelectLocation = new JLabel("Select Location");
		SelectLocation.setForeground(Color.WHITE);
		SelectLocation.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		SelectLocation.setBounds(10, 47, 132, 14);
		panel.add(SelectLocation);

		String[] Route1 = { "", "Quezon Blvd", "Mabini Public Market", "121 Aurora St", "Ramon Magsaysay Park", "Agdao",
				"R.Castillo St.", "Daang Maharlika Hwy", "J.P Laurel Ave", "Sasa Barge", "Osmena", "Panacan",
				"Ilang OverPass", "Tibungco Gaisano Mall", "Bunawan Proper", "Lasang OverPass", "Panabo Terminal" };

		JComboBox<Object> comboBox = new JComboBox<Object>(Route1);
		comboBox.setBackground(Color.WHITE);
		comboBox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String selectedItem = comboBox.getSelectedItem().toString();

				switch (selectedItem) {
				case "":
					fare = 0.0;
					break;

				case "Quezon Blvd":
					fare = 20.0;
					break;

				case "Mabini Public Market":
					fare = 22.0;
					break;

				case "121 Aurora St":
					fare = 25.0;
					break;

				case "Ramon Magsaysay Park":
					fare = 26.0;
					break;

				case "Agdao":
					fare = 27.0;
					break;

				case "R.Castillo St.":
					fare = 28.0;
					break;

				case "Daang Maharlika Hwy":
					fare = 30.0;
					break;

				case "J.P Laurel Ave":
					fare = 32.0;
					break;

				case "Sasa Barge":
					fare = 35.0;
					break;

				case "Osmena":
					fare = 34.0;
					break;

				case "Panacan":
					fare = 42.0;
					break;

				case "Ilang OverPass":
					fare = 45.0;
					break;

				case "Tibungco Gaisano Mall":
					fare = 47.0;
					break;

				case "Bunawan Proper":
					fare = 50.0;
					break;

				case "Lasang OverPass":
					fare = 55.0;
					break;

				case "Panabo Terminal":
					fare = 60.0;
					break;

				}

				TFfare.setText(String.format("%.2f", fare));

			}
		});
		comboBox.setFont(new Font("Yu Gothic UI", Font.PLAIN, 13));
		comboBox.setMaximumRowCount(17);
		comboBox.setBounds(70, 70, 160, 22);
		panel.add(comboBox);

		JLabel Rroute1 = new JLabel("ROUTE 1");
		Rroute1.setForeground(new Color(255, 255, 255));
		Rroute1.setFont(new Font("Tahoma", Font.BOLD, 13));
		Rroute1.setBounds(10, 75, 74, 14);
		panel.add(Rroute1);

		JLabel Rroute2 = new JLabel("ROUTE 2");
		Rroute2.setForeground(Color.WHITE);
		Rroute2.setFont(new Font("Tahoma", Font.BOLD, 13));
		Rroute2.setBounds(10, 107, 74, 14);
		panel.add(Rroute2);

		String[] Route2 = { "", "Ma-a", "Leon Garcia St.", "Agdao FlyOver", "Cabaguio Ave.", "SPMC", "Dumanlas Rd",
				"Buhangin Gym", "COA Buhangin", "International Airport", "Depot", "Panacan", "Ilang OverPass",
				"Tibungco Gaisano Mall", "Bunawan Proper", "Lasang OverPass", "Panabo Terminal" };

		JComboBox<Object> comboBox1 = new JComboBox<Object>(Route2);
		comboBox1.setBackground(Color.WHITE);
		comboBox1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String selectedItem = comboBox1.getSelectedItem().toString();

				switch (selectedItem) {

				case "":
					fare = 0.0;
					break;

				case "Ma-a":
					fare = 20.0;
					break;

				case "Leon Garcia St.":
					fare = 23.0;
					break;

				case "Agdao FlyOver":
					fare = 25.0;
					break;

				case "Cabaguio Ave.":
					fare = 27.0;
					break;

				case "SPMC":
					fare = 28.0;
					break;

				case "Dumanlas Rd":
					fare = 29.0;
					break;

				case "Buhangin Gym":
					fare = 32.0;
					break;

				case "COA Buhangin":
					fare = 34.0;
					break;

				case "International Airport":
					fare = 39.0;
					break;

				case "Depot":
					fare = 41.0;
					break;

				case "Panacan":
					fare = 42.0;
					break;

				case "Ilang OverPass":
					fare = 45.0;
					break;

				case "Tibungco Gaisano Mall":
					fare = 47.0;
					break;

				case "Bunawan Proper":
					fare = 50.0;
					break;

				case "Lasang OverPass":
					fare = 55.0;
					break;

				case "Panabo Terminal":
					fare = 60.0;
					break;

				}

				TFfare.setText(String.format("%.2f", fare));
			}
		});
		comboBox1.setMaximumRowCount(17);
		comboBox1.setFont(new Font("Yu Gothic UI", Font.PLAIN, 13));
		comboBox1.setBackground(Color.WHITE);
		comboBox1.setBounds(70, 103, 160, 22);
		panel.add(comboBox1);

		JLabel Ffare = new JLabel("Fare");
		Ffare.setForeground(new Color(255, 255, 255));
		Ffare.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		Ffare.setBounds(10, 140, 46, 14);
		panel.add(Ffare);

		TFfare = new JTextField(10);
		TFfare.setEditable(false);
		TFfare.setBounds(43, 138, 52, 20);
		panel.add(TFfare);

		JLabel Enteramount = new JLabel("Enter Amount");
		Enteramount.setForeground(new Color(255, 255, 255));
		Enteramount.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		Enteramount.setBounds(250, 48, 99, 14);
		panel.add(Enteramount);

		TFAmount = new JTextField(10);
		TFAmount.addKeyListener(new KeyListener() {
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
		TFAmount.setBounds(348, 45, 52, 20);
		panel.add(TFAmount);

		JLabel Changekambyo = new JLabel("Change");
		Changekambyo.setForeground(new Color(255, 255, 255));
		Changekambyo.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		Changekambyo.setBounds(250, 78, 99, 18);
		panel.add(Changekambyo);

		TFChange = new JTextField(10);
		TFChange.setForeground(Color.RED);
		TFChange.setEditable(false);
		TFChange.setBounds(348, 78, 52, 20);
		panel.add(TFChange);

		JButton Paybutton = new JButton("Pay");
		Paybutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {

					if (!TFfare.getText().isEmpty() && !TFAmount.getText().isEmpty()) {

						Double famt = Double.parseDouble(TFfare.getText());
						Double amt = Double.parseDouble(TFAmount.getText());

						if (amt >= famt) {

							Double change = amt - famt;
							TFChange.setText(String.format("%.2f", change));

							String selectedItem1 = comboBox1.getSelectedItem().toString();
							String selectedItem2 = comboBox.getSelectedItem().toString();

							finalSelectedItem = selectedItem1 + selectedItem2;

							JOptionPane.showMessageDialog(null, "Ticket Destination paid successfully",
									"Bus Ticket System", JOptionPane.INFORMATION_MESSAGE);
							String TicketDestination = TFfare.getText() + "|" + TFAmount.getText() + "|"
									+ finalSelectedItem + "\n";
							FileWriter writer2 = new FileWriter("TicketDestination.txt", true);
							writer2.write(TicketDestination);
							writer2.close();
							SelectDestination.this.dispose();
							PassengerTicket pt = new PassengerTicket();
							pt.setVisible(true);

						}

					} else {
						JOptionPane.showMessageDialog(null, "Error!", "Bus Ticket System", JOptionPane.ERROR_MESSAGE);
					}

				} catch (Exception ex) {
					ex.printStackTrace();
					System.out.println("Error: " + ex.getMessage());
				}
			}
		});

		Paybutton.setFont(new Font("Sitka Text", Font.PLAIN, 12));
		Paybutton.setBackground(Color.WHITE);
		Paybutton.setBounds(333, 105, 80, 20);
		panel.add(Paybutton);

	}
}

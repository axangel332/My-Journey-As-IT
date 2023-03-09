package Razonable_Alido;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PassengerTicket extends JFrame {

	private JPanel contentPane;
	private JTextField TFname;
	private JTextField FCTname;
	private JTextField FCTnum;
	private JTextField Pdestination;
	private JTextField CodeNum;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PassengerTicket frame = new PassengerTicket();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 * @throws IOException
	 */
	public PassengerTicket() throws IOException {
		JOptionPane.showMessageDialog(null,
				"NOTE: Please use the CODE Number to Enter Bus. \n " + "                            Thank you!", "NOTE",
				JOptionPane.INFORMATION_MESSAGE);

		setResizable(false);
		setTitle("Bus Ticket System");
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource(("/Buslogo.jpg"))));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 265);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?",
						"Passenger Ticket Exit", JOptionPane.YES_NO_OPTION);

				if (result == JOptionPane.YES_OPTION) {
					System.exit(0);
				}

			}
		});

		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 51, 0));
		panel.setBounds(0, 0, 434, 226);
		panel.setBorder(new LineBorder(new Color(255, 255, 0), 2));
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel PurchaseATicket = new JLabel("  Ecoland Bus Terminal Station");
		PurchaseATicket.setForeground(Color.WHITE);
		PurchaseATicket.setFont(new Font("SimSun", Font.BOLD, 16));
		PurchaseATicket.setBorder(new LineBorder(new Color(255, 255, 0), 2));
		PurchaseATicket.setBounds(80, 45, 285, 25);
		panel.add(PurchaseATicket);

		JLabel Bus6132Ticket = new JLabel("BUS 6132 TICKET ");
		Bus6132Ticket.setHorizontalAlignment(SwingConstants.CENTER);
		Bus6132Ticket.setForeground(new Color(255, 255, 255));
		Bus6132Ticket.setFont(new Font("Times New Roman", Font.BOLD, 17));
		Bus6132Ticket.setBorder(new LineBorder(new Color(255, 255, 0), 5));
		Bus6132Ticket.setBackground(Color.YELLOW);
		Bus6132Ticket.setBounds(0, 0, 434, 36);
		panel.add(Bus6132Ticket);

		JLabel Passengersname = new JLabel("Passenger's Name:");
		Passengersname.setForeground(new Color(255, 255, 255));
		Passengersname.setFont(new Font("Sitka Text", Font.PLAIN, 11));
		Passengersname.setBounds(10, 83, 130, 14);
		panel.add(Passengersname);

		TFname = new JTextField(10);
		try {
			BufferedReader br = new BufferedReader(new FileReader("tickets.txt"));
			String line;
			String latestLine = "";

			while ((line = br.readLine()) != null) {
				latestLine = line;
			}

			if (!latestLine.isEmpty()) {
				String[] f = latestLine.split("\\|");
				String Pname = f[0].trim();
				TFname.setText(Pname);
			}

			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		TFname.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 11));
		TFname.setEditable(false);
		TFname.setBounds(10, 100, 150, 20);
		panel.add(TFname);

		JLabel FamilyContName = new JLabel("Family Contact Name:");
		FamilyContName.setForeground(new Color(255, 255, 255));
		FamilyContName.setFont(new Font("Sitka Text", Font.PLAIN, 11));
		FamilyContName.setBounds(10, 128, 148, 14);
		panel.add(FamilyContName);

		FCTname = new JTextField(10);
		try {
			BufferedReader br1 = new BufferedReader(new FileReader("tickets.txt"));
			String line1;
			String latestLine1 = "";

			while ((line1 = br1.readLine()) != null) {
				latestLine1 = line1;
			}

			if (!latestLine1.isEmpty()) {
				String[] f = latestLine1.split("\\|");
				String Fcname = f[1].trim();
				FCTname.setText(Fcname);
			}

			br1.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		FCTname.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 11));
		FCTname.setEditable(false);
		FCTname.setColumns(10);
		FCTname.setBounds(10, 143, 150, 20);
		panel.add(FCTname);

		JLabel FamilyContNum = new JLabel("Family Contact Number:");
		FamilyContNum.setForeground(new Color(255, 255, 255));
		FamilyContNum.setFont(new Font("Sitka Text", Font.PLAIN, 11));
		FamilyContNum.setBounds(10, 173, 148, 14);
		panel.add(FamilyContNum);

		FCTnum = new JTextField(10);
		try {
			BufferedReader br2 = new BufferedReader(new FileReader("tickets.txt"));
			String line2;
			String latestLine2 = "";

			while ((line2 = br2.readLine()) != null) {
				latestLine2 = line2;
			}

			if (!latestLine2.isEmpty()) {
				String[] f = latestLine2.split("\\|");
				String Fcnum = f[2].trim();
				FCTnum.setText(Fcnum);
			}

			br2.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		FCTnum.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 11));
		FCTnum.setEditable(false);
		FCTnum.setColumns(10);
		FCTnum.setBounds(10, 187, 150, 20);
		panel.add(FCTnum);

		JLabel BusNumber = new JLabel("Bus Number: 6132");
		BusNumber.setForeground(new Color(255, 255, 255));
		BusNumber.setFont(new Font("Sitka Text", Font.BOLD, 11));
		BusNumber.setBounds(281, 81, 107, 14);
		panel.add(BusNumber);

		JLabel BusRoute1or2 = new JLabel("Bus Route: Route 1 / Route 2");
		BusRoute1or2.setForeground(new Color(255, 255, 255));
		BusRoute1or2.setFont(new Font("Sitka Text", Font.BOLD, 11));
		BusRoute1or2.setBounds(249, 103, 160, 14);
		panel.add(BusRoute1or2);

		JLabel FromECTerminal = new JLabel("From: Ecoland Terminal");
		FromECTerminal.setForeground(new Color(255, 255, 255));
		FromECTerminal.setFont(new Font("Sitka Text", Font.BOLD, 11));
		FromECTerminal.setBounds(249, 126, 148, 14);
		panel.add(FromECTerminal);

		JLabel To = new JLabel("To:");
		To.setForeground(new Color(255, 255, 255));
		To.setFont(new Font("Sitka Text", Font.BOLD, 11));
		To.setBounds(249, 146, 35, 14);
		panel.add(To);

		Pdestination = new JTextField(10);
		try {
			BufferedReader br4 = new BufferedReader(new FileReader("TicketDestination.txt"));
			String line4;
			String latestLine4 = "";

			while ((line4 = br4.readLine()) != null) {
				latestLine4 = line4;
			}

			if (!latestLine4.isEmpty()) {
				String[] f = latestLine4.split("\\|");
				String desti = f[2].trim();
				Pdestination.setText(desti);
			}

			br4.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		Pdestination.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 11));
		Pdestination.setEditable(false);
		Pdestination.setColumns(10);
		Pdestination.setBounds(271, 143, 153, 20);
		panel.add(Pdestination);

		JLabel CodeNumber = new JLabel("CODE NUMBER:");
		CodeNumber.setForeground(new Color(255, 255, 255));
		CodeNumber.setFont(new Font("Sitka Text", Font.BOLD, 11));
		CodeNumber.setBounds(249, 173, 86, 14);
		panel.add(CodeNumber);

		CodeNum = new JTextField(10);
		CodeNum.setFont(new Font("Serif", Font.BOLD, 14));
		CodeNum.setEditable(false);
		CodeNum.setBounds(341, 166, 35, 20);
		panel.add(CodeNum);

		String pin = generatePIN();
		CodeNum.setText(pin);

		JButton BackButton = new JButton("Back");
		BackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				PassengerTicket.this.dispose();
				MainMenu mainm = new MainMenu();
				mainm.setVisible(true);

			}
		});
		BackButton.setVerticalAlignment(SwingConstants.TOP);
		BackButton.setBackground(new Color(255, 255, 255));
		BackButton.setFont(new Font("Sitka Text", Font.PLAIN, 11));
		BackButton.setBounds(364, 192, 60, 23);
		panel.add(BackButton);
	}

	private String generatePIN() {
		Random random = new Random();
		int pin = random.nextInt(9000) + 1000;
		return String.valueOf(pin);
	}
}

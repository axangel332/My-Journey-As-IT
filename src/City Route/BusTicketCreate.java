package Razonable_Alido;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.FileWriter;

public class BusTicketCreate extends JFrame {

	private JPanel contentPane;
	private JTextField TFname;
	private JTextField TFcname;
	private JTextField TFcnum;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BusTicketCreate frame = new BusTicketCreate();
					JOptionPane.showMessageDialog(null,
							"NOTE: To those PWD (Person with Disabilities) or OAP (Old-Age Pensioner) Please ask an Employee for Assistance. \n "
							+ "                                                                                          Thank you!",
							"NOTE", JOptionPane.INFORMATION_MESSAGE);
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
	public BusTicketCreate() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource(("/Buslogo.jpg"))));
		setTitle("Create Bus Ticket");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 315);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 51, 0));
		panel.setBounds(0, 0, 304, 276);
		panel.setBorder(new LineBorder(new Color(255, 255, 0), 2));
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel PurchaseATicket = new JLabel("  Ecoland Bus Terminal Station");
		PurchaseATicket.setForeground(Color.WHITE);
		PurchaseATicket.setFont(new Font("SimSun", Font.BOLD, 16));
		PurchaseATicket.setBorder(new LineBorder(new Color(255, 255, 0), 2));
		PurchaseATicket.setBounds(10, 11, 285, 25);
		panel.add(PurchaseATicket);

		JLabel PurchaseText = new JLabel("PURCHASE A TICKET");
		PurchaseText.setForeground(Color.WHITE);
		PurchaseText.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		PurchaseText.setBounds(175, 76, 132, 14);
		panel.add(PurchaseText);

		JLabel Name = new JLabel("Name");
		Name.setForeground(Color.WHITE);
		Name.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		Name.setBounds(10, 77, 46, 14);
		panel.add(Name);

		TFname = new JTextField(15);
		TFname.addKeyListener(new KeyAdapter() {
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

		TFname.setFont(new Font("SansSerif", Font.PLAIN, 12));
		TFname.setBounds(10, 102, 170, 20);
		panel.add(TFname);

		JLabel FamilyContName = new JLabel("Family Contact Name");
		FamilyContName.setForeground(Color.WHITE);
		FamilyContName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		FamilyContName.setBounds(10, 133, 170, 14);
		panel.add(FamilyContName);

		TFcname = new JTextField(15);
		TFcname.addKeyListener(new KeyAdapter() {
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

		TFcname.setFont(new Font("SansSerif", Font.PLAIN, 12));
		TFcname.setBounds(10, 158, 170, 20);
		panel.add(TFcname);

		JLabel FamilyContNum = new JLabel("Family Contact Number");
		FamilyContNum.setForeground(Color.WHITE);
		FamilyContNum.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		FamilyContNum.setBounds(10, 189, 170, 14);
		panel.add(FamilyContNum);

		TFcnum = new JTextField(15);
		TFcnum.addKeyListener(new KeyAdapter() {
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
		TFcnum.setFont(new Font("SansSerif", Font.PLAIN, 12));
		TFcnum.setBounds(10, 214, 170, 20);
		panel.add(TFcnum);

		JLabel Busticketlogo = new JLabel("");
		Image busticketlogo = new ImageIcon(this.getClass().getResource("/busticketlogo.png")).getImage();
		Busticketlogo.setIcon(new ImageIcon(busticketlogo));
		Busticketlogo.setBounds(191, 93, 90, 85);
		panel.add(Busticketlogo);

		JButton Clear = new JButton("Clear");
		Clear.setVerticalAlignment(SwingConstants.TOP);
		Clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					TFname.setText("");
					TFcname.setText("");
					TFcnum.setText("");
				} catch (Exception F) {

				}
			}
		});
		Clear.setFont(new Font("Sitka Text", Font.PLAIN, 13));
		Clear.setBackground(Color.WHITE);
		Clear.setBounds(10, 245, 80, 20);
		panel.add(Clear);

		JButton Enterbutton = new JButton("Save");
		Enterbutton.setVerticalAlignment(SwingConstants.TOP);
		Enterbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (!TFname.getText().isEmpty() && !TFcname.getText().isEmpty()
							&& !TFcnum.getText().isEmpty()) {
						String data = TFname.getText() + "|" + TFcname.getText() + "|" + TFcnum.getText()
								+ "\n";
						FileWriter writer = new FileWriter("tickets.txt", true);
						writer.write(data);
						writer.close();
						JOptionPane.showMessageDialog(null, "Data saved successfully", "Bus Ticket System",
								JOptionPane.INFORMATION_MESSAGE);
						BusTicketCreate.this.dispose();
						SelectDestination SD = new SelectDestination();
						SD.setVisible(true);

					} else {
						JOptionPane.showMessageDialog(null, "Error!", "Bus Ticket System", JOptionPane.ERROR_MESSAGE);
					}

				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Error! Unable to save data", "Bus Ticket System",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		Enterbutton.setFont(new Font("Sitka Text", Font.PLAIN, 14));
		Enterbutton.setBackground(Color.WHITE);
		Enterbutton.setBounds(100, 245, 80, 20);
		panel.add(Enterbutton);

		JLabel dateandtime = new JLabel("DATE & TIME:");
		dateandtime.setForeground(Color.WHITE);
		dateandtime.setFont(new Font("SimSun", Font.BOLD, 14));
		dateandtime.setBounds(10, 47, 109, 25);
		panel.add(dateandtime);

		JLabel DateandTime = new JLabel("");
		DateandTime.setForeground(Color.WHITE);
		DateandTime.setFont(new Font("Sitka Small", Font.PLAIN, 12));
		DateandTime.setBounds(100, 53, 180, 14);
		panel.add(DateandTime);

		// FOR DIGITAL CLOCK
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
	}
}

package sheesh;

import java.awt.EventQueue;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class oopconcept extends JFrame {

	private JPanel SteamMenu;
	private Customer Customer;
	private Food_Product Food_Product;
	private Food_Supply Food_Supply;
	private Order_Details Order_Details;
	private Delivery Delivery;
	private Trasaction_Report Trasaction_Report;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					oopconcept frame = new oopconcept();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();

				}
			}
		});
	}

	public oopconcept() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 810, 600);
		SteamMenu = new JPanel();
		SteamMenu.setBackground(new Color(33, 35, 33));
		SteamMenu.setBorder(null);
		SteamMenu.setLayout(null);
		setContentPane(SteamMenu);

		Customer = new Customer();
		Customer.setBounds(0, 0, 577, 517);
		Food_Product = new Food_Product();
		Food_Supply = new Food_Supply();
		Order_Details = new Order_Details();
		Delivery = new Delivery();
		Trasaction_Report = new Trasaction_Report();

		JPanel SteamPanel = new JPanel();
		SteamPanel.setBackground(new Color(23, 26, 33));
		SteamPanel.setBounds(0, 0, 810, 72);
		SteamMenu.add(SteamPanel);
		SteamPanel.setLayout(null);

		JPanel SteamPanel_2 = new JPanel();
		SteamPanel_2.setBorder(null);
		SteamPanel_2.setBackground(new Color(43, 46, 55));
		SteamPanel_2.setBounds(0, 73, 214, 527);
		SteamMenu.add(SteamPanel_2);
		SteamPanel_2.setLayout(null);

		JPanel Customer_btn = new JPanel();
		Customer_btn.addMouseListener(new ButtonGames(Customer_btn) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(Customer);
			}
		});
		Customer_btn.setBackground(new Color(43, 46, 55));
		Customer_btn.setBounds(0, 42, 213, 52);
		SteamPanel_2.add(Customer_btn);
		Customer_btn.setLayout(null);

		JLabel lblFileWriter = new JLabel("Customer");
		lblFileWriter.setBounds(0, 0, 213, 52);
		Customer_btn.add(lblFileWriter);
		lblFileWriter.setForeground(Color.WHITE);
		lblFileWriter.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFileWriter.setHorizontalAlignment(SwingConstants.CENTER);

		JPanel Product_btn = new JPanel();
		Product_btn.addMouseListener(new ButtonGames(Product_btn) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(Food_Product);
			}

		});
		Product_btn.setLayout(null);
		Product_btn.setBackground(new Color(43, 46, 55));
		Product_btn.setBounds(0, 105, 213, 52);
		SteamPanel_2.add(Product_btn);

		JLabel lblPhonebook = new JLabel("Food Product");
		lblPhonebook.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhonebook.setForeground(Color.WHITE);
		lblPhonebook.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPhonebook.setBounds(0, 0, 213, 52);
		Product_btn.add(lblPhonebook);

		JPanel supply_btn = new JPanel();
		supply_btn.addMouseListener(new ButtonGames(supply_btn) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(Food_Supply);
			}
		});
		supply_btn.setLayout(null);
		supply_btn.setBackground(new Color(43, 46, 55));
		supply_btn.setBounds(0, 168, 213, 52);
		SteamPanel_2.add(supply_btn);

		JLabel DogPhoneBook = new JLabel("Food Supply");
		DogPhoneBook.setHorizontalAlignment(SwingConstants.CENTER);
		DogPhoneBook.setForeground(Color.WHITE);
		DogPhoneBook.setFont(new Font("Tahoma", Font.BOLD, 14));
		DogPhoneBook.setBounds(0, 0, 213, 52);
		supply_btn.add(DogPhoneBook);

		JPanel Order_btn = new JPanel();
		Order_btn.addMouseListener(new ButtonGames(Order_btn) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(Delivery);
			}

		});
		Order_btn.setLayout(null);
		Order_btn.setBackground(new Color(43, 46, 55));
		Order_btn.setBounds(0, 231, 213, 52);
		SteamPanel_2.add(Order_btn);

		JLabel lblOrderDetails = new JLabel("Order Details");
		lblOrderDetails.setBounds(0, 0, 213, 52);
		Order_btn.add(lblOrderDetails);
		lblOrderDetails.setHorizontalAlignment(SwingConstants.CENTER);
		lblOrderDetails.setForeground(Color.WHITE);
		lblOrderDetails.setFont(new Font("Tahoma", Font.BOLD, 14));

		JLabel SignOut = new JLabel("Sign Out");
		SignOut.setBounds(0, 464, 213, 52);
		SteamPanel_2.add(SignOut);
		SignOut.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				JDialog.setDefaultLookAndFeelDecorated(true);
				if (JOptionPane.showConfirmDialog(null,
						"This will log you out of steam. " + "\n" + "\n" + "Do you wish to continue?", "Confirmation",
						JOptionPane.YES_NO_OPTION) == 0)
					;
				oopLogin loginproject = new oopLogin();
				loginproject.setVisible(true);
				oopconcept.this.dispose();
			}

			public void mouseEntered(MouseEvent e) {
				SignOut.setForeground(Color.RED);
			}

			public void mouseExited(MouseEvent e) {
				SignOut.setForeground(Color.WHITE);

			}

		});
		SignOut.setHorizontalAlignment(SwingConstants.CENTER);
		SignOut.setForeground(Color.WHITE);
		SignOut.setFont(new Font("Tahoma", Font.BOLD, 14));

		JPanel panelMyProfile = new JPanel();
		panelMyProfile.setLayout(null);
		panelMyProfile.setBackground(new Color(43, 46, 55));
		panelMyProfile.setBounds(0, 464, 213, 52);
		SteamPanel_2.add(panelMyProfile);

		JPanel Trans_btn = new JPanel();
		Trans_btn.setLayout(null);
		Trans_btn.setBackground(new Color(43, 46, 55));
		Trans_btn.setBounds(0, 357, 213, 52);
		SteamPanel_2.add(Trans_btn);

		JLabel lblTransactionReport = new JLabel("Transaction Report");
		lblTransactionReport.addMouseListener(new ButtonGames(Trans_btn) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(Trasaction_Report);
			}

		});

		lblTransactionReport.setBounds(0, 0, 213, 52);
		Trans_btn.add(lblTransactionReport);
		lblTransactionReport.setHorizontalAlignment(SwingConstants.CENTER);
		lblTransactionReport.setForeground(Color.WHITE);
		lblTransactionReport.setFont(new Font("Tahoma", Font.BOLD, 14));

		JPanel Delivery_btn = new JPanel();
		Delivery_btn.setLayout(null);
		Delivery_btn.setBackground(new Color(43, 46, 55));
		Delivery_btn.setBounds(0, 294, 213, 52);
		SteamPanel_2.add(Delivery_btn);

		JLabel lbloop = new JLabel("Delivery");
		lbloop.addMouseListener(new ButtonGames(Delivery_btn) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(Delivery);
			}

		});

		lbloop.setBounds(0, 0, 213, 52);
		Delivery_btn.add(lbloop);
		lbloop.setHorizontalAlignment(SwingConstants.CENTER);
		lbloop.setForeground(Color.WHITE);
		lbloop.setFont(new Font("Tahoma", Font.BOLD, 14));
		setLocationRelativeTo(null);

		JLabel lblXBotton = new JLabel("X");
		lblXBotton.setBounds(781, 0, 29, 29);
		SteamPanel.add(lblXBotton);
		lblXBotton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				JDialog.setDefaultLookAndFeelDecorated(true);
				if (JOptionPane.showConfirmDialog(null, "Are you sure you want to close this application",
						"Confirmation", JOptionPane.YES_NO_OPTION) == 0)
					;
				oopconcept.this.dispose();
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

		JLabel DateandTime = new JLabel("");
		DateandTime.setBounds(588, 47, 193, 14);
		SteamPanel.add(DateandTime);
		DateandTime.setForeground(Color.WHITE);
		DateandTime.setFont(new Font("Tahoma", Font.BOLD, 12));

		JLabel Title = new JLabel("STATIC VOID / FOOD DELIVERY");
		Title.setFont(new Font("Tahoma", Font.BOLD, 25));
		Title.setForeground(new Color(255, 255, 255));
		Title.setBounds(24, 22, 508, 50);
		SteamPanel.add(Title);

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

		JPanel ContentMain = new JPanel();
		ContentMain.setBorder(null);
		ContentMain.setBackground(new Color(33, 35, 35));
		ContentMain.setBounds(223, 83, 577, 406);
		SteamMenu.add(ContentMain);
		ContentMain.setLayout(null);

		ContentMain.add(Customer);
		ContentMain.add(Food_Product);
		ContentMain.add(Food_Supply);
		ContentMain.add(Order_Details);
		ContentMain.add(Delivery);
		ContentMain.add(Trasaction_Report);

		menuClicked(ContentMain);

	}

	public void menuClicked(JPanel ContentMain) {

		Customer.setVisible(false);
		Food_Product.setVisible(false);
		Food_Supply.setVisible(false);
		Order_Details.setVisible(false);
		Delivery.setVisible(false);
		Trasaction_Report.setVisible(false);
		
		ContentMain.setVisible(true);
	}

	class ButtonGames extends MouseAdapter {
		JPanel Menu;

		public ButtonGames(JPanel Menu) {
			this.Menu = Menu;
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			Menu.setBackground(new Color(112, 128, 144));
		}

		@Override
		public void mousePressed(MouseEvent e) {
			Menu.setBackground(new Color(33, 35, 35));
		}

		@Override
		public void mouseExited(MouseEvent e) {
			Menu.setBackground(new Color(43, 46, 55));
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			Menu.setBackground(new Color(112, 128, 144));
		}
	}
}
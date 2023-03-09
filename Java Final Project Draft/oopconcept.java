package oop;

import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.Timer;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class oopconcept extends JFrame {

	private JPanel SteamMenu;
	private panelFileWriter panelFileWriter;
	private PhoneBook PhoneBook;
	private Calculator Calculator;
	private oop3 oop3;

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
		setBounds(100, 100, 810, 500);
		SteamMenu = new JPanel();
		SteamMenu.setBackground(new Color(33, 35, 33));
		SteamMenu.setBorder(null);
		SteamMenu.setLayout(null);
		setContentPane(SteamMenu);

		panelFileWriter = new panelFileWriter();
		PhoneBook = new PhoneBook();
		Calculator = new Calculator();
		oop3 = new oop3();

		JPanel SteamPanel = new JPanel();
		SteamPanel.setBackground(new Color(23, 26, 33));
		SteamPanel.setBounds(0, 0, 810, 72);
		SteamMenu.add(SteamPanel);
		SteamPanel.setLayout(null);

		JPanel SteamPanel_2 = new JPanel();
		SteamPanel_2.setBorder(null);
		SteamPanel_2.setBackground(new Color(43, 46, 55));
		SteamPanel_2.setBounds(0, 73, 213, 427);
		SteamMenu.add(SteamPanel_2);
		SteamPanel_2.setLayout(null);

		JPanel FileWriter = new JPanel();
		FileWriter.addMouseListener(new ButtonGames(FileWriter) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelFileWriter);
			}
		});
		FileWriter.setBackground(new Color(43, 46, 55));
		FileWriter.setBounds(0, 42, 213, 52);
		SteamPanel_2.add(FileWriter);
		FileWriter.setLayout(null);

		JLabel lblFileWriter = new JLabel("File Writer");
		lblFileWriter.setBounds(0, 0, 213, 52);
		FileWriter.add(lblFileWriter);
		lblFileWriter.setForeground(Color.WHITE);
		lblFileWriter.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFileWriter.setHorizontalAlignment(SwingConstants.CENTER);

		JPanel panelValorant = new JPanel();
		panelValorant.addMouseListener(new ButtonGames(panelValorant) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(PhoneBook);
			}

		});
		panelValorant.setLayout(null);
		panelValorant.setBackground(new Color(43, 46, 55));
		panelValorant.setBounds(0, 105, 213, 52);
		SteamPanel_2.add(panelValorant);

		JLabel lblPhonebook = new JLabel("PhoneBook");
		lblPhonebook.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhonebook.setForeground(Color.WHITE);
		lblPhonebook.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPhonebook.setBounds(0, 0, 213, 52);
		panelValorant.add(lblPhonebook);

		JPanel panelCalcu = new JPanel();
		panelCalcu.addMouseListener(new ButtonGames(panelCalcu) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(Calculator);
			}
		});
		panelCalcu.setLayout(null);
		panelCalcu.setBackground(new Color(43, 46, 55));
		panelCalcu.setBounds(0, 168, 213, 52);
		SteamPanel_2.add(panelCalcu);

		JLabel DogPhoneBook = new JLabel("Calculator");
		DogPhoneBook.setHorizontalAlignment(SwingConstants.CENTER);
		DogPhoneBook.setForeground(Color.WHITE);
		DogPhoneBook.setFont(new Font("Tahoma", Font.BOLD, 14));
		DogPhoneBook.setBounds(0, 0, 213, 52);
		panelCalcu.add(DogPhoneBook);

		JPanel oob3 = new JPanel();
		oob3.addMouseListener(new ButtonGames(oob3) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(oop3);
			}
		});
		oob3.setLayout(null);
		oob3.setBackground(new Color(43, 46, 55));
		oob3.setBounds(0, 231, 213, 52);
		SteamPanel_2.add(oob3);

		JLabel lbloop = new JLabel("OOP");
		lbloop.setHorizontalAlignment(SwingConstants.CENTER);
		lbloop.setForeground(Color.WHITE);
		lbloop.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbloop.setBounds(0, 0, 213, 52);
		oob3.add(lbloop);

		JPanel panelMyProfile = new JPanel();
		panelMyProfile.setLayout(null);
		panelMyProfile.setBackground(new Color(43, 46, 55));
		panelMyProfile.setBounds(0, 294, 213, 52);
		SteamPanel_2.add(panelMyProfile);

		JLabel SignOut = new JLabel("Sign Out");
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

		SignOut.setBounds(0, 0, 213, 52);
		panelMyProfile.add(SignOut);
		SignOut.setHorizontalAlignment(SwingConstants.CENTER);
		SignOut.setForeground(Color.WHITE);
		SignOut.setFont(new Font("Tahoma", Font.BOLD, 14));
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
		
		JLabel Title = new JLabel("FINAL PROJECT");
		Title.setFont(new Font("Tahoma", Font.BOLD, 20));
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

		ContentMain.add(panelFileWriter);
		ContentMain.add(PhoneBook);
		ContentMain.add(Calculator);
		ContentMain.add(oop3);

		menuClicked(ContentMain);

	}

	public void menuClicked(JPanel ContentMain) {

		panelFileWriter.setVisible(false);
		PhoneBook.setVisible(false);
		Calculator.setVisible(false);
		oop3.setVisible(false);

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
package cce;

import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Menu extends JFrame {

	private Image img_logo = new ImageIcon(LoginProjectSumalan.class.getResource("rex/Steam_logo.png")).getImage()
			.getScaledInstance(180, 70, Image.SCALE_SMOOTH);

	private JPanel SteamMenu;
	private panelValorant panelValorants;
	private panelDota2 panelDota2s;
	private panelAxie panelAxies;
	private panelGTA panelGTAs;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();

				}
			}
		});
	}

	public Menu() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 810, 500);
		SteamMenu = new JPanel();
		SteamMenu.setBackground(new Color(33, 35, 33));
		SteamMenu.setBorder(null);
		SteamMenu.setLayout(null);
		setContentPane(SteamMenu);
		SteamMenu.setLayout(null);
		
		panelValorants = new panelValorant();
		panelDota2s = new panelDota2();
		panelAxies = new panelAxie();
		panelGTAs = new panelGTA();
		
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

		JPanel panelDota2 = new JPanel();
		panelDota2.addMouseListener(new ButtonGames(panelDota2){
			@Override
			public void mouseClicked(MouseEvent e) {
			menuClicked(panelDota2s);
	}
	});
		panelDota2.setBackground(new Color(43, 46, 55));
		panelDota2.setBounds(0, 42, 213, 52);
		SteamPanel_2.add(panelDota2);
		panelDota2.setLayout(null);

		JLabel Dota = new JLabel("Dota 2");
		Dota.setBounds(0, 0, 213, 52);
		panelDota2.add(Dota);
		Dota.setForeground(Color.WHITE);
		Dota.setFont(new Font("Tahoma", Font.BOLD, 14));
		Dota.setHorizontalAlignment(SwingConstants.CENTER);

		JPanel panelValorant = new JPanel();
		panelValorant.addMouseListener(new ButtonGames(panelValorant) {	
				@Override
				public void mouseClicked(MouseEvent e) {
				menuClicked(panelValorants);
		}
			
		});
		panelValorant.setLayout(null);
		panelValorant.setBackground(new Color(43, 46, 55));
		panelValorant.setBounds(0, 105, 213, 52);
		SteamPanel_2.add(panelValorant);

		JLabel lblValorant = new JLabel("Valorant");
		lblValorant.setHorizontalAlignment(SwingConstants.CENTER);
		lblValorant.setForeground(Color.WHITE);
		lblValorant.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblValorant.setBounds(0, 0, 213, 52);
		panelValorant.add(lblValorant);

		JPanel panelAxie = new JPanel();
		panelAxie.addMouseListener(new ButtonGames(panelAxie) {
				@Override
				public void mouseClicked(MouseEvent e) {
				menuClicked(panelAxies);
		}
		});
		panelAxie.setLayout(null);
		panelAxie.setBackground(new Color(43, 46, 55));
		panelAxie.setBounds(0, 168, 213, 52);
		SteamPanel_2.add(panelAxie);

		JLabel lblAxieInfinite = new JLabel(" Axie Infinite");
		lblAxieInfinite.setHorizontalAlignment(SwingConstants.CENTER);
		lblAxieInfinite.setForeground(Color.WHITE);
		lblAxieInfinite.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAxieInfinite.setBounds(0, 0, 213, 52);
		panelAxie.add(lblAxieInfinite);

		JPanel panelGTA = new JPanel();
		panelGTA.addMouseListener(new ButtonGames(panelGTA){
			@Override
			public void mouseClicked(MouseEvent e) {
			menuClicked(panelGTAs);
	}
	});
		panelGTA.setLayout(null);
		panelGTA.setBackground(new Color(43, 46, 55));
		panelGTA.setBounds(0, 231, 213, 52);
		SteamPanel_2.add(panelGTA);

		JLabel lblGta = new JLabel("GTA 5");
		lblGta.setHorizontalAlignment(SwingConstants.CENTER);
		lblGta.setForeground(Color.WHITE);
		lblGta.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblGta.setBounds(0, 0, 213, 52);
		panelGTA.add(lblGta);

		JPanel panelMyProfile = new JPanel();
		panelMyProfile.setLayout(null);
		panelMyProfile.setBackground(new Color(43, 46, 55));
		panelMyProfile.setBounds(0, 294, 213, 52);
		SteamPanel_2.add(panelMyProfile);

		JLabel SignOut = new JLabel("Sign Out");
		SignOut.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				JDialog.setDefaultLookAndFeelDecorated(true);
				System.out.println("X botton clicked");
				if (JOptionPane.showConfirmDialog(null, "This will log you out of steam. "
						+ "\n"
						+ "\n" + "Do you wish to continue?",
						"Confirmation", JOptionPane.YES_NO_OPTION) == 0)
					;
				LoginProjectSumalan loginproject = new LoginProjectSumalan();
				loginproject.setVisible(true);
				Menu.this.dispose();
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
				System.out.println("X botton clicked");
				if (JOptionPane.showConfirmDialog(null, "Are you sure you want to close this application",
						"Confirmation", JOptionPane.YES_NO_OPTION) == 0)
					;
				System.out.println("***Application Close***");
				Menu.this.dispose();
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

		JLabel Logosteam = new JLabel("l");
		Logosteam.setBounds(0, 0, 181, 72);
		SteamPanel.add(Logosteam);
		Logosteam.setIcon(new ImageIcon(img_logo));
		
		JPanel ContentMain = new JPanel();
		ContentMain.setBorder(null);
		ContentMain.setBackground(new Color(33, 35, 35));
		ContentMain.setBounds(223, 83, 577, 406);
		SteamMenu.add(ContentMain);
		ContentMain.setLayout(null);
		
		ContentMain.add(panelValorants);
		ContentMain.add(panelDota2s);
		ContentMain.add(panelAxies);
		ContentMain.add(panelGTAs);
		
		menuClicked(ContentMain);
		

		
	}	
	public void menuClicked(JPanel ContentMain) {
		
		panelValorants.setVisible(false);
		panelDota2s.setVisible(false);
		panelAxies.setVisible(false);
		panelGTAs.setVisible(false);
		
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

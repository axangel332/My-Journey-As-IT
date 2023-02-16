package OOP;

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

public class oopconcept extends JFrame {


	private JPanel SteamMenu;
	private panelFileWriter panelFileWriter;
	private oop1 oop1;
	private oop2 oop2;
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
		SteamMenu.setLayout(null);
		
		panelFileWriter = new panelFileWriter();
		oop1 = new oop1();
		oop2 = new oop2();
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

		JPanel panelDota2 = new JPanel();
		panelDota2.addMouseListener(new ButtonGames(panelDota2){
			@Override
			public void mouseClicked(MouseEvent e) {
			menuClicked(panelFileWriter);
	}
	});
		panelDota2.setBackground(new Color(43, 46, 55));
		panelDota2.setBounds(0, 42, 213, 52);
		SteamPanel_2.add(panelDota2);
		panelDota2.setLayout(null);

		JLabel Dota = new JLabel("Settings");
		Dota.setBounds(0, 0, 213, 52);
		panelDota2.add(Dota);
		Dota.setForeground(Color.WHITE);
		Dota.setFont(new Font("Tahoma", Font.BOLD, 14));
		Dota.setHorizontalAlignment(SwingConstants.CENTER);

		JPanel panelValorant = new JPanel();
		panelValorant.addMouseListener(new ButtonGames(panelValorant) {	
				@Override
				public void mouseClicked(MouseEvent e) {
				menuClicked(oop1);
		}
			
		});
		panelValorant.setLayout(null);
		panelValorant.setBackground(new Color(43, 46, 55));
		panelValorant.setBounds(0, 105, 213, 52);
		SteamPanel_2.add(panelValorant);

		JLabel lblValorant = new JLabel("OOP1");
		lblValorant.setHorizontalAlignment(SwingConstants.CENTER);
		lblValorant.setForeground(Color.WHITE);
		lblValorant.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblValorant.setBounds(0, 0, 213, 52);
		panelValorant.add(lblValorant);

		JPanel panelAxie = new JPanel();
		panelAxie.addMouseListener(new ButtonGames(panelAxie) {
				@Override
				public void mouseClicked(MouseEvent e) {
				menuClicked(oop2);
		}
		});
		panelAxie.setLayout(null);
		panelAxie.setBackground(new Color(43, 46, 55));
		panelAxie.setBounds(0, 168, 213, 52);
		SteamPanel_2.add(panelAxie);

		JLabel lblAxieInfinite = new JLabel("OOP2");
		lblAxieInfinite.setHorizontalAlignment(SwingConstants.CENTER);
		lblAxieInfinite.setForeground(Color.WHITE);
		lblAxieInfinite.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAxieInfinite.setBounds(0, 0, 213, 52);
		panelAxie.add(lblAxieInfinite);

		JPanel panelGTA = new JPanel();
		panelGTA.addMouseListener(new ButtonGames(panelGTA){
			@Override
			public void mouseClicked(MouseEvent e) {
			menuClicked(oop3);
	}
	});
		panelGTA.setLayout(null);
		panelGTA.setBackground(new Color(43, 46, 55));
		panelGTA.setBounds(0, 231, 213, 52);
		SteamPanel_2.add(panelGTA);

		JLabel lblGta = new JLabel("OOP3");
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
				System.out.println("X botton clicked");
				if (JOptionPane.showConfirmDialog(null, "Are you sure you want to close this application",
						"Confirmation", JOptionPane.YES_NO_OPTION) == 0)
					;
				System.out.println("***Application Close***");
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

		
		JPanel ContentMain = new JPanel();
		ContentMain.setBorder(null);
		ContentMain.setBackground(new Color(33, 35, 35));
		ContentMain.setBounds(223, 83, 577, 406);
		SteamMenu.add(ContentMain);
		ContentMain.setLayout(null);
		
		ContentMain.add(panelFileWriter);
		ContentMain.add(oop1);
		ContentMain.add(oop2);
		ContentMain.add(oop3);
		
		menuClicked(ContentMain);
		

		
	}	
	public void menuClicked(JPanel ContentMain) {
		
		panelFileWriter.setVisible(false);
		oop1.setVisible(false);
		oop2.setVisible(false);
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

package cce;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class Menu extends JFrame {

	private JPanel SteamMenu;

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the frame.
	 */
	public Menu() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 810, 500);
		SteamMenu = new JPanel();
		SteamMenu.setBackground(new Color(23, 26, 33));
		SteamMenu.setBorder(null);
		SteamMenu.setLayout(null);

		setContentPane(SteamMenu);
		SteamMenu.setLayout(null);
		setLocationRelativeTo(null);
		
	}

}

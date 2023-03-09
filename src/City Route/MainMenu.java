package Razonable_Alido;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

public class MainMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
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
	public MainMenu() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource(("/Buslogo.jpg"))));
		setTitle("Davao City Bus Ticket System");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 370, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?",
						"Bus Ticket System Exit", JOptionPane.YES_NO_OPTION);

				if (result == JOptionPane.YES_OPTION) {
					System.exit(0);
				} else {
					setVisible(false);

				}
			}
		});

		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 51, 0));
		panel.setBounds(0, 0, 354, 261);
		contentPane.add(panel);
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(255, 255, 0), 2));

		JLabel textheader = new JLabel("WELCOME TO DAVAO CITY BUS");
		textheader.setBounds(55, 126, 252, 23);
		textheader.setForeground(new Color(255, 255, 100));
		textheader.setFont(new Font("Malgun Gothic", Font.BOLD, 16));
		panel.add(textheader);

		JButton Enterbutton = new JButton("ENTER");
		Enterbutton.setBounds(130, 160, 90, 25);
		Enterbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {

					MainMenu.this.dispose();
					BusTicketCreate BusTCreate = new BusTicketCreate();
					BusTCreate.setVisible(true);

				} catch (Exception F) {
				}
			}
		});
		Enterbutton.setForeground(new Color(0, 0, 0));
		Enterbutton.setBackground(new Color(255, 255, 100));
		Enterbutton.setBorder(null);
		Enterbutton.setFont(new Font("SansSerif", Font.BOLD, 15));
		panel.add(Enterbutton);

		JLabel buslogo = new JLabel("");
		Image bus = new ImageIcon(this.getClass().getResource("/bus1.png")).getImage();
		buslogo.setIcon(new ImageIcon(bus));
		buslogo.setBounds(110, -30, 127, 185);
		panel.add(buslogo);

		JButton Needhelpbuton = new JButton("Need help?");
		Needhelpbuton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {

					MainMenu.this.dispose();
					Ticket_Help_Edit_Delete thep = new Ticket_Help_Edit_Delete();
					thep.setVisible(true);

				} catch (Exception S) {

				}
			}
		});
		Needhelpbuton.setForeground(new Color(0, 0, 0));
		Needhelpbuton.setBounds(270, 225, 75, 23);
		Needhelpbuton.setBackground(new Color(255, 255, 100));
		Needhelpbuton.setBorder(null);
		Needhelpbuton.setFont(new Font("SansSerif", Font.BOLD, 12));
		panel.add(Needhelpbuton);
	}
}

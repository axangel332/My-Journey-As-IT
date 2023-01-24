package cce;

import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Image;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JDialog;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class LoginProjectSumalan extends JFrame {
	// Steam na logo
	private Image img_logo = new ImageIcon(LoginProjectSumalan.class.getResource("rex/Steam_logo.png")).getImage()
			.getScaledInstance(300, 100, Image.SCALE_SMOOTH);
	// Tao
	private Image img_User = new ImageIcon(LoginProjectSumalan.class.getResource("rex/Tao.png")).getImage()
			.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
	// Lock
	private Image img_Pass = new ImageIcon(LoginProjectSumalan.class.getResource("rex/Padlock.png")).getImage()
			.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
	// Susi
	private Image img_Login = new ImageIcon(LoginProjectSumalan.class.getResource("rex/Susi.png")).getImage()
			.getScaledInstance(30, 30, Image.SCALE_SMOOTH);

	private JPanel Background;
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	private JTextField txtSign;
	private JLabel lblLoginMessage = new JLabel("");
	private JLabel loginMassage = new JLabel("");
	private JLabel loginMassage2 = new JLabel("");

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginProjectSumalan frame = new LoginProjectSumalan();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public LoginProjectSumalan() {

		// Background
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		Background = new JPanel();
		Background.setBackground(new Color(23, 26, 33));
		Background.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setContentPane(Background);
		Background.setLayout(null);

		// Username
		JPanel Username = new JPanel();
		Username.setBorder(null);
		Username.setBackground(new Color(51, 53, 60));
		Username.setBounds(177, 209, 250, 40);
		Background.add(Username);
		Username.setLayout(null);

		txtUsername = new JTextField();
		txtUsername.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent e) {

				if (txtUsername.getText().equals("Username")) {
					txtUsername.setText("");
				} else {
					txtUsername.selectAll();
				}
			}

			public void focusLost(FocusEvent e) {
				if (txtUsername.getText().equals(""))
					txtUsername.setText("Username");
			}
		});
		txtUsername.setForeground(new Color(255, 255, 255));
		txtUsername.setBackground(new Color(53, 56, 60));
		txtUsername.setBorder(null);
		txtUsername.setText("Username");
		txtUsername.setBounds(10, 11, 170, 20);
		Username.add(txtUsername);
		txtUsername.setColumns(10);

		JLabel lblUserIcon = new JLabel("");
		lblUserIcon.setBounds(200, 0, 50, 40);
		Username.add(lblUserIcon);
		lblUserIcon.setIcon(new ImageIcon(img_User));

		// PASSWORD
		JPanel Password = new JPanel();
		Password.setBorder(null);
		Password.setBackground(new Color(51, 53, 61));
		Password.setForeground(new Color(0, 0, 0));
		Password.setBounds(177, 260, 250, 40);
		Background.add(Password);
		Password.setLayout(null);

		txtPassword = new JPasswordField();
		txtPassword.addFocusListener(new FocusAdapter() {

			public void focusGained(FocusEvent e) {
				if (txtPassword.getText().equals("Password")) {
					txtPassword.setEchoChar('●');
					txtPassword.setText("");
				} else {
					txtPassword.selectAll();
				}

			}

			public void focusLost(FocusEvent e) {
				if (txtPassword.getText().equals("")) {
					txtPassword.setText("Password");
					txtPassword.setEchoChar((char) 0);
				}
			}
		});
		txtPassword.setForeground(new Color(255, 255, 255));
		txtPassword.setBackground(new Color(53, 56, 60));
		txtPassword.setBorder(null);
		txtPassword.setEchoChar((char) 0);
		txtPassword.setText("Password");
		txtPassword.setBounds(10, 11, 170, 20);
		Password.add(txtPassword);

		JLabel lblPassIcon = new JLabel("");
		lblPassIcon.setBounds(200, 0, 50, 40);
		Password.add(lblPassIcon);
		lblPassIcon.setIcon(new ImageIcon(img_Pass));

		// LOGIN
		JPanel Login = new JPanel();
		Login.setBackground(new Color(31, 140, 254));
		Login.setBounds(177, 311, 250, 45);
		Background.add(Login);
		Login.setLayout(null);

		JLabel LoginBotton = new JLabel("Sign in");
		LoginBotton.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				JDialog.setDefaultLookAndFeelDecorated(true);
				if (txtUsername.getText().equals("admin") && txtPassword.getText().equals("admin123")) {
					loginMassage2.setText("Login Succesfully!");
					JOptionPane.showMessageDialog(null, "Login Succesfull!");
					// kung tama
				} else if (txtUsername.getText().equals("") || txtUsername.getText().equals("Username")
						|| txtPassword.getText().equals("") || txtPassword.getText().equals("Password")) {
					loginMassage.setText("Please Input Your User and Password!");
					System.out.println("***Login Click***");
				} else {
					loginMassage.setText("Username and Password didn't match");
				}

			}
		});
		LoginBotton.setBorder(null);

		LoginBotton.setHorizontalAlignment(SwingConstants.CENTER);
		LoginBotton.setForeground(new Color(255, 255, 255));
		LoginBotton.setFont(new Font("Arial", Font.BOLD, 14));
		LoginBotton.setBounds(0, 0, 250, 45);
		Login.add(LoginBotton);
		LoginBotton.setIcon(new ImageIcon(img_Login));

		//EXIT BUTTON
		JLabel lblXBotton = new JLabel("X");
		lblXBotton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				JDialog.setDefaultLookAndFeelDecorated(true);
				System.out.println("X botton clicked");
				if (JOptionPane.showConfirmDialog(null, "Are you sure you want to close this application",
						"Confirmation", JOptionPane.YES_NO_OPTION) == 0)
					;
				System.out.println("***Application Close***");
				LoginProjectSumalan.this.dispose();
			}

			public void mouseEntered(MouseEvent e) {
				lblXBotton.setForeground(Color.RED);

			}

			public void mouseExited(MouseEvent e) {
				lblXBotton.setForeground(Color.WHITE);

			}

		});
		lblXBotton.setBounds(571, 0, 29, 29);
		Background.add(lblXBotton);
		lblXBotton.setForeground(new Color(255, 255, 255));
		lblXBotton.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblXBotton.setHorizontalAlignment(SwingConstants.CENTER);
		lblXBotton.setBackground(new Color(255, 255, 255));

		JLabel lblLogo = new JLabel("");
		lblLogo.setBounds(146, 65, 416, 108);
		Background.add(lblLogo);
		lblLogo.setIcon(new ImageIcon(img_logo));

		txtSign = new JTextField();
		txtSign.setBorder(null);
		txtSign.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtSign.setForeground(new Color(30, 144, 255));
		txtSign.setText("SIGN IN WITH ACCOUNT NAME");
		txtSign.setBackground(new Color(23, 26, 33));
		txtSign.setBounds(177, 184, 223, 20);
		Background.add(txtSign);
		txtSign.setColumns(10);
		
		//Pag click sa Login Error
		loginMassage.setHorizontalTextPosition(SwingConstants.CENTER);
		loginMassage.setHorizontalAlignment(SwingConstants.CENTER);
		loginMassage.setFont(new Font("Arial", Font.BOLD, 12));
		loginMassage.setForeground(new Color(255, 0, 0));
		loginMassage.setBounds(177, 367, 250, 14);
		Background.add(loginMassage);
		
		//Pag click sa Login Succesfull
		loginMassage2.setHorizontalAlignment(SwingConstants.CENTER);
		loginMassage2.setHorizontalTextPosition(SwingConstants.CENTER);
		loginMassage2.setForeground(new Color(0, 255, 127));
		loginMassage2.setFont(new Font("Arial", Font.BOLD, 12));
		loginMassage2.setBounds(177, 367, 250, 14);
		Background.add(loginMassage2);

	}
}

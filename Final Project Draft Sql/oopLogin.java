package sheesh;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseEvent;
import javax.swing.JDialog;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class oopLogin extends JFrame {

	private JPanel UserLogin;
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	private JLabel lblLoginMessage = new JLabel("");
	private JLabel loginMassage = new JLabel("");
	private JLabel loginMassage2 = new JLabel("");
	private JButton LoginBotton;
	private JTextField txtUsename;
	private JTextField Userpass;
	private JLabel lblNewLabel;
	private JLabel txtUser;
	private JLabel txtPass;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					oopLogin frame = new oopLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public oopLogin() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		UserLogin = new JPanel();
		UserLogin.setBackground(new Color(23, 26, 33));
		UserLogin.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setContentPane(UserLogin);
		UserLogin.setLayout(null);

		// Username
		JPanel Username = new JPanel();
		Username.setBorder(null);
		Username.setBackground(new Color(51, 53, 60));
		Username.setBounds(53, 128, 318, 40);
		UserLogin.add(Username);
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
		txtUsername.setBackground(new Color(51, 54, 61));
		txtUsername.setBorder(null);
		txtUsername.setText("Username");
		txtUsername.setBounds(10, 11, 170, 20);
		Username.add(txtUsername);
		txtUsername.setColumns(10);
		
		txtUser = new JLabel("SIGN IN WITH ACCOUNT NAME");
		txtUser.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtUser.setForeground(new Color(30, 144, 255));
		txtUser.setBounds(53, 108, 184, 14);
		UserLogin.add(txtUser);

		// PASSWORD
		JPanel Password = new JPanel();
		Password.setBorder(null);
		Password.setBackground(new Color(51, 53, 61));
		Password.setForeground(new Color(0, 0, 0));
		Password.setBounds(53, 202, 318, 40);
		UserLogin.add(Password);
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
		txtPassword.setBackground(new Color(51, 54, 61));
		txtPassword.setBorder(null);
		txtPassword.setEchoChar((char) 0);
		txtPassword.setText("Password");
		txtPassword.setBounds(10, 11, 170, 20);
		Password.add(txtPassword);

		txtPass = new JLabel("Password");
		txtPass.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtPass.setForeground(Color.GRAY);
		txtPass.setBounds(53, 182, 184, 14);
		UserLogin.add(txtPass);

		// LOGIN

		LoginBotton = new JButton("Sign In");
		LoginBotton.setForeground(new Color(255, 255, 255));
		LoginBotton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		LoginBotton.setBackground(new Color(0, 128, 255));
		LoginBotton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDialog.setDefaultLookAndFeelDecorated(true);
				// kung tama
				if (txtUsername.getText().equals("admin") && txtPassword.getText().equals("admin123")) {
					loginMassage.setText(" ");
					loginMassage2.setText("Login Succesfully!");
					JOptionPane.showMessageDialog(null, "Login Succesfull!");
					oopconcept MenuLogin = new oopconcept();
					MenuLogin.setVisible(true);
					oopLogin.this.dispose();
					// kung walay gibutang
				} else if (txtUsername.getText().equals("") || txtUsername.getText().equals("Username")
						|| txtPassword.getText().equals("") || txtPassword.getText().equals("Password")) {
					loginMassage.setText("Please Input Your User and Password!");
					// kung mali
				} else {
					loginMassage.setText("Username and Password didn't match");

				}

			}

		});
		// EXIT BUTTON
		JLabel lblXBotton = new JLabel("X");
		lblXBotton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				JDialog.setDefaultLookAndFeelDecorated(true);
				if (JOptionPane.showConfirmDialog(null, "Are you sure you want to close this application",
						"Confirmation", JOptionPane.YES_NO_OPTION) == 0)
					;
				System.out.println("***Application Close***");
				oopLogin.this.dispose();
			}

			public void mouseEntered(MouseEvent e) {
				lblXBotton.setForeground(Color.RED);

			}

			public void mouseExited(MouseEvent e) {
				lblXBotton.setForeground(Color.WHITE);

			}

		});
		lblXBotton.setBounds(571, 0, 29, 29);
		UserLogin.add(lblXBotton);
		lblXBotton.setForeground(new Color(255, 255, 255));
		lblXBotton.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblXBotton.setHorizontalAlignment(SwingConstants.CENTER);
		lblXBotton.setBackground(new Color(255, 255, 255));

		LoginBotton.setBounds(100, 278, 213, 40);
		UserLogin.add(LoginBotton);

		// Pag click sa Login Error
		loginMassage.setHorizontalTextPosition(SwingConstants.CENTER);
		loginMassage.setHorizontalAlignment(SwingConstants.CENTER);
		loginMassage.setFont(new Font("Arial", Font.BOLD, 12));
		loginMassage.setForeground(new Color(255, 0, 0));
		loginMassage.setBounds(69, 328, 276, 14);
		UserLogin.add(loginMassage);

		// Pag click sa Login Succesfull
		loginMassage2.setHorizontalAlignment(SwingConstants.CENTER);
		loginMassage2.setHorizontalTextPosition(SwingConstants.CENTER);
		loginMassage2.setForeground(new Color(0, 255, 127));
		loginMassage2.setFont(new Font("Arial", Font.BOLD, 12));
		loginMassage2.setBounds(53, 329, 292, 14);
		UserLogin.add(loginMassage2);
		
		// Remember me botton check
		JCheckBox chckbxNewCheckBox = new JCheckBox("Remember me");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxNewCheckBox.setForeground(new Color(255, 255, 255));
		chckbxNewCheckBox.setBackground(new Color(23, 26, 33));
		chckbxNewCheckBox.setBounds(53, 249, 118, 23);
		UserLogin.add(chckbxNewCheckBox);

	}
}
package OOP;

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
import java.io.FileWriter;

import javax.swing.JDialog;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class oopLogin extends JFrame {

	private JPanel UserLogin;
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	private JTextField txtSign;
	private JLabel lblLoginMessage = new JLabel("");
	private JLabel loginMassage = new JLabel("");
	private JLabel loginMassage2 = new JLabel("");
	private JButton LoginBotton;
	private JButton Exit;
	private JTextField txtUsename;
	private JTextField Userpass;

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
		setBounds(100, 100, 500, 400);
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
		Username.setBounds(158, 142, 250, 40);
		UserLogin.add(Username);
		Username.setLayout(null);

		Userpass = new JTextField();
		Userpass.setText("Password :");
		Userpass.setForeground(Color.WHITE);
		Userpass.setFont(new Font("Tahoma", Font.BOLD, 12));
		Userpass.setColumns(10);
		Userpass.setBorder(null);
		Userpass.setBackground(new Color(23, 26, 33));
		Userpass.setBounds(69, 202, 86, 20);
		UserLogin.add(Userpass);

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

		txtUsename = new JTextField();
		txtUsename.setText("Username :");
		txtUsename.setForeground(Color.WHITE);
		txtUsename.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtUsename.setColumns(10);
		txtUsename.setBorder(null);
		txtUsename.setBackground(new Color(23, 26, 33));
		txtUsename.setBounds(69, 152, 76, 20);
		UserLogin.add(txtUsename);

		// PASSWORD
		JPanel Password = new JPanel();
		Password.setBorder(null);
		Password.setBackground(new Color(51, 53, 61));
		Password.setForeground(new Color(0, 0, 0));
		Password.setBounds(158, 193, 250, 40);
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
		txtPassword.setBackground(new Color(53, 56, 60));
		txtPassword.setBorder(null);
		txtPassword.setEchoChar((char) 0);
		txtPassword.setText("Password");
		txtPassword.setBounds(10, 11, 170, 20);
		Password.add(txtPassword);

		// LOGIN

		LoginBotton = new JButton("Sign In");
		LoginBotton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDialog.setDefaultLookAndFeelDecorated(true);
				// kung tama
				if (txtUsername.getText().equals("admin") && txtPassword.getText().equals("admin123")) {
					loginMassage2.setText("Login Succesfully!");
					JOptionPane.showMessageDialog(null, "Login Succesfull!");
					oopconcept MenuLogin = new oopconcept();
					MenuLogin.setVisible(true);
					oopLogin.this.dispose();
					// kung walay gibutang
				} else if (txtUsername.getText().equals("") || txtUsername.getText().equals("Username")
						|| txtPassword.getText().equals("") || txtPassword.getText().equals("Password")) {
					loginMassage.setText("Please Input Your User and Password!");
					System.out.println("***Login Click***");
					// kung mali
				} else {
					loginMassage.setText("Username and Password didn't match");

				}

			}

		});
		LoginBotton.setBounds(158, 268, 120, 40);
		UserLogin.add(LoginBotton);

		// EXIT BUTTON

		Exit = new JButton("Exit");
		Exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JDialog.setDefaultLookAndFeelDecorated(true);
				System.out.println("X botton clicked");
				if (JOptionPane.showConfirmDialog(null, "Are you sure you want to close this application",
						"Confirmation", JOptionPane.YES_NO_OPTION) == 0)
					;
				System.out.println("***Application Close***");
				oopLogin.this.dispose();
			}

			public void mouseEntered(MouseEvent e) {
				Exit.setForeground(Color.RED);

			}

			public void mouseExited(MouseEvent e) {
				Exit.setForeground(Color.WHITE);

			}

		});
		Exit.setBounds(288, 268, 120, 40);
		UserLogin.add(Exit);

		txtSign = new JTextField();
		txtSign.setBorder(null);
		txtSign.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtSign.setForeground(new Color(30, 144, 255));
		txtSign.setText("SIGN IN WITH ACCOUNT NAME");
		txtSign.setBackground(new Color(23, 26, 33));
		txtSign.setBounds(69, 110, 223, 20);
		UserLogin.add(txtSign);
		txtSign.setColumns(10);

		// Pag click sa Login Error
		loginMassage.setHorizontalTextPosition(SwingConstants.CENTER);
		loginMassage.setHorizontalAlignment(SwingConstants.CENTER);
		loginMassage.setFont(new Font("Arial", Font.BOLD, 12));
		loginMassage.setForeground(new Color(255, 0, 0));
		loginMassage.setBounds(158, 244, 250, 14);
		UserLogin.add(loginMassage);

		// Pag click sa Login Succesfull
		loginMassage2.setHorizontalAlignment(SwingConstants.CENTER);
		loginMassage2.setHorizontalTextPosition(SwingConstants.CENTER);
		loginMassage2.setForeground(new Color(0, 255, 127));
		loginMassage2.setFont(new Font("Arial", Font.BOLD, 12));
		loginMassage2.setBounds(158, 243, 250, 14);
		UserLogin.add(loginMassage2);

	}
}
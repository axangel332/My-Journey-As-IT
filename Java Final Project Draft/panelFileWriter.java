package oop;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class panelFileWriter extends JPanel {
	private JTextField textName;
	private JTextField textAge;
	private JTextField textAddress;
	private JTextField textMobile;
	private JTextField textEmail;

	public panelFileWriter() {
		setBackground(new Color(33, 35, 35));
		setBounds(0, 0, 577, 406);
		setLayout(null);
		setVisible(true);

		JLabel txtWelcome = new JLabel("People Info");
		txtWelcome.setForeground(new Color(255, 255, 255));
		txtWelcome.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		txtWelcome.setBounds(121, 73, 320, 39);
		add(txtWelcome);

		JLabel txtName = new JLabel("Name : ");
		txtName.setForeground(Color.WHITE);
		txtName.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtName.setBounds(121, 123, 344, 29);
		add(txtName);

		textName = new JTextField();
		textName.setBounds(187, 128, 208, 20);
		add(textName);
		textName.setColumns(10);

		JLabel lblAge = new JLabel("Age : ");
		lblAge.setForeground(Color.WHITE);
		lblAge.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAge.setBounds(121, 163, 56, 29);
		add(lblAge);

		textAge = new JTextField();
		textAge.setColumns(10);
		textAge.setBounds(187, 168, 208, 20);
		add(textAge);

		JLabel txtAddress = new JLabel("Address : ");
		txtAddress.setForeground(Color.WHITE);
		txtAddress.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtAddress.setBounds(121, 203, 344, 29);
		add(txtAddress);

		textAddress = new JTextField();
		textAddress.setColumns(10);
		textAddress.setBounds(187, 208, 208, 20);
		add(textAddress);

		JLabel txtMobile = new JLabel("Mobile # : ");
		txtMobile.setForeground(Color.WHITE);
		txtMobile.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtMobile.setBounds(121, 243, 344, 29);
		add(txtMobile);

		textMobile = new JTextField();
		textMobile.setColumns(10);
		textMobile.setBounds(187, 248, 208, 20);
		add(textMobile);

		JLabel lblEmail = new JLabel("Email : ");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEmail.setBounds(121, 283, 344, 29);
		add(lblEmail);

		textEmail = new JTextField();
		textEmail.setColumns(10);
		textEmail.setBounds(187, 288, 208, 20);
		add(textEmail);

		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setForeground(Color.WHITE);
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnSubmit.setBackground(new Color(0, 128, 255));
		btnSubmit.setBounds(175, 323, 238, 40);
		add(btnSubmit);
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int counter = 1;
				try {
					FileWriter writer = new FileWriter("PeopleInfo.txt");
					writer.write("\n-----People #" + counter + "------" + "\n");
					writer.write("Name : " + textName.getText() + "\n");
					writer.write("Age : " + textAge.getText() + "\n");
					writer.write("Address : " + textAddress.getText() + "\n");
					writer.write("Mobile : " + textMobile.getText() + "\n");
					writer.write("Email : " + textEmail.getText() + "\n");
					counter++;
					writer.close();

					JOptionPane.showMessageDialog(null, "User information saved.");
				} catch (IOException ex) {
					JOptionPane.showMessageDialog(null, "Error writing user information to file.");
				}

			}

		});

	}
}						
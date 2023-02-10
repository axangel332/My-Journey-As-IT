package cce;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calcu extends JFrame implements ActionListener {


	private static final long serialVersionUID = 1L;
	private Container con = getContentPane();
	JLabel text1num = new JLabel("First Number :");
	JLabel prompt2 = new JLabel("Second Number :");
	JTextField input = new JTextField(20);
	JTextField input2 = new JTextField(20);

	JButton add = new JButton("Add");
	private final JLabel lblResult = new JLabel("Result :");
	private final JLabel lblCalcuSum = new JLabel("Sum Calculator");
	private final JLabel result = new JLabel("");

	public Calcu() {

		super("Calculator");
		getContentPane().setBackground(new Color(23, 26, 33));
		setUndecorated(true);
		setSize(300, 300);
		result.setForeground(Color.WHITE);
		result.setBounds(255, 42, -219, 20);
		text1num.setForeground(Color.WHITE);
		text1num.setBounds(25, 89, 100, 16);
		prompt2.setForeground(Color.WHITE);
		prompt2.setBounds(7, 120, 228, 16);
		result.setBounds(255, 62, 0, 0);
		getContentPane().setLayout(null);
		con.setLayout(null);
		setLocationRelativeTo(null);

		con.add(text1num);
		input.setBounds(108, 88, 166, 20);
		con.add(input);
		con.add(prompt2);
		input2.setBounds(108, 119, 166, 20);
		con.add(input2);
		add.setBounds(54, 147, 81, 23);
		con.add(add);
		con.add(result);
		lblResult.setForeground(new Color(255, 255, 255));

		lblResult.setBackground(new Color(240, 240, 240));
		lblResult.setHorizontalAlignment(SwingConstants.CENTER);
		lblResult.setFont(new Font("Dialog", Font.BOLD, 14));
		lblResult.setBounds(54, 181, 181, 32);

		getContentPane().add(lblResult);
		lblCalcuSum.setForeground(Color.WHITE);
		lblCalcuSum.setHorizontalAlignment(SwingConstants.CENTER);
		lblCalcuSum.setFont(new Font("Dialog", Font.BOLD, 14));
		lblCalcuSum.setBounds(69, 46, 157, 16);

		getContentPane().add(lblCalcuSum);
		result.setHorizontalAlignment(SwingConstants.CENTER);
		result.setFont(new Font("Tahoma", Font.BOLD, 15));
		result.setBounds(36, 208, 228, 58);

		getContentPane().add(result);
		add.addActionListener(this);

		JButton ClearButton = new JButton("Go Back");
		ClearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

					JDialog.setDefaultLookAndFeelDecorated(true);
					System.out.println("X botton clicked");
					if (JOptionPane.showConfirmDialog(null, "This will log you out of steam. "
							+ "\n"
							+ "\n" + "Do you wish to continue?",
							"Confirmation", JOptionPane.YES_NO_OPTION) == 0)
						;
					Lab5_Sumalan loginproject = new Lab5_Sumalan();
					loginproject.setVisible(true);
					Calcu.this.dispose();
				}
				public void mouseEntered(MouseEvent e) {
					ClearButton.setForeground(Color.RED);
				}

				public void mouseExited(MouseEvent e) {
					ClearButton.setForeground(Color.WHITE);

				}

			});

		ClearButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JDialog.setDefaultLookAndFeelDecorated(true);
				if (JOptionPane.showConfirmDialog(null, "Are you sure you want to close this application",
						"Confirmation", JOptionPane.YES_NO_OPTION) == 0)
					;
				System.out.println("***Application Close***");
				Calcu.this.dispose();
			}
		});

		ClearButton.setBounds(145, 147, 84, 23);
		getContentPane().add(ClearButton);

	}

	public static void main(String[] args) {

		Calcu demo = new Calcu();
		demo.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Object source = e.getSource();
		if (source == add) {
			String ans1 = input.getText();
			int num1 = Integer.parseInt(ans1);
			String ans2 = input2.getText();
			int num2 = Integer.parseInt(ans2);

			int RESULT = num1 + num2;
			String res = new Integer(RESULT).toString();
			result.setText(num1 + " + " + num2 + " = " + res);

		}

	}
}
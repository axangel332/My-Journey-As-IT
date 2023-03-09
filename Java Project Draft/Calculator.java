package oop;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.SystemColor;

public class Calculator extends JPanel {
	private JTextField input1;
	private JTextField input2;

	public Calculator() {
		setBackground(new Color(33, 35, 35));
		setBounds(0, 0, 577, 406);
		setLayout(null);
		setVisible(true);
		
		JLabel lblWelcome = new JLabel("Calculator");
		lblWelcome.setForeground(new Color(255, 255, 255));
		lblWelcome.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcome.setBounds(139, 43, 344, 89);
		add(lblWelcome);
		
		JLabel result = new JLabel("");
		result.setHorizontalAlignment(SwingConstants.CENTER);
		result.setForeground(Color.WHITE);
		result.setFont(new Font("Tahoma", Font.BOLD, 15));
		result.setBounds(177, 309, 228, 58);
		add(result);
		
		JLabel lblResult = new JLabel("Result :");
		lblResult.setHorizontalAlignment(SwingConstants.CENTER);
		lblResult.setForeground(Color.WHITE);
		lblResult.setFont(new Font("Dialog", Font.BOLD, 14));
		lblResult.setBackground(SystemColor.menu);
		lblResult.setBounds(203, 266, 181, 32);
		add(lblResult);
		
		input1 = new JTextField(20);
		input1.setBounds(257, 129, 166, 20);
		add(input1);
		
		input2 = new JTextField(20);
		input2.setBounds(257, 160, 166, 20);
		add(input2);
		
		JLabel SecondTxt = new JLabel("Second Number :");
		SecondTxt.setFont(new Font("Tahoma", Font.BOLD, 12));
		SecondTxt.setForeground(Color.WHITE);
		SecondTxt.setBounds(139, 164, 228, 16);
		add(SecondTxt);
		
		JLabel FirstText = new JLabel("First Number :");
		FirstText.setFont(new Font("Tahoma", Font.BOLD, 12));
		FirstText.setForeground(Color.WHITE);
		FirstText.setBounds(158, 130, 100, 16);
		add(FirstText);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input1.setText(" ");
				input2.setText(" ");
				result.setText(" ");
			}
		});
		btnClear.setBounds(444, 144, 84, 23);
		add(btnClear);
		
		JButton btnSubtract = new JButton("Subtract");
		btnSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object source = e.getSource();
				if (source == btnSubtract) {
					String ans1 = input1.getText();
					int num1 = Integer.parseInt(ans1);
					String ans2 = input2.getText();
					int num2 = Integer.parseInt(ans2);

					int RESULT = num1 - num2;
					String res = new Integer(RESULT).toString();
					result.setText(num1 + " - " + num2 + " = " + res);
				}
			}
		});
		btnSubtract.setBounds(230, 214, 81, 23);
		add(btnSubtract);
		
		JButton add_1 = new JButton("Add");
		add_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object source = e.getSource();
				if (source == add_1) {
					String ans1 = input1.getText();
					int num1 = Integer.parseInt(ans1);
					String ans2 = input2.getText();
					int num2 = Integer.parseInt(ans2);

					int RESULT = num1 + num2;
					String res = new Integer(RESULT).toString();
					result.setText(num1 + " + " + num2 + " = " + res);
				}
			}
		});
		add_1.setBounds(321, 214, 81, 23);
		add(add_1);
		
		JButton btnDivide = new JButton("Divide");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object source = e.getSource();
				if (source == btnDivide) {
					String ans1 = input1.getText();
					int num1 = Integer.parseInt(ans1);
					String ans2 = input2.getText();
					int num2 = Integer.parseInt(ans2);

					int RESULT = num1 / num2;
					String res = new Integer(RESULT).toString();
					result.setText(num1 + " / " + num2 + " = " + res);
				}
			}
		});
		btnDivide.setBounds(412, 214, 81, 23);
		add(btnDivide);
		
		JButton btnMultiply = new JButton("Multiply");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object source = e.getSource();
				if (source == btnMultiply) {
					String ans1 = input1.getText();
					int num1 = Integer.parseInt(ans1);
					String ans2 = input2.getText();
					int num2 = Integer.parseInt(ans2);

					int RESULT = num1 * num2;
					String res = new Integer(RESULT).toString();
					result.setText(num1 + " * " + num2 + " = " + res);
				}
			}
		});
		btnMultiply.setBounds(139, 214, 81, 23);
		add(btnMultiply);
		
	}
}
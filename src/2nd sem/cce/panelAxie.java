package cce;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class panelAxie extends JPanel {

	/**
	 * Create the panel.
	 */
	public panelAxie() {
		setBackground(new Color(33, 35, 35));
		setBounds(0, 0, 577, 406);
		setLayout(null);
		setVisible(true);
		
		JLabel lblNewLabel = new JLabel("WELCOME TO AXIE INFINITY!!");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 577, 406);
		add(lblNewLabel);

	}

}
